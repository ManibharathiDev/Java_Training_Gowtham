package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMain {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db", "root",
                    "manibharathi");
            String sql = "UPDATE users SET age = ? WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 35);
            statement.setInt(2, 6);
            statement.executeUpdate();
            System.out.println("Record updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
