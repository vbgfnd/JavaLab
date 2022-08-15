package Yaml;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class YamlParseTest {
    public static void test() throws IOException {
        Yaml yaml = new Yaml();
        InputStream input = new FileInputStream(new File("src/main/resources/config.yaml"));
        int count = 0;
        Object data = yaml.load(input);
        input.close();

        System.out.println(data);

        Map<String, Object> map =  (Map<String, Object>) data;
        System.out.println(map.get("userinfo"));
    }


    @Test
    public void yamlParseTest() throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream input = new FileInputStream(new File("src/main/resources/config.yaml"));
        int count = 0;
        for(Object data : yaml.loadAll(input)){
            System.out.println(data);

            Map<String, Object> map = (Map<String, Object>) data;
            System.out.println(map.get("userinfo"));
            System.out.println(map.get("baseURI"));

            Map<String, Map<String, String>> map1 = (Map<String, Map<String, String>>)map.get("userinfo");
            System.out.println(map1.get("owner").get("email"));




            count++;
        }
        System.out.println(count);
    }
    @Test
    public void test2() throws IOException {
        YamlParseTest.test();
    }
}
