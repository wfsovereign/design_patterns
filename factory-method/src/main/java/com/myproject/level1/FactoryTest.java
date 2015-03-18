package com.myproject.level1;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
        Provider provider1 = new SendSmsFactory();
        sender = provider1.produce();
        sender.Send();

    }
}
