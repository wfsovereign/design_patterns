package level1;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
