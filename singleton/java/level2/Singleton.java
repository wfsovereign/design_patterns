package level2;

/**
 * Created by wfsovereign on 15-3-24.
 */
public class Singleton {
    private static Singleton instance  = null;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        /*
        * 首先检测null操作，如果存在则返回instance，不存在，就给创建instance的代码块上锁
        * 但是这样也会有bug，创建一个变量，需要申请一块内存，调用构造方法进行初始化，分配一个指针指向这块内存
        * 然而，由于JVM没有规定编译器优化的内容，导致其可自由进行优化，在不改变原来语义的情况下，通过调整语句顺序，来让程序运行的更快。
        * 当A线程开始创建Singleton实例时，B线程调用getInstance（）方法检测null时，假如此时的A已经将instance指向了那块内存，
        * 但还没有赋值，那么B线程检测null时会直接返回instance，但是instance的构造并没有完成，程序便出错了
        * */
        return instance;
    }

    private Singleton() {}

    public void doSomething(){
        System.out.println("'how are you'");
    }
}
