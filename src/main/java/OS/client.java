package OS;

import service.SayHello.*;

public class client {
    public static void main(String[] args) {
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl webService = factory.getWebServiceImplPort();
        String result = webService.sayHello();
        System.out.println(result);
    }
}
/**
 * @program: WsClient
 * @description:
 * @author: Dainy33
 * @create: 2018-12-27 17:33
 **/
