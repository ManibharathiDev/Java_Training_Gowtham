package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNew {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db", "root",
                    "manibharathi");
            System.out.println("Connection established.");
            String sql = "INSERT INTO `users` " +
                    "(`name`, `email`, `user_type`, `password`, `mobile`, `age`) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "Gilbert");
            statement.setString(2, "gilbert@gmail.com");
            statement.setString(3, "ADMIN");
            statement.setString(4, "123456");
            statement.setString(5, "9955266459");
            statement.setString(6, "27");
            statement.executeUpdate();
            System.out.println("Record created.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
