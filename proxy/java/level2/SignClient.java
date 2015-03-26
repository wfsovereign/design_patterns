package level2;

import java.lang.reflect.Proxy;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class SignClient {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Leader assistant = new Assistant(ceo);
        assistant.sign();


        System.out.println("===================");
        AssistantHandler assistantHandler = new AssistantHandler(ceo);

        Leader proxy = (Leader) Proxy.newProxyInstance(Leader.class.getClassLoader(),
                new Class[]{Leader.class},assistantHandler);
        proxy.sign();

    }
}
