import java.util.Date;

/**
 * Created by wfsovereign on 15-3-19.
 */
public abstract class AutoMessage {
    private String to;
    private String from;
    private String subject;
    private String body;
    private Date sendDate;
    public void send(){
        System.out.println("收件人地址：" + to);
        System.out.println("发件人地址：" + from);
        System.out.println("标题：" + subject);
        System.out.println("内容：" + body);
        System.out.println("发送日期：" + sendDate);
    }
}
