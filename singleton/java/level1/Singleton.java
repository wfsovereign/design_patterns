package level1;

/**
 * Created by wfsovereign on 15-3-24.
 */
public class Singleton {
    private static Singleton instance  = null;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {}

    public void doSomething(){
        System.out.println("'how are you'");
    }
}