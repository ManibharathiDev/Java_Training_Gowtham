package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        /*ArrayList<Students> studentsArrayList = new ArrayList<>();
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
        }*/

        /*ArrayList<String> studentArrayList = new ArrayList<>();
        studentArrayList.add("Gowtham");
        if(studentArrayList.contains("Gowtham"))
        {
            System.out.println("Dublicate Entry");
        }
        else{
            System.out.println("Added");
        }*/

        ArrayList<Students> studentsArrayList = new ArrayList<>();
//        if(studentsArrayList.contains("gowtham"))
        Students students = new Students();
        students.setName("Gowtham");
        studentsArrayList.add(students);

        String name = "Gowthams";
        Students students1 = null;
        for(int i = 0; i<studentsArrayList.size();i++)
        {
            if(studentsArrayList.get(i).getName().equals(name))
            {
                students1 = studentsArrayList.get(i);
                break;
            }
        }

        if(students1 != null)
        {
            System.out.println("Data is Available");
        }
        else{
            System.out.println("Data is not available");
        }




    }
}