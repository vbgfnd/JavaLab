import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.path.json.JsonPath.with;

public class TMP {
    Map<String, String> eventsMap = new HashMap<>();
    public void aClose(A a){
        a.close();
        System.out.printf("%s", a.close);
    }

    @Test
    public void test(){
        System.out.println(eventsMap.isEmpty());
    }

    @Test
    public void test1(){
        int INT = 1;
        String str = "hapi";
        boolean boolval = true;
        double f = 1.0;
        Map<String, Object> map = new HashMap<>();

        map.put("int", INT);
        map.put("String", str);
        map.put("bool", boolval);
        map.put("double", f);

        for(Map.Entry<String, Object> entry : map.entrySet()){
            System.out.printf("key=%s,kindof=%s\n", entry.getKey(), entry.getValue().getClass().getSimpleName());
        }
    }

    /**
     * 【尝试动态生成类对象】
     */
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        A a = new B();

        Class<?> ccc = a.getClass();
        Object ob = ccc.newInstance();
        Method method = ob.getClass().getDeclaredMethod("test");
        method.invoke(ob);
        Field[] fields = a.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.printf("type=%s\n", fields[i].getType().toString());
            System.out.printf("name=%s\n", fields[i].getName());
        }

    }
 /*   @Test
    public void test2(){
        //A a = new A("d");
        System.out.println(a.close);
        aClose(a);
        a.testClose(a);
        System.out.println(a.close);
    }*/

    @Test
    public void test3(){
        Object ob = new Object();
        ob = 1;
        System.out.println(ob.getClass().getSimpleName());

        ob = true;
        System.out.println(ob.getClass().getSimpleName());

        ob = "str";
        System.out.println(ob.getClass().getSimpleName());
    }

    @Test
    public void test4() throws IOException {
        String path = System.getProperty("user.dir");
        String CONFIG_PATH = path + "/src/main/java/test.json";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONFIG_PATH)));
        String line;
        String str = "";
        while((line = bufferedReader.readLine()) != null){
            str += line.replaceAll("\u00A0", "");
        }
        bufferedReader.close();
        System.out.println(str);

        String str2 = with(str).get("code").toString();
        System.out.println(str2);
    }

}
