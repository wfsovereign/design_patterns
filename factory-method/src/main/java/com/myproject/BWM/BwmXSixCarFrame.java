package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmXSixCarFrame implements CarFrame {

    private String carGrade;
    private int[] carBody;
    private String carBodyStructure;

    public BwmXSixCarFrame(String carGrade, int[] carBody, String carBodyStructure){

        this.carGrade = carGrade;
        this.carBody = carBody;
        this.carBodyStructure = carBodyStructure;
        carFrameSelfChecking();
    }

    @Override
    public void carFrameSelfChecking() {
        System.out.println("this is "+this.carGrade+this.carBodyStructure+"BWM XDrive,length: "
                +this.carBody[0]+"width: "+this.carBody[1]+"height: "+this.carBody[2]);
    }
}
