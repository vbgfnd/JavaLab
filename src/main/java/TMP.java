import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TMP {
    Map<String, String> eventsMap = new HashMap<>();

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
}
