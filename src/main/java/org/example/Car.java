package org.example;

public class Car {
    private String brandName; //null -> default
    private int engineCC;
    private int chasisNumber;
    private String fuelType;
    private String color;
    private int numberOfSeats;
//Getter & Setters
    void setBrandName(String brandName){
        if(brandName.isEmpty())
        {
            return;
        }
        this.brandName = brandName;
    }

    String getBrandName()
    {
        return this.brandName;
    }


    void setEngineCC(int engineCC)
    {
        this.engineCC = engineCC;
    }

    void setChasisNumber(int chasisNumber)
    {
        this.chasisNumber = chasisNumber;
    }

    void unLock(){
        System.out.println("Car door is unlocked -"+brandName);
    }

    void lock(){
        System.out.println("Car door is locked");
    }

    void engineOn(){
        System.out.println("Car is on");
    }

    void engineOff(){
        System.out.println("Car is off");
    }

}
