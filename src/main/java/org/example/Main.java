package org.example;


import org.example.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Connection connection = null;
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db",
                    "root", "manibharathi");
            Statement statement;  // PreparedStatment
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("SELECT * FROM users");
            String name = "";
            String email = "";
            String userType = "";
            while (resultSet.next())
            {
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                userType = resultSet.getString("user_type");

                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(name);
                employee.setEmail(email);
                employee.setUserType(userType);
                employeeArrayList.add(employee);
            }
            resultSet.close();
            statement.close();
            connection.close();

            System.out.println("Size of Employee "+employeeArrayList.size());
            System.out.println("id     Name            email                           user_type");
            System.out.println("------------------------------------------------------------------");
            for(int i = 0; i < employeeArrayList.size(); i++)
            {
                Employee employee = employeeArrayList.get(i);
                System.out.println(employee.getId()+"     "+employee.getName()+"            "+employee.getEmail()+"                           "+employee.getUserType());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}