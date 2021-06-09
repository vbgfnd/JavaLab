import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class StringLabTest {
    //测试删除字串内指定字符
    @Test
    public void StringReplace(){
        String str = "22.33.44.55";
        String str2 = str.replace(".","");
        System.out.println(str2);

        str = "{1{dd}23}";
        str2 = str.replaceFirst("^\\{","");
        str2 = str2.replaceFirst("\\}$","");
        System.out.println(str2);
    }
    @Test
    public void StringFillDoubleQuote(){
        String str = "aaabbbccc";
        String str2 = str.replace("b","\"");
        System.out.println(str2);
    }
    @Test
    public void StringIndexTest(){
        String str = "abca";
        System.out.println(str.substring(0,1));
    }
    //测试 http://xxx.xxx/aaa 去掉 /aaa 算法
    //	indexOf(String str, int fromIndex)
    @Test
    public void StringTest1(){
        String str = "http://a/ss";
        Integer index = str.indexOf("/",8);
        System.out.println(index );
        str = str.substring(index,str.length());
        System.out.println(str);
        //减去字串不能用replace，容易引发如下bug
        //String str2 = str.replace(str1, "");
        //System.out.println(str2);
        String str2 = str.substring(0,index);
        System.out.println(str2);
    }

    //测试split
    @Test
    public void SplitTest(){
        String str = "https//a";
        String[] arrStr = str.split("//");
        System.out.println("arrStr="+arrStr);
        String str1 = arrStr[0];
        String str2 = arrStr[1];
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
    }

    @Test
    public void StringAarryTest(){
        String[] str = {"dd", "cc"};
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));

        System.out.printf("%s", list.toString());
    }
    @Test
    //测试字符串中的空是不是""表示
    public void StringTest3() throws UnsupportedEncodingException {
        /*String a = "";
        String b = String.format("abc:%sccc", a);
        System.out.println(b);
        a = "bbb";
        b = String.format("abc:%sccc", a);
        System.out.println(b);*/

        String url = "https://www.xte123st.com/?key=";
        String xx = URLEncoder.encode(url, "UTF-8");
        System.out.println(url);
        System.out.println(xx);


    }
    @Test
    public void StringTest4(){
        String str = "null";

        //System.out.println(str.isEmpty());
        //System.out.println(str.toString());
        System.out.println(str);
    }
}
