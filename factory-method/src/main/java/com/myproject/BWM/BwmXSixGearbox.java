package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmXSixGearbox implements Gearbox {

    private String gearType;

    public BwmXSixGearbox(String gearType){

        this.gearType = gearType;
    }

    @Override
    public void gearboxSelfChecking() {
        System.out.println("this is BWM XDrive gearbox,it's type of "+ this.gearType);

    }
}
