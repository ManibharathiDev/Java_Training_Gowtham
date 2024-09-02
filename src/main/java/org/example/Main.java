package org.example;

public class Main {

    static int num = 1;
    public static void main(String[] args) {
        String name = "gowtham ";

//        System.out.println("My Name is "+name);
//        System.out.println(name.length()); // Built In Mehtod

        char[] names = name.toCharArray();
        int j = 0;
        for(int i = 0; i<names.length;i++)
        {
            j++;
            //System.out.println(names[i]);
        }

        //System.out.println(name.toCharArray()[0]);
        // Find the length of string using own logic
        //2. Print the reverse string
        //charAt(index) => It returns the index character
        String a = "MALAYALAMS";

//        a = 10;
//        a +=5;
        String b = "";
        for(int i = a.length()-1;i>=0;i--)
        {
            b += a.charAt(i);
            //b.concat(String.valueOf(a.charAt(i)));
        }
//        System.out.print(b);
//
//        if(a.equals(b))
//        {
//            System.out.println("Strings are Palindrome");
//        }
//        else{
//            System.out.println("Not a Palindrome");
//        }

        // while
        boolean isPalindrome = true;
        //int isPal = 1;
        char[] pal = a.toCharArray();
        int i = 0;
        int k = pal.length-1;
        while(i<pal.length && k>=0)
        {
            if(pal[i] != pal[k])
            {
                isPalindrome = false;
               // isPal = 0;
                break;
            }
            i++;
            k--;
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }



    }
}