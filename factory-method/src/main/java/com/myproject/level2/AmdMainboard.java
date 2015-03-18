package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class AmdMainboard implements Mainboard {

    private int cpuHoles = 0;

    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
