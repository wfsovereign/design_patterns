package level2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class AssistantHandler implements InvocationHandler {
    private Object targetObject;

    public AssistantHandler(Object targetObject){
        this.targetObject = targetObject;
    }
//    public Object createProxy(Object targetObject){
//        this.targetObject = targetObject;
//        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
//                targetObject.getClass().getInterfaces(),this);
//    }



    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("send to leader");
        Object result = method.invoke(this.targetObject,objects);
        System.out.println("receive from leader");
        return result;
    }
}
