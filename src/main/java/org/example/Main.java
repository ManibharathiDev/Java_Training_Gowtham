package org.example;

public class Main {
    public static void main(String[] args) {
        // Find the Maximum in the given array
        int[] a = {350,670,89,12,56,90,23,11,10,5};
        /*int max = a[0];
        for(int i = 1; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }*/
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("Maximum number is "+max);

        //Find the minimum
        int min = a[0];
        for (int i = 1; i <a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Minimum number is "+min);

        //Copy Array
        int[] b = new int[a.length];
        for(int i = 0; i< a.length; i++)
        {
            b[i] = a[i];
        }

        // Right Max
        /**
         {2,3,6,4,5,6,7,8}
         {2,5,11,15,20,26,33,41}
         r[0] = a[0];
         r[1] = r[0]+a[1];
         r[2] = r[1]+a[2];
         r[3] = r[2]+a[3];


         r[n] = r[n-1]+a[n];

         r[index] = r[index-1]+a[index];
         */
        int[] rMax = new int[a.length];
        rMax[0] = a[0];
        for(int i = 1;i<a.length;i++)
        {
            rMax[i] = rMax[i-1]+a[i];
        }

        System.out.println("Right Max");
        for(int i = 0; i<rMax.length; i++)
        {
            System.out.println(rMax[i]);
        }

        // Left Max
        int[] lMax = new int[a.length];
        lMax[a.length-1] = a[a.length-1];

        for(int i = a.length-2;i>=0;i--)
        {
            lMax[i] = lMax[i+1]+a[i];
        }

        System.out.println("Left Max");
        for(int i = 0; i<lMax.length; i++)
        {
            System.out.println(lMax[i]);
        }

        //Task :
        // Sum of Right Max with Left Max

    }
}