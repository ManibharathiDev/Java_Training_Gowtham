package org.example;

public class Main {
    public static void main(String[] args) {
        // Print 1 to 10 Numbers
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }


        /**\
         1
         22
         333
         4444
         55555
         */

        for(int i = 1; i<=5000;i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }

        //Outer Loop : 5
        // Inner Loop : 1+2+3+4+5 = 15 =? 20 times
        // DSA => Data Structures & Algorithm
        // Running time and Space Big O.

        /**

         *
         * *
         * * *
         * * * *
         * * * * *

         -----------------

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */


    }
}