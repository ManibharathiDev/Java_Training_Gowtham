package org.example;

public class Main {
    static int a = 20; // Global Variable
    public static void main(String[] args)
    {
        //int a = 10; //Local Variable
        int b = 20;
        a = 35;

        System.out.println(a);
        //int result = a+b;
        //System.out.println(result);
        add();
        printAdd(a);
    }

    private static void add(){
        System.out.println(a); // Global Variable
    }

    private static void printAdd(int a)
    {
        System.out.println(a); // Local Variable
    }

}