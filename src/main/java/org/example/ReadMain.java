package org.example;

import java.sql.*;

public class ReadMain {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/grace_db", "root",
                    "manibharathi");
            String sql = "SELECT * FROM users WHERE id = ? AND user_type = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 7);
            statement.setString(2,"ADMIN");
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String name = result.getString("name");
                String email = result.getString("email");
                int age = result.getInt("age");
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Age: " + age);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
