import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

public class MapLabTest {

    @Test
    public void testMapFunctions(){
        Map<String,Object> hashmap = new HashMap<>(1);
        hashmap.put("1",getDrawInstance());
        System.out.println(hashmap.get("1").toString());

    }
    private Draw getDrawInstance(){
        return new Draw();
    }
    class Draw{
        String str1 = "a";
        Integer int1 = 1;
    }

    public void testMap(Map<String, String> a){
        a.put("testMap", "testMap");
    }

    @Test
    public void test(){
        Map<String, String>map = new HashMap<>();
        Map<String, String>map1;


        System.out.println(map.isEmpty());

    }
}
