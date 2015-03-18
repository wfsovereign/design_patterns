package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmXSixFactory implements CarFactory {
    @Override
    public CarFrame createCarFrame() {
        return new BwmXSixCarFrame("中大型SUV",new int[]{4929,1983,1709},"5门5座SUV");
    }

    @Override
    public Engine createEngine() {
        return new BwmXSixEngine("3.0T");
    }

    @Override
    public Gearbox createGearbox() {
        return new BwmXSixGearbox("8挡手自一体");
    }
}
