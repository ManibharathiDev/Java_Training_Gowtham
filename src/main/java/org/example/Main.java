package org.example;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        for(int i = 0; i<100;i++)
        {
            if(i == 49 || i == 68)
            {
                age.add(190); // Add New Value
            }
            else age.add(i+1);
        }
       //age.add(90);
        //System.out.println("Age is "+age.get(100)); // Get - Index

        for(int i = 0; i<100;i++)
        {
            System.out.println("Age is "+age.get(i)); // Get - Index
        }

        System.out.println("Size of array list "+age.size());
        System.out.println(age.get(8)); // return a 8th position value

        if(age.contains(1900))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //age.clear(); // Remove all values
       // System.out.println("Size of array list "+age.size());

        System.out.println("Index of => "+age.indexOf(56));

//        if(age.size() == 0)
//        {
//
//        }
        if(age.isEmpty())
        {
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }

        System.out.println(age.lastIndexOf(190));
        age.remove(3); // remove

    }
}