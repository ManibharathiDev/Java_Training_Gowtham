package org.example;

public class Main {
    public static void main(String[] args) {
        // Print 1 to 10 Numbers
        for(int i = 1; i<=10; i++)
        {
            //System.out.println(i);
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
                //System.out.print(i);
            }
            //System.out.println("");
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

        /**
         * While Loop
         */

        /**
         * Syntax
         initialization;
         while(condition)
         {
            //Statement
            //increment/decrement
         }
         */
        /**
         * Print 1 to 10 numbers
         */
        int a = 1;
        while(a<=10) // 1<=10
        {
            System.out.println(a);
            a++;
        }
        /**
         * Print 10 to 1
         */

        a = 10;
        while(a>=1) // 1<=10
        {
            System.out.println(a);
            a--;
        }

        /**
         * Count the digits
         * 123 => 3
         * 1234 => 4
         */
        int num = 123;
        int count = 0;
        while(num>0) //12>0 // 1> //0>0
        {
            count++; //3
            num = num/10; // 123/10 => 12, 12/10 => 1 ,1/10 => 0
        }
        System.out.println("Number of digits are "+count);

        /**
         * Sum of the digits
         * 123
         * 1+2+3 => 6
         * 456 => 4+5+6 = 15
         * 123
         * 123%10 => 3
         * 123/10 => 12
         * 12%10 => 2+3 => 5
         * 12/10 => 1
         * 1%10 => 1+5 => 6
         * 1/10 => 0
         *
         *
         */

        int digits = 5123;
        int sum = 0;
        int remainder = 0;
        while(digits>0)
        {
            remainder = digits%10;
            sum = sum + remainder;
            digits = digits/10;
        }
        System.out.println("Sum of the digits are "+sum);

        /**
         * Do-while
         initialization;
         do{
            statement;
         }while(condition);
         */

        int b = 10;
        do{
            System.out.println(b);
            b++;
        }while(b>20);

        /**
         * Difference b/w while and do-while
         * while-> Entry level checking
         * do-while->Exit level checking
         */
        /**
         * Reverse the digits
         * input 345
         * output 543
         *
         * Polindrome
         * input 121
         * check the above number is polindrome or not
         */


    }
}