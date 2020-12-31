import org.junit.Test;

import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void reflectionTest(){
        Class<?> class1 = DateTest.DateBaby.class;
        Method[] methods = class1.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.toString());
            System.out.println(methods.length);
        }
    }
}
