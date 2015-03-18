package com.myproject.level1;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
