import io.restassured.path.json.JsonPath;
import org.junit.Test;

public class JsonPathLabTest {
    public String str1 = " {Response={RequestId=4ccc4928-161d-44bc-a06a-ddd9c471f2a1, Error={Message=The request content not valid json format for specified content-type=application/json., Code=InvalidParameter}}}";
    public String strJson = "{\n" +
            "    \"totalpages\":\"1\",\n" +
            "    \"currpage\":\"1\",\n" +
            "    \"totalrecords\":\"31\"}";

    @Test
    public void JsonPathParseString(){
        JsonPathLabTest jsonPathLab = new JsonPathLabTest();
        String str2 = JsonPath.with(jsonPathLab.strJson).get().toString();
        System.out.println(str2);
    }

}
