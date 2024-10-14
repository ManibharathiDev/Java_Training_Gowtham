package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateMain {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db", "root",
                    "manibharathi");
            System.out.println("Connection established.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
