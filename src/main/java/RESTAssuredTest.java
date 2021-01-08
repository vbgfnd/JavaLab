import io.restassured.RestAssured;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import io.restassured.filter.log.RequestLoggingFilter;


public class RESTAssuredTest {
    @Test
    public void testPostSimpleRequest(){
        //make a simple example for http request
        basePath = "/api";
        baseURI = "http://testlym6874.staging-corp.coding.io";
        String str =
        given().
        when().
                get("/current_user").asString();
        System.out.printf(str);
    }

    @Test
    //test restAssured filter function
    public void testRestAssuredLog(){
        basePath = "/api";
        baseURI = "http://testlym6874.staging-corp.coding.io";
        given().filter(new RequestLoggingFilter()).
        when().filter(new ResponseLoggingFilter()).
                get("/current_user");
    }
    @Test
    //test restAssured extract function
    public void testRestAssuredExtract(){

        basePath = "/api";
        baseURI = "http://testlym6874.staging-corp.coding.io";
        String str = given().
                when().
                    get("/current_user").
                then().extract().statusLine();
        System.out.printf(str);
    }
}
