import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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


}
