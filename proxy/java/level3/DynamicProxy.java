package level3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * Created by wfsovereign on 15-3-25.
 */


public class DynamicProxy implements InvocationHandler {
    Object beProxy = null;

    public DynamicProxy(Object beProxy){
        this.beProxy = beProxy;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("before ----------"+method);
        Object result = method.invoke(this.beProxy,objects);
        System.out.println("after ----------"+method);

        return result;
    }
}
