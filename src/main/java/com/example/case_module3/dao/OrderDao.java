package com.example.case_module3.dao;

import com.example.case_module3.models.Order;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class OrderDao implements DaoInterface<Order> {
    public static OrderDao getInstance() {
        return new OrderDao();
    }

    @Override
    public void insert(Order order) {
        String insertSql = "insert into Order(orderDate, customerId, discount, countBuy) value (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setDate(1, order.getOrderDate());
            preparedStatement.setInt(2, order.getCustomerId());
            preparedStatement.setDouble(3, order.getDiscount());
            preparedStatement.setInt(4, order.getCountBuy());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Order order) {
        String updateSql = "UPDATE from Order\n"
                + "Set orderDate = ?, customerId = ?, discount = ?, countBuy = ?, where idOrder = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(5, order.getIdOrder());
            preparedStatement.setDate(1, order.getOrderDate());
            preparedStatement.setInt(2, order.getCustomerId());
            preparedStatement.setDouble(3, order.getDiscount());
            preparedStatement.setInt(4, order.getCountBuy());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM Order where idOrder = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> selectAll() {
        List<Order> comments = new ArrayList<>();
        String sql = "Select * from Order";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idOrder = resultSet.getInt("idOrder");
                Date orderDate = resultSet.getDate("orderDate");
                int customerId = resultSet.getInt("customerId");
                double discount = resultSet.getDouble("discount");
                int countBuy = resultSet.getInt("countBuy");

                comments.add(new Order(idOrder, orderDate, true, customerId, discount, countBuy));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return comments;
    }

    @Override
    public Order selectById(int id) {
        String sql = "Select * from Order where idOrder = ?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idOrder = resultSet.getInt("idOrder");
                Date orderDate = resultSet.getDate("orderDate");
                int customerId = resultSet.getInt("customerId");
                double discount = resultSet.getDouble("discount");
                int countBuy = resultSet.getInt("countBuy");
                return new Order(idOrder, orderDate, true, customerId, discount, countBuy);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<Order> selectByCondition(String condition) {
        return null;
    }
}
