
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    //以当前日期为基础，获取一个任意向前或向后的日期
    @Test
    public void getAnyCalendarTest(){
        //1.
        Date date1 = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY-MM-dd");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        System.out.println("Calendar.MONTH="+calendar1.get(Calendar.MONTH));
        calendar1.set(Calendar.MONTH,calendar1.get(Calendar.MONTH));
        System.out.println("calendar1 month="+dateFormat1.format(calendar1.getTime()));
        calendar1.set(Calendar.MONTH,calendar1.get(Calendar.MONTH)-1);
        System.out.println("calendar1 -1 month="+dateFormat1.format(calendar1.getTime()));
    }

}
