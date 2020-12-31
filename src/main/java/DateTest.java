import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    //get current time
    @Test
    public void getCurrentTimeTest(){
        //1.Mon Dec 21 14:52:13 CST 2020
        Date date1 = new Date();
        System.out.println(date1.toString());

        //2.YYYY-MM-dd HH-MM-SS
        Date date2 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
        System.out.println(dateFormat.format(date2));

        //3.YYYY-MM-dd HH-mm-ss
        Date date3 = new Date();
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(dateFormat3.format(date3));
    }

    class DateBaby {
        public void test(){
            return ;
        }
    }
}
