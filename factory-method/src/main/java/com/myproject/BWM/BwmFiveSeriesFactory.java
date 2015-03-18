package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmFiveSeriesFactory implements CarFactory{


    @Override
    public CarFrame createCarFrame() {
        return new BwmFiveSeriesCarFrame("中大型车", new int[]{5047,1860,1491},"4门5座三厢车");
    }

    @Override
    public Engine createEngine() {
        return new BwmFiveSeriesEngine("2.0T");
    }

    @Override
    public Gearbox createGearbox() {
        return new BwmFIveSeriesGearbox("8挡手自一体");
    }
}
