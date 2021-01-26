import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListLabTest {
    @Test
    public void ListTest(){
        List<String> testUsers = new ArrayList<>();
        System.out.println(testUsers.size());
    }
    @Test
    public void JudgeListEqual(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(3);
        list2.add(1);

        list3.add(1);
        list3.add(2);
        list3.add(3);

        System.out.printf(String.format("list1==list2?:%s", list1.equals(list2)));
        System.out.printf(String.format("list1==list3?:%s", list1.equals(list3)));
    }
}
