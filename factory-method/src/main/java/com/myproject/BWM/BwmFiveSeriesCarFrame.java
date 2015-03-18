package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmFiveSeriesCarFrame implements CarFrame {

    private final String emissions;

    public BwmFiveSeriesCarFrame(String emissions){
        this.emissions = emissions;
    }

    @Override
    public void carFrameSelfChecking() {
        System.out.println("this BWM Five Series Car, it's emissions is "+this.emissions);
    }
}
