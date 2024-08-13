package org.example;

public class Main {
    public static void main(String[] args) {

        // break,continue
        //int c = 5;
        for(int i = 0; i < 10; i++)
        {
            int result = i*i;
            if(result == 25)
            {
                //break; // It stops immediately with current block
                continue; // It skips current iteration
            }
            System.out.println(result);
        }

        /*for(;;)
        {
            for(;;)
            {
                if(cond)
                {
                    break;
                }
            }
        }*/




        int b = 9%2;
        switch(b)
        {
            case 0:
                System.out.println("Even Number");
                break;
            case 1:
                System.out.println("Odd Number");
                break;
        }

        int a = 3;
        switch (a)
        {
            case 1,2,3:
                System.out.println("1");
                break;
            /*case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;*/
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("Out of range");
                //break; // Optional
        }
    }
}