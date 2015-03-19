package level1;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("wfsovereign@outlook.com","Boyang@outloock.com");
        Builder builder1 = new GoodbyeBuilder();
        director = new Director(builder1);
        director.construct("Boyang@outloock.com","wfsovereign@outlook.com");
    }
}
