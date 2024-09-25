package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        ArrayList<Students> studentsArrayList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            Students students = new Students();
            System.out.println("Enter the Student Name "+(i+1));
            students.setName(s.nextLine());
            System.out.println("Enter the Roll Number");
            students.setRollNumber(s.nextInt());
            System.out.println("Enter the Age");
            students.setAge(s.nextInt());
            studentsArrayList.add(students);
        }

        for(int i = 0; i< studentsArrayList.size(); i++)
        {
            Students students = studentsArrayList.get(i);
            System.out.println("Details - "+(i+1));
            System.out.println("Name "+students.getName());
            System.out.println("Roll Number "+students.getRollNumber());
            System.out.println("Age "+students.getAge());
        }

    }
}