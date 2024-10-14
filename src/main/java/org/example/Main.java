package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db",
                    "root", "manibharathi");
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("SELECT * FROM users");
            String name = "";
            String email = "";
            while (resultSet.next())
            {
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                System.out.println("Name "+name);
                System.out.println("email "+email);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}