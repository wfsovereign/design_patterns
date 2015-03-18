package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class Provider {

    private CarFrame carFrame;
    private Engine engine;
    private Gearbox gearbox;

    public void  provideServerce(CarFactory cf){
        showCar(cf);
    }

    private void showCar(CarFactory cf) {
        this.carFrame = cf.createCarFrame();
        this.engine = cf.createEngine();
        this.gearbox = cf.createGearbox();

        this.carFrame.carFrameSelfChecking();
        this.gearbox.gearboxSelfChecking();
        this.engine.createEngine();

    }
}
