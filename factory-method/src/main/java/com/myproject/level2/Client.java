package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory af = new InterFactory();
        computerEngineer.makeComputer(af);
    }
}
