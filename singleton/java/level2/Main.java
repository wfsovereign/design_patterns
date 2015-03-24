package level2;

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
* double-checked-locking
* */