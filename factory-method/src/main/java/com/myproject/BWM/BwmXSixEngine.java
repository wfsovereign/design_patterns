package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmXSixEngine implements Engine {

    private String emissions;

    public BwmXSixEngine(String emissions){

        this.emissions = emissions;
    }

    @Override
    public void createEngine() {
        System.out.println("this BWM XDrive engine,and emissions is "+ this.emissions);
    }
}
