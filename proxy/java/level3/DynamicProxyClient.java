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
        /*
        * 返回的是Proxy的Class类
        * return sm != null && Proxy.ProxyAccessHelper.needsNewInstanceCheck(cl)?AccessController
        * .doPrivileged(new PrivilegedAction() {
        * public Object run() {
        * return Proxy.newInstance(e, h);
        * }
        * */

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
        /*
        * before ----------public abstract void level3.AbstractSubject.request()
        * real subject's request()........
        * after ----------public abstract void level3.AbstractSubject.request()
        * */

        /*为什么调用proxy的request（）方法就能调用DynamicProxy中的invoke（）方法，
        *因为proxy是属于Proxy类的，因为他的类是com.sun.proxy.$Proxy0，是继承了Proxy类的，
        *而在$Proxy0中重写了request（）方法，并且调用了父类中h的invoke方法，而在父类Proxy中，
        *h是这样定义的
          *     protected InvocationHandler h;
          *     也就是说调用的是InvocationHandler.invoke（）方法，
          *     而DynamicProxy又实现了InvocationHandler接口的invoke（）方法，
          *     因此，最后调用的便是DynamicProxy中的invoke（）方法。
          *     这也就是java内置的动态代理实现机制。
          *     */


     }
}
