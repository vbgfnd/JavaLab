public class A {
    int i = 123;
    public final String str_a = this.getClass().getName();
    String str_b = "";
    public A(String b){
        this.str_b = b;
    }

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
}
