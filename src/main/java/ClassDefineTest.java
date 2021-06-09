import org.junit.Test;

public class ClassDefineTest {
    public B objectB = new B();
    @Test
    public void test(){
        ClassDefineTest test = new ClassDefineTest();
        test.objectB.b = "dd";
        System.out.printf("%s", test.objectB.b);
    }
    class B{
        public String b = "b";
    }


}


