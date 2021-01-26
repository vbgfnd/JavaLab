import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    @Test
    /***
     * 测试List 排序
     */
    public void CollectionTest(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(3);
        list2.add(1);

        System.out.printf(String.format("list1=%s,list2=%s", list1.toString(), list2.toString()));
        System.out.printf(String.format("list1==list2?:%s", list1.equals(list2)));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.printf(String.format("list1=%s,list2=%s", list1.toString(), list2.toString()));
        System.out.printf(String.format("list1==list2?:%s", list1.equals(list2)));
    }
}
