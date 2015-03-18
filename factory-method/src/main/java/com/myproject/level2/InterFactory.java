package com.myproject.level2;

import java.util.AbstractCollection;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class InterFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new InterCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new InterMainboard(755);
    }
}
