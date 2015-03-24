package level1;

/**
 * Created by wfsovereign on 15-3-24.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}

/*
* 多线程不安全
* new Singleton（）时，多线程会有漏洞
* */
