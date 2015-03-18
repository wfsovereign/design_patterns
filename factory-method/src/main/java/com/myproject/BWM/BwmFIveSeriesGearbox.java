package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmFIveSeriesGearbox implements Gearbox {

    private final String gearType;

    public BwmFIveSeriesGearbox(String gearType){
        this.gearType = gearType;
    }
    @Override
    public void gearboxSelfChecking() {

    }
}
