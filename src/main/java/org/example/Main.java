package org.example;

public class Main {

    static int num = 1;
    public static void main(String[] args)
    {
        //print1toA(10);
        //printAto1(10);

        //fib(N) = fib(n-1)+fib(n-2)
        //int sum = add(5);
        //System.out.println("The sum is "+sum);

        //int facts = fact(5);
        //System.out.println(facts);
        int fibs = fib(5);
        System.out.println(fibs);
    }

    static int fib(int N)
    {
        //Base Condition
        if(N <= 1)
        {
            return N;
        }
        return fib(N-1)+fib(N-2);
    }



    static int fact(int a){
        if (a==1){

            return 1;
        }
        return fact(a-1)*a;

    }

    private static int add(int N)
    {
        if(N == 1) // Base Condition
        {
            return 1;
        }
        return add(N-1)+N;
    }

    private static void printAto1(int N)
    {
        if(N == 1)
        {
            System.out.print(N+" ");
            return;
        }
        System.out.print(N+" ");
        print1toA(N-1);

    }

    private static void print1toA(int N)
    {
        if(N == 1)
        {
            System.out.print(N+" ");
            return;
        }
        print1toA(N-1);
        System.out.print(N+" ");
    }
}