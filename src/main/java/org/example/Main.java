package org.example;

import java.awt.print.Book;
import java.sql.SQLSyntaxErrorException;

public class Main{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.getSalary();

        GrandSubClass subClass1 = new GrandSubClass();
        subClass1.getSalary();
        subClass1.getGrandSubSalary();

        //subClass.getSalary();
        //System.out.println("Sub Class =>"+subClass.getMySalary());
       // System.out.println("Super Class =>"+subClass.getSalary());
    }
}