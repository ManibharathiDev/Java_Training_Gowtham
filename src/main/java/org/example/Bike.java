package org.example;

public class Bike {

    private String name;
    private String color;
    private int cc;
    private int chasisNumber;
    private boolean isCityBike;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(int chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public boolean isCityBike() {
        return isCityBike;
    }

    public void setCityBike(boolean cityBike) {
        isCityBike = cityBike;
    }
}
