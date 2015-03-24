package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */


public interface CarFactory {
    public CarFrame createCarFrame();
    public Engine createEngine();
    public Gearbox createGearbox();
}
