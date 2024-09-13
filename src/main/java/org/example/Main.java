package org.example;

import java.awt.print.Book;
import java.sql.SQLSyntaxErrorException;

public class Main{
    public static void main(String[] args) {
        // Initializing the Variable
        // 1. Through field
        Books books = new Books();
        System.out.println(books.authorName);
        books.authorName = "RS Agarwal";
        books.journal = "Education";
        books.numOfPages = 235;
        books.edition = "Second";
        books.pubYear = 2020;
        books.publication = "IJCNA";

        //2. Through Method
        Books books1 = new Books();
        books1.assignValues("RS Agarwal",
                "IJCNA",2020,"Education",
                235, "Second"
                );

        System.out.println("Name of the Author "+books1.authorName);

        //3. Through Constructor
        // Constructor is like a function, it should same as class name.

        Books books2 = new Books();
        System.out.println(books2.authorName);

        // Types of Constructors

        Books books3 = new Books("Sathyan",2022);
        System.out.println("Name of the Author "+books3.authorName);
        System.out.println("Publication Year "+books3.pubYear);

        Books books4 = new Books("Third");

        Area sq = new Area(5);
        System.out.println(sq.square());

        Area rec = new Area(5,6);
        System.out.println(rec.rect());


    }
}