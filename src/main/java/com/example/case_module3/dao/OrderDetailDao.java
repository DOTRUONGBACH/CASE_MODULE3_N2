package com.example.case_module3.dao;

import com.example.case_module3.models.OrderDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class OrderDetailDao implements DaoInterface<OrderDetail> {
    public static OrderDetailDao getInstance() {
        return new OrderDetailDao();
    }

    @Override
    public void insert(OrderDetail orderDetail) {
        String insertSql = "insert into OrderDetail(hatId, hatName, quantity) value (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setInt(1, orderDetail.getHatId());
            preparedStatement.setString(2, orderDetail.getHatName());
            preparedStatement.setInt(3, orderDetail.getQuantity());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(OrderDetail orderDetail) {
        String updateSql = "UPDATE from OrderDetail\n"
                + "Set hatId = ?, hatName = ?, quantity = ?, where idOrder = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(4, orderDetail.getIdOrder());
            preparedStatement.setInt(1, orderDetail.getHatId());
            preparedStatement.setString(2, orderDetail.getHatName());
            preparedStatement.setInt(3, orderDetail.getQuantity());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM OrderDetail where idOrder = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<OrderDetail> selectAll() {
        List<OrderDetail> orderDetails = new ArrayList<>();
        String sql = "Select * from OrderDetail";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idOrder = resultSet.getInt("idOrder");
                int hatId = resultSet.getInt("hatId");
                String hatName = resultSet.getString("hatName");
                int quantity = resultSet.getInt("quantity");

                orderDetails.add(new OrderDetail(idOrder, hatId, hatName, quantity));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return orderDetails;
    }

    @Override
    public OrderDetail selectById() {
        String sql = "Select * from OrderDetail where idOrder = ?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idOrder = resultSet.getInt("idOrder");
                int hatId = resultSet.getInt("hatId");
                String hatName = resultSet.getString("hatName");
                int quantity = resultSet.getInt("quantity");
                return new OrderDetail(idOrder, hatId, hatName, quantity);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<OrderDetail> selectByCondition(String condition) {
        return null;
    }
}
