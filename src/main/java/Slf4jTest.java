import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
    @Test
    public void slf4jTest(){
        Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
        logger.error("hello world");
    }

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
        logger.info("hello world");
    }
}
