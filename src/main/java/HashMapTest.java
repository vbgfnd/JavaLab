import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    @Test
    public void hashMapTest() {
        //HashMap how to update key
        Map<String, Object> test1 = new HashMap<>();
        test1.put("key","abc");
        test1.put("key","bbc");
        System.out.println(test1.toString());
    }
}
