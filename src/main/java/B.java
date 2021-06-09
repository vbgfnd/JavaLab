public class B extends A{

    B(){
      super("a");
    }

    public void test(){
        System.out.printf("%s", str_a);
        System.out.printf("%s", super.str_a);
        //super.test();
    }
    public void test1(){
        super.test();
    }
}
