package org.example;


public class Main{
    public static void main(String[] args) {

        //We couldn't instantiate abstract class
        //Car car = new Car();

        //Abstract Class
        Audi audi = new Audi();
        audi.getBrand();
        audi.setColor();

        Maruti maruti = new Maruti();
        maruti.getBrand();

        Bike bike = new Honda();
        bike.getBrand();
        bike.getCC();

        Bike bike1 = new Enfield();
        bike1.getBrand();

        Honda honda = new Honda();
        honda.getBrand();

        Calculation calculation = new Calculation();
        calculation.add();
        calculation.add(10,20);

        Chemistry chemistry = new Chemistry();
        chemistry.setFirstNumber(10);
        chemistry.setSecondNumber(20);
        System.out.println("First Number is "+chemistry.getFirstNumber());
        System.out.println("Second Number is "+chemistry.getSecondNumber());

        chemistry.add();

    }
}