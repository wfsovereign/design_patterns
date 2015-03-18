package com.myproject.BWM;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class BwmFiveSeriesCarFrame implements CarFrame {

    private String carGrade;
    private int[] carBody;
    private String carBodyStructure;

    public BwmFiveSeriesCarFrame(String carGrade,int[] carBody,String carBodyStructure){

        this.carGrade = carGrade;
        this.carBody = carBody;
        this.carBodyStructure = carBodyStructure;
    }


    @Override
    public void carFrameSelfChecking() {
        System.out.println("this is "+this.carGrade+this.carBodyStructure+"BWM five series,length: "
                +this.carBody[0]+"width: "+this.carBody[1]+"height: "+this.carBody[2]);
    }
}
