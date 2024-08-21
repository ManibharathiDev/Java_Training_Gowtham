package org.example;

public class Main {
    public static void main(String[] args) {

        /*int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("Addition is ");
        c = a+b;
        System.out.println("Result is "+c);

        a = 30;
        b = 35;
        c = a+b;
        System.out.println("Result is "+c);

        a = 40;
        b = 35;
        c = a+b;
        System.out.println("Result is "+c);

         */
        /*addition();
        addition();
        addition();
        subtraction();*/
        /*add(10,20);
        add(10,20,30);
        add(10.5f,10);*/
        int result = add_values();
        System.out.println(result);

    }

    /**
     * No Return Type, No Arguments
     */
    static void addition()
    {
        int a = 40;
        int b = 35;
        int c = a+b;
        System.out.println("Result is "+c);
        //addition(); Function call by itself-> Recursive
        //subtraction();
    }

    /**
     * No Return Type, No Arguments
     */
    static void subtraction()
    {
        int a = 45;
        int b = 65;
        int c = a-b;
        System.out.println(c);
    }

    /**
     * No Return Type, With Arguments
     */

    static void add(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
    }

    // Function Overloading
    // Same Function name but different arguments
    static void add(int a, int b, int c)
    {
        int d = a+b+c;
        System.out.println(d);
    }

    static void add(float a, int b){
        float c = a+b;
        System.out.println(c);
    }


    /*static return_type function_name() // int,float,double,string,character,boolean, object
    {
        Logic here
    }*/

    /**
     * With Return Type and No Arguments
     * @return
     */
    static int add_values()
    {
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

}