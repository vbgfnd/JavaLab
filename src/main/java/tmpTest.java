import com.codingapi.coding.v20191021.CodingClient;
import com.codingapi.coding.v20191021.models.CreateTeamRequest;
import com.codingapi.coding.v20191021.models.CreateTeamResponse;
import com.codingapi.common.Credential;
import com.codingapi.common.exception.CodingSDKException;
import com.codingapi.common.profile.ClientProfile;
import com.codingapi.common.profile.HttpProfile;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStreamReader;
import java.util.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Properties;

public class tmpTest {
    @Test
    public void test() throws CodingSDKException {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户 secretId、secretKey，此处还需注意密钥对的保密
            Credential cred = new Credential("123456", "123456");

            // 实例化一个 http 选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); // get 请求(默认为post请求)
            httpProfile.setProtocol("http://");  // 在外网互通的网络环境下支持 http 协议（默认是 https 协议），请选择(https:// or http://)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒（默认60秒）
            httpProfile.setWriteTimeout(30);  // 设置写入超时时间，单位为秒（默认0秒）
            httpProfile.setReadTimeout(30);  // 设置读取超时时间，单位为秒（默认0秒）
            httpProfile.setEndpoint("10.94.100.91:8080"); // 指定接入地域域名（默认就近接入）
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod("TC3-HMAC-SHA256"); // 指定签名算法（默认为 HmacSHA256）
            clientProfile.setHttpProfile(httpProfile);
            CodingClient client = new CodingClient(cred, "ap-shanghai", clientProfile);
            CreateTeamRequest request = new CreateTeamRequest();
            request.setDomain("dcloud-coding-test");
            request.setTeamName("dcloud-coding-test");
            request.setPassword("44fa01c1f22c2a7b3c7cd18000c1dfed3f837552");
            request.setPhone("13415211668");
            request.setEmail("71717171712@qq.com");
            CreateTeamResponse resp = client.CreateTeam(request);
            // 输出 json 格式的字符串回包
            System.out.println("ddd");
            System.out.println(resp.toString());
            Assert.assertEquals(1,0);

        } catch (CodingSDKException e) {
            System.out.println(e.toString());
            System.out.println("ddd");
        }
    }

    @Test
    public void test1(){
        String CONFIG_PATH = System.getProperty("config.path", "config.properties");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL appResourceURL = loader.getResource(CONFIG_PATH);

        Properties props = new Properties();
        try (InputStreamReader is = new InputStreamReader(appResourceURL.openStream(), "UTF-8")) {
            props.load(is);
        } catch (IOException e) {
            System.err.println("Fail to load config: " + CONFIG_PATH);
        }
        for(int i = 1; i <= 2; i++){
            String a = props.getProperty(String.format("case%d", i));
            System.out.printf("a=%s \n", a);
        }

    }

    @Test
    public void ObjectConvertTest(){
        Object ob = 1;
        System.out.printf("class=%s", ob.getClass().getSimpleName());
        int i = (int)ob;
        System.out.println((int)ob);

        ob = new A("b");
        System.out.printf("class=%s", ob.getClass().getSimpleName());
        A a = (A)ob;
        a.test();
    }


}
