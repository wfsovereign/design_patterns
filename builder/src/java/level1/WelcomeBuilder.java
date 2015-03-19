package level1;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }
    @Override
    public void buildSubject() {
        msg.setSubject("welcome subject");
    }

    @Override
    public void buildBody() {
        msg.setBody("welcome info");

    }
}
