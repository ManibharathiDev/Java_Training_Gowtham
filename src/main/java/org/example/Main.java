package org.example;

public class Main {
    public static void main(String[] args) {
        //int a = 10;
        //a++; // Post Increment operand++
        //++a; // Pre Increment ++Operand


        /*int b = a++; // Post Increment Operator
        int c = ++a; // Pre Increment Operator
        System.out.println("A "+a); // 12
        System.out.println("B "+b); // 10
        System.out.println("C "+c); // 12*/

       /* int a = 5;
        int c = ++a;
        int d = c++;
        System.out.println("A "+a);  // 6
        System.out.println("C "+c);  // 7
        System.out.println("D "+d);  // 6*/

        int a = 10;
        int b = a++ + a++; // 21 // a => 12
        int c = a++ + b++; // 12+21 => 33 // a=>13, b=> 22
        System.out.println("A "+a); // 13;
        System.out.println("B "+b); // 22
        System.out.println("C "+c); // 33

    }
}