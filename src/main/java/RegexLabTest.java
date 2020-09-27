import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLabTest {

    @Test
    public void SimpleRegexTest(){
        String pattern = "http(s|)://.+";
        String str = "https://.";
        boolean istrue = Pattern.matches(pattern,str);
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.find());
        System.out.println(istrue);
    }
}
