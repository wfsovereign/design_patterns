package com.myproject.level1;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender");
    }
}
