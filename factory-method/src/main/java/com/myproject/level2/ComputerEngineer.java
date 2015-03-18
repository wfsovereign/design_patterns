package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class ComputerEngineer {
    private Cpu cpu = null;
    private Mainboard mainboard = null;


    public void makeComputer(AbstractFactory af){
        preparHardwares(af);
    }

    private void preparHardwares(AbstractFactory af) {
        this.cpu = af.createCpu();
        this.mainboard = af.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
