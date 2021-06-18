import org.junit.Test;

public class A {
    int i = 123;
    String str_b = "123";
    //A aa = new A();

    public A(){}

    public final String str_a = this.getClass().getName();

    public void test(){
        System.out.println("A");
    }

    int close = 0;
    public A initClose(){
        return this;
    }
    public void close(){
        close += 1;
    }
    public void testClose(A a){
        a.close();
    }

    @Test
    public void test1(){
        A a = new A();
    }
}
