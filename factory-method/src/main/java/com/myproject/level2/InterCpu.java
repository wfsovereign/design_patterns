package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class InterCpu implements Cpu {
    private int pins = 0;
    public InterCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
