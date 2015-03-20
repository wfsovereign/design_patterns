package com.myproject.BWM;

import java.util.Scanner;

/**
 * Created by wfsovereign on 15-3-18.
 */
public class CarMarket {
    public static void main(String[] args) {

        Provider provider = new Provider();


       Scanner input = new Scanner(System.in);
        System.out.println("****欢迎来到阳光车行****");
        System.out.println("本车行现有如下两款车可供选购：");
        System.out.println("1.BWM Five Series");
        System.out.println("2.BWM X6");
        System.out.println("请输入您要买的车型编号：");
        String select = input.next();
        if (select.equals("1")) {
            CarFactory bwmFiveCar = new BwmFiveSeriesFactory();
            provider.provideServerce(bwmFiveCar);
        } else if (select.equals("2")) {
            CarFactory bwmXSixCar = new BwmXSixFactory();
            provider.provideServerce(bwmXSixCar);
        } else {
            System.out.println("输入错误，本次服务到此结束。");
            return;
        }
        return;
    }

}
