import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Field;
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

    @Test
    public void reflectionTest1(){
        C c = new C();
        Field[] fields = c.getClass().getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            System.out.println(field.getType().getSimpleName());
        }
    }

    @Test
    public void relectionTest3(){
        Class c1 = int.class;
        System.out.println(c1.getName());

        Class c2 = Integer.class;
        System.out.println(c2.getName());

        Class c3 = Integer[].class;
        System.out.println(c3.getName());


    }
}
