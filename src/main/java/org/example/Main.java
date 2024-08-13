package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i< a.length;i++)
        {
            sum = sum+a[i];
        }
        System.out.println(sum);

        for(int i=1;i<5;i++)
        {
            a[0]=a[0]+a[i];
        }
        System.out.println(a[0]);

        // Print only Even number in the given array
        //Input : {3,4,5,7,8,9,10,24,56,89,900,123}


//        int[] a = new int[5];
//        a[0] = 20;
//        a[1] = 30;
//        a[2] = 40;
//        a[3] = 50;
//        a[4] = 60;
        //System.out.println(a.length);
        //System.out.println(a[2]);

        int[] b = {34,56,78,90};
        //System.out.println(b[3]);

        for(int i = 0; i<a.length; i++)
        {
           // System.out.println(a[i]);
        }

        // Tastk 1: Sum of array

    }
}