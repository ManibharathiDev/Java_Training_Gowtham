package org.example;

import java.sql.SQLSyntaxErrorException;

public class Main {

    static int num = 1;
    public static void main(String[] args) {
       String s1 = "Gowtham";
       String s2 = "Gowtham";

       String name = new String("Gowtham");

       char[] ch = {'G','0','w','t','h','a','m'};
       String charsString = new String(ch);
       System.out.println(charsString);

        /**
         * Built In Functions
         */
        /**
         * charAt(int index)
         */

        System.out.println(s1.charAt(2)); // It returns the 2nd index character
        /**
         * Length
         */
        System.out.println(s1.length());

        /**
         * substring(int beginIndex,int endIndex);
         */

        String s3 = "Hello World";
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2,7)); // (BeginIndex -> endIndex-1)

        /**
         * contains
         * Check if the string contains such string
         * It returns true, if it is present, else returns false
         */

        String s4 = "Hello World";
        boolean res = s4.contains("Worlds");
        System.out.println(res);
        if(s4.contains("Hello")){
            System.out.println("Strings are available");
        }

        /**
         * isEmpty()
         */

        String s5 = "sdfsdfdsf";
        if(s5.isEmpty())
        {
            System.out.println("Invalid String");
        }

        /**
         * concat(String newString)
         * Join Strings
         */
        String s6 = "Udaya";
        String s7 = "Kumar";
        String s8 = s6.concat(s7);
        s8 = s6.concat(" ").concat(s7);
        System.out.println(s8);

        /**
         * replace(char oldChar,char newChar)
         */

        String s9 = "Hello World";
        String s10 = s9.replace('W','L');
        System.out.println(s10);
        s10 = s9.replace("World","dear");
        System.out.println(s10);

        /**
         * split(String regEx)
         * Split to Array
         */
        String text = "Hello/World/My/Dear";
        String[] textSplit = text.split("/");
        for(int i = 0; i < textSplit.length; i++)
        {
            System.out.println(textSplit[i]);
        }

        /**
         * indexOf()
         */

        String s11 = "Coimbatore";
        int pos = s11.indexOf("o");
        System.out.println("Position "+pos);

        /**
         * LowerCase & UpperCase
         */
        String s12 = "gowtham";
        System.out.println(s12.toUpperCase());
        s12 = "GOWTHAM";
        System.out.println(s12.toLowerCase());

        /**
         * trim
         * It removes first and Last spaces
         */

        String s13 = " GOWTHAM ";
        System.out.println("Before Trim => "+s13.length());
        String s14 = s13.trim();
        System.out.println("Before Trim => "+s14.length());


    }
}