package com.myproject.level2;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory interComponent = new InterFactory();
        computerEngineer.makeComputer(interComponent);
        AbstractFactory amdComponent = new AmdFactory();
        computerEngineer.makeComputer(amdComponent);

    }
}
