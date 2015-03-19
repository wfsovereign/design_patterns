package level1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wfsovereign on 15-3-19.
 */
public abstract class AutoMessage {
    private String to;
    private String from;
    private String subject;
    private String body;
    private String sendDate;
    public void send(){
        System.out.println("收件人地址：" + to);
        System.out.println("发件人地址：" + from);
        System.out.println("标题：" + subject);
        System.out.println("内容：" + body);
        System.out.println("发送日期：" + sendDate);
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setSendDate(Date date) {
        SimpleDateFormat formatter ;
        formatter =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.sendDate = formatter.format(date);

    }

    public void setBody(String s) {
        this.body = s;
    }

    public void setSubject(String s) {
        this.subject = s;
    }
}
