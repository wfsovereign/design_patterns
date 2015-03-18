package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmFiveSeriesEngine implements Engine {

    private final String emissions;

    public BwmFiveSeriesEngine(String emissions){
        this.emissions = emissions;
    }

    @Override
    public void createEngine() {
        System.out.println("this is BWMFiveSeriesEngine it's emissions is "+this.emissions);
    }
}
