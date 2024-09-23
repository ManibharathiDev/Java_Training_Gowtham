package org.example;

public class Chemistry implements Maths,Formula{

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    //    public int getFirstNumber(){
//        return 2;
//    }
//
//    public int getSecondNumber(){
//        return 6;
//    }


    @Override
    public void add() {
        int result = firstNumber+secondNumber;
        System.out.println("Addition "+result);
    }

    @Override
    public void subtraction() {

    }

    @Override
    public void multiplication() {

    }

    @Override
    public void division() {

    }

    @Override
    public void modular() {

    }

    @Override
    public void percentage() {

    }

    @Override
    public void add(int a, int b) {

    }

    @Override
    public void sin() {

    }

    @Override
    public void cos() {

    }

    @Override
    public void tan() {

    }

    @Override
    public void cosec() {

    }
}
