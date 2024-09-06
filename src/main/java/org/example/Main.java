package org.example;

import java.sql.SQLSyntaxErrorException;

public class Main {

    static int num = 1;
    public static void main(String[] args) {
        String s1 = "Gowtham"; // Strings are Immutable // Thread Safe
        //s1 = s1+" Raj";
        //System.out.println(s1);
        concats(s1);
        System.out.println(s1);

        //StringBuilder & StringBuffer
        //Mutable
        //StringBuilder Non Thread Safe, StringBuffer ThreadSafe
        //Create Strign Builder

        StringBuilder sb = new StringBuilder("Gowtham");
        System.out.println("String Builder "+sb);
        sb.append(" Raj");
        System.out.println("After Append "+sb);

        // Create String Buffer
        StringBuffer sbr = new StringBuffer("Udayan");
        System.out.println("String Buffer "+sbr);
        sbr.append(" Kumar");
        System.out.println("After Buffer Append "+sbr);

        //Conversion
        //1.Convert String to String Builder and String Buffer
        String name = "Manibharathi";
        StringBuilder sbrs = new StringBuilder(name);
        StringBuffer sbrss = new StringBuffer(name);

        //2. StringBuilder to String
        StringBuilder sb2 = new StringBuilder("Coimbatore");
        String sb3 = String.valueOf(sb2);

        StringBuffer sbl2 = new StringBuffer("Nagercoil");
        String sb4 = String.valueOf(sbl2);

        //3. StringBuilder to StringBuffer(Vice-Versa)
        StringBuilder s5 = new StringBuilder("Erode");
        String s5String = String.valueOf(s5);
        StringBuffer s6 = new StringBuffer(s5String);

    }

    private static void concats(String s2)
    {
        String s3 = "Hello "+s2;
        System.out.println(s3);
    }
}