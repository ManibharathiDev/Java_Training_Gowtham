package org.example;

public class Main {
    public static void main(String[] args) {
        //2D Array Declaration
//        int[][] a = new int[size_row][size_column];
        int[][] a = new int[4][4];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 4;

        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 3;
        a[1][3] = 4;

        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 3;
        a[2][3] = 4;

        a[3][0] = 1;
        a[3][1] = 2;
        a[3][2] = 3;
        a[3][3] = 4;

        for(int i = 0; i<4;i++)
        {
            for(int j = 0; j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }


        int sum = 0;
        //Task 1: Sum of the Array
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }

        }
        System.out.println("Sum of array: ");
        System.out.println(sum);
        // Sum of Rows

        int rsum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                rsum=rsum+a[i][j];
            }
            System.out.println(rsum);
            rsum=0;
        }
        // Sum of the diagonal

        int dsum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                // i<j Upper Triangle
                //Lower Triange
                if(i > j)
                {
                    dsum = dsum+a[i][j];
                }

            }
        }
        System.out.println(dsum);

    }
}