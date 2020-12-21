import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import org.junit.Test;
import com.google.gson.JsonParser;

public class JsonLabTest {
    @Test
    public void JsonObjectTest(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("cat","i");
        System.out.println(jsonObject);

        jsonObject.addProperty("str",1);
        System.out.println(jsonObject);

        JsonObject tmpJsonObj = new JsonObject();
        tmpJsonObj.addProperty("num","dd,dd");
        jsonObject.add("json",tmpJsonObj);
        System.out.println(jsonObject.toString());

        JsonObject tmpJsonObj2 = new JsonObject();
        System.out.println(tmpJsonObj2);
        String str = tmpJsonObj2.toString();
        System.out.println(str);
    }

    @Test
    public void getClassTest(){
        JsonObject json = new JsonObject();
        System.out.println(json.getClass().getClass());
    }

    @Test
    public void getJsonAarrayVal(){
        String json = "{  " +
                "\"ProjectId\":604800," +
                "\"Type\":90," +
                "\"UserGlobalKeyList\":[\"TuHpRkiHZx\"]" +
                "}";
        JsonElement jsonElement = new JsonParser().parse(json);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        System.out.println(jsonObject.toString());

        String json2 = "{" +
                "RegistryUser:{" +
                "\"UinId\":\"100009374021\"," +
                "\"OwnerUinId\":\"100009374013\"" +
                "}" +
                "}";
        jsonElement = new JsonParser().parse(json2);
        jsonObject = jsonElement.getAsJsonObject();
        System.out.println(jsonObject.toString());
    }
}
