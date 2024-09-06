package org.example;

import java.sql.SQLSyntaxErrorException;

public class Main{

    static int num = 1;
    public static void main(String[] args) {
        System.out.println("Division");
        //try-catch-finally(optional)
        try{
            int a = 5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid arithmetic operation "+e.getMessage());
        }
        finally {
            System.out.println("Divide");
        }

        int[] a = {10,20,40};
        //System.out.println(a[10]);
        try{
            System.out.println(a[6]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }

        String s3 = null;
        try {
            System.out.println(s3.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("S3 is null ");
        }

        int first = 10;
        int second = 0;
        if(second == 0)
        {
            throw new RuntimeException("Divide by zero");
        }
        else
        {
        int result = first/second;
        }


    }

    private static void concats(String s2)
    {
        String s3 = "Hello "+s2;
        System.out.println(s3);
    }
}