package com.myproject.level1;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class SendFactory {
    public static Sender productMail(){
        return  new MailSender();
    }

    public static Sender productSms(){
        return new SmsSender();
    }
}
