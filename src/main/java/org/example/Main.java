package org.example;

public class Main {
    public static void main(String[] args) {
        // Logical Operators
        /**
         * && -> Logical And
         * || -> Logical Or
         * a&&b =>
         * true && true => true
         * true && false => false
         * false && false => false
         * true || true => true
         * true || false => true
         * false || false => false
         */

        //boolean result = true && true;
        boolean result = (10 > 5) && (10 > 12);
        System.out.println(result);
        result = (10 > 5) && (10 > 4);
        System.out.println(result);

        result = (10 < 12) || (12 > 90);
        System.out.println(result);
        result = (10 < 8) || (12 > 90);
        System.out.println(result);

        // Find the greatest number between three numbers using ternary operators

        int a = 51000;
        int b = 15000;
        int c = 1900000;
        int d = 100000;

        String greatestNumber = (a > b && a > c) ? "A" : ((b > c) ? "B" : "C");
        System.out.println(greatestNumber);

        // Find the greatest number b/w four numbers using ternary operators;
       // greatestNumber = (a>b&&a>c)?"a":(c>b&&c>d)?"c":(b>d)?"b":"d";

        greatestNumber = (a > b && a > c && a > d)?"A":(b>c && b > d)? "B":(c > d) ? "C":"D";
        System.out.println(greatestNumber);

        // Check the given number is odd or even number
        // 12 : Even
        // 9 : Odd
        // 2 4 6 8 10 12 14 16 18 ...... 100 ..... => All numbers divided by 2 perfect
        // 1 3 5 7 9....... 99 .....

        int num = 11;
        num=num%2;
        String oddOrEven =(num==0)?"even":"odd";
        System.out.println(oddOrEven);


        /*
        //Ternary or Conditional Operator
        int a = 10;
        int b = 50;
        // Find the greatest number between two numbers
        int res = (a>b)?a:b;
        System.out.println("The greatest number is "+res);

        String resultss = (a>b)?"A is greatest number":"B is greatest number";
        System.out.println(resultss);

        // Relational Operator
        boolean result = 10<5;
        System.out.println(result);
        result = 10>5;
        System.out.println(result);
        result = 10<=5;
        System.out.println(result);
        result = 10<=15;
        System.out.println(result);
        result = 10!=15;
        System.out.println(result);
        result = 10==15;
        System.out.println(result);
        result = 10==10;
        System.out.println(result);


        //Task 1
        /*int myNumber = 10;
        int yourNumber = 20;
        System.out.println("Before Swapping");
        System.out.println("My Number =>"+myNumber);
        System.out.println("Your Number =>"+yourNumber);

        // Using Arithmetic operatos + -

        // Using Temp variable

        /*int temp = myNumber;
        myNumber = yourNumber;
        yourNumber = temp;

        System.out.println("After Swapping");
        System.out.println("My Number =>"+myNumber);
        System.out.println("Your Number =>"+yourNumber);*/

        // Single Line Swapping

        //myNumber = (myNumber+yourNumber)-(yourNumber = myNumber);
        /*myNumber = (myNumber*yourNumber)/(yourNumber=myNumber);

        System.out.println("After Swapping");
        System.out.println("My Number =>"+myNumber);
        System.out.println("Your Number =>"+yourNumber);*/

        //Operators
       /* int fNumber = 10;
        int sNumber = 20;
        int addition = fNumber + sNumber; // Addition Operator +
        int subtraction = sNumber - fNumber; // Subtraction -
        int multiplication = sNumber * fNumber; // Multiplcation *
        int division = sNumber/fNumber; // Division /

        int remainder = fNumber%12;
        System.out.println("Remainder is "+remainder);*/


        // Type Casting
       /* byte a = 127;
        // Implicit Type Converstion
        short c = a;

        int b = a;

        System.out.println("A is "+a);
        System.out.println("B is "+b);

        int age = 25;
        //Explicit Conversion
        byte myAge = (byte)age;

        short my_age = (short) age;

        System.out.println("My age is "+myAge);


        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = Integer.MAX_VALUE;
        //Explicit Type Conversion
        long result = (long)firstNumber + (long)secondNumber;

        System.out.println("Result is ="+result);






        // Variables & Data Types - Ranges
        /*byte a = 10;

        System.out.println("Byte Min Value "+Byte.MIN_VALUE);
        System.out.println("Byte Max Value "+Byte.MAX_VALUE);

        short b = 10;

        System.out.println("Short Min Value "+Short.MIN_VALUE);
        System.out.println("Short Max Value "+Short.MAX_VALUE);

        int c = 10;
        System.out.println("INT Min Value "+Integer.MIN_VALUE);
        System.out.println("INT Max Value "+Integer.MAX_VALUE);

        long d = 10;
        System.out.println("Long Min Value "+Long.MIN_VALUE);
        System.out.println("Long Max Value "+Long.MAX_VALUE);

        float e = 10.9f;
        System.out.println("Float Min Value "+Float.MIN_VALUE);
        System.out.println("Float Max Value "+Float.MAX_VALUE);

        double g = 10.9;
        System.out.println("Double Min Value "+Double.MIN_VALUE);
        System.out.println("Double Max Value "+Double.MAX_VALUE);

        int age = 10;
        int myage = 10;
        int myAge = 10;
        int _age = 10;
        //int 2age = 10; //Error
       // int my age = 10;// Error
        int my_age = 10;
        int my2age = 10;
        //int #age = 10; // Error
        int age1 = 10;*/


    }
}