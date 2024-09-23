package org.example;

public class Honda implements Bike{
    @Override
    public void getBrand() {
        System.out.println("Honda");
    }

    @Override
    public void getCC(){
        System.out.println("125");
    }
}
