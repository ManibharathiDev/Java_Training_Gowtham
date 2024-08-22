package org.example;

public class Main {

    static int num = 1;
    public static void main(String[] args)
    {
        //add();
        //count();
        fibonacci();
    }

    private static void fibonacci()
    {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int count = 10;
        for(int i = 0; i < count; i++)
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
    }

    private static void count()
    {
        System.out.println(num);
        num++;
        if(num>10)
            return;
        count();
    }

    /*private static void add()
    {
        System.out.println("I am Good");
        add();
    }*/

}