package com.example.case_module3.dao;
import com.example.case_module3.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    public static UserDao getInstance() {
        return new UserDao();
    }
    public User checkLogin(String username, String password) {

        String sql = " select * from account where username = ? and password = ?";
        try( Connection connection = ConnectionMySql.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String role = resultSet.getString("role");
                String fullName = resultSet.getString("fullname");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                Integer age = resultSet.getInt("age");
                return new User(id,username, password, role, fullName,age, phone,email);
            }

            return null;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
