package org.example;

import java.sql.SQLSyntaxErrorException;

public class Main{
    public static void main(String[] args) {
        //Object
        //ClassName objectName = new ClassName();

        Car car_1 = new Car();
        car_1.setBrandName("Tata");
        car_1.setChasisNumber(232);
        car_1.setEngineCC(343);
        System.out.println("Name of the car is "+car_1.getBrandName());

        //car_1.unLock();
        //System.out.println("Number of Seats =>"+car_1.numberOfSeats);
       // car_1.setBrandName("");
        /*car_1.brandName = "TATA";
        car_1.chasisNumber=33432;
        car_1.engineCC = 35;
        car_1.color = "Gray";
        car_1.fuelType = "Petrol";
        car_1.numberOfSeats = 5;*/

        //System.out.println("Name of the Car "+car_1.brandName);

//        car_1.unLock();
//        car_1.lock();
//        car_1.engineOn();
//        car_1.engineOff();
//
//        Car car_2 = new Car();
//        car_2.brandName = "Maruti";
//        car_2.chasisNumber = 4353;
//        car_2.engineCC = 67;
//        car_2.color = "Red";
//        car_2.fuelType = "Hybrid";
//        car_2.numberOfSeats = 7;
//
//        System.out.println("Name of the Car "+car_2.brandName);
//
//        car_2.unLock();
//        car_2.lock();
//        car_2.engineOn();
//        car_2.engineOff();

        Bike bike = new Bike();
        bike.setName("Honda CB Shine");
        bike.setCityBike(false);
        bike.setColor("Black");
        bike.setChasisNumber(23432432);
        bike.setCc(125);

        System.out.println(bike.getName());
        System.out.println("Color :"+bike.getColor());

        if(bike.isCityBike())
        {
            System.out.println(bike.getName()+" is city bike");
        }
        else
            System.out.println(bike.getName()+" is not city bike");

        //System.out.println("Is City Bike "+bike.isCityBike());
        System.out.println("Chasis Number "+bike.getChasisNumber());
        System.out.println("CC "+bike.getCc());

    }
}