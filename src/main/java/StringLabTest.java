import org.junit.Test;

public class StringLabTest {
    //测试删除字串内指定字符
    @Test
    public void StringReplace(){
        String str = "22.33.44.55";
        String str2 = str.replace(".","");
        System.out.println(str2);
    }
    @Test
    public void StringReplace1(){

    }
}
