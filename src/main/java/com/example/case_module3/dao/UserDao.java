package com.example.case_module3.dao;


import com.example.case_module3.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    static Connection connection = ConnectionMySql.getConnection();
    public static UserDao getInstance() {
        return new UserDao();
    }

    public List<User> selectAcc() {
        List<User> user = new ArrayList<>();
        String sql = "Select * from User";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String role = resultSet.getString("role");
                String fullName = resultSet.getString("fullname");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                int customerId = resultSet.getInt("customerId");
                user.add( new User(customerId, username, password, role, fullName, age, phone, email));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;

    }

    public void insert(User user){
        String insertSql = "insert into User(customerId, username, password, role, fullName, age, phone, email) value (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setInt(1, user.getCustomerId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.setString(5, user.getFullName());
            preparedStatement.setInt(6, user.getAge());
            preparedStatement.setString(7, user.getPhone());
            preparedStatement.setString(8, user.getEmail());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean update(User user) {
        String updateSql = "UPDATE from User/n"
                +"Set id = ?,  username= ?,  password= ?,  role= ?,  fullName= ?,  age= ?,  phone= ?,  email= ?,  customerId= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(1, user.getCustomerId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.setString(5, user.getFullName());
            preparedStatement.setInt(6, user.getAge());
            preparedStatement.setString(7, user.getPhone());
            preparedStatement.setString(8, user.getEmail());
            preparedStatement.setInt(9, user.getCustomerId());
            return preparedStatement.execute();
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void delete(int id) {
        String deleteSql = "delete FROM User where Id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
