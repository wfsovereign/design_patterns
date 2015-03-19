package level1;

import java.util.Date;

/**
 * Created by wfsovereign on 15-3-19.
 */
public abstract class Builder {
    protected AutoMessage msg;

    public abstract void buildSubject();
    public abstract void buildBody();
    public void buildTo(String to){
        msg.setTo(to);
    }
    public void buildFrom(String from){
        msg.setFrom(from);

    }
    public void buildSendDate(){
        msg.setSendDate(new Date());
    }
    public void sendMessage(){
        msg.send();
    }
}
