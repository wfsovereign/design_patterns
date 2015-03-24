package level3;

/**
 * Created by wfsovereign on 15-3-24.
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

/*
* 使用java静态内部类，JVM能够保证当一个类被加载时，这个加载过程是想成互斥的。
* 调用getInstance（）方法时，首先加载SingletonInstance类，这个类有一个static实例，所以需要调用Singleton的构造方法，
* 最后getInstance将这个instance返回给使用者
* */
    public void doSomething(){
        System.out.println("'how are you'");
    }
}
