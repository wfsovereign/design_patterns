package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public interface AbstractFactory {
    public Cpu createCpu();
    public Mainboard createMainboard();
}
