package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
