package com.example.case_module3.dao;


import com.example.case_module3.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    public static UserDao getInstance() {
        return new UserDao();
    }

    public User selectAcc(String username, String password) {

        String sql = " select * from account where username = ? and password = ?";
        try (Connection connection = ConnectionMySql.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                String role = resultSet.getString("role");
                String fullName = resultSet.getString("fullname");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                int customerId = resultSet.getInt("customerId");
                return new User(customerId, username, password, role, fullName, age, phone, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
