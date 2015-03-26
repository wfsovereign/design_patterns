package level3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        AbstractSubject realSubject = new RealSubject();

        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();

        InvocationHandler handler = new DynamicProxy(realSubject);

        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(loader, interfaces, handler);


        System.out.println(proxy instanceof Proxy);
        System.out.println(proxy.getClass().getName());
        System.out.println("proxy的Class类是：" + proxy.getClass().toString());

        System.out.print("proxy中的属性有：");

        Field[] field = proxy.getClass().getDeclaredFields();
        for (Field f : field) {
            System.out.print(f.getName() + ", ");
        }

        System.out.print("\n" + "proxy中的方法有：");

        Method[] method = proxy.getClass().getDeclaredMethods();

        for (Method m : method) {
            System.out.print(m.getName() + ", ");
        }

        System.out.println("\n" + "proxy的父类是：" + proxy.getClass().getSuperclass());

        System.out.print("\n" + "proxy实现的接口是：");


        for (Class<?> i : interfaces) {
            System.out.print(i.getName() + ", ");
        }

        System.out.println("\n\n" + "运行结果为：");
        proxy.request();
    }
}
