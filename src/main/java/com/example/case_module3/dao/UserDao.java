package com.example.case_module3.dao;

import com.example.case_module3.models.User;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class UserDao implements DaoInterface<User> {
    public static UserDao getInstance() {
        return new UserDao();
    }

    @Override
    public void insert(User user) {
        String insertSql = "insert into User(fullName, birthDay, email, numberPhone, address, userName, passWord) value (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setDate(2, user.getBirthDay());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getNumberPhone());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getUserName());
            preparedStatement.setString(7, user.getPassWord());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(User user) {
        String updateSql = "UPDATE from User\n"
                + "Set fullName = ?, birthDay = ?, email = ?, numberPhone = ?, address = ?, userName = ?, passWord = ?, where customerId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(8, user.getCustomerId());
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setDate(2, user.getBirthDay());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getNumberPhone());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getUserName());
            preparedStatement.setString(7, user.getPassWord());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM User where customerId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> selectAll() {
        List<User> users = new ArrayList<>();
        String sql = "Select * from User";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerId");
                String fullName = resultSet.getString("fullName");
                Date birthDay = resultSet.getDate("birthDay");
                String email = resultSet.getString("email");
                String numberPhone = resultSet.getString("numberPhone");
                String address = resultSet.getString("address");
                String userName = resultSet.getString("userName");
                String passWord = resultSet.getString("passWord");

                users.add(new User(customerId, fullName, birthDay, email, numberPhone, address, userName, passWord));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User selectById() {
        String sql = "Select * from User where customerId = ?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerId");
                String fullName = resultSet.getString("fullName");
                Date birthDay = resultSet.getDate("birthDay");
                String email = resultSet.getString("email");
                String numberPhone = resultSet.getString("numberPhone");
                String address = resultSet.getString("address");
                String userName = resultSet.getString("userName");
                String passWord = resultSet.getString("passWord");
                return new User(customerId, fullName, birthDay, email, numberPhone, address, userName, passWord);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        return null;
    }
}
