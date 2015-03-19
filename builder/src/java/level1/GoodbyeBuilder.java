package level1;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class GoodbyeBuilder extends Builder {
    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    @Override
    public void buildSubject() {
        msg.setSubject("goodbye subject info");
    }

    @Override
    public void buildBody() {
        msg.setBody("goodbye body");
    }
}
