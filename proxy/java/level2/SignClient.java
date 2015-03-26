package level2;

import java.lang.reflect.Proxy;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class SignClient {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Leader boss = new Assistant(ceo);
        boss.sign();


        System.out.println("===================");
        AssistantHandler assistant = new AssistantHandler(ceo);

        Leader assistantProxy = (Leader) Proxy.newProxyInstance(Leader.class.getClassLoader(),
                new Class[]{Leader.class},assistant);
        assistantProxy.sign();

    }
}
