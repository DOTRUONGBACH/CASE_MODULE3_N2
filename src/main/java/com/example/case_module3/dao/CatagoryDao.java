package com.example.case_module3.dao;

import com.example.case_module3.models.Catagory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatagoryDao implements DaoInterface<Catagory> {
    static Connection connection = ConnectionMySql.getConnection();

    public static CatagoryDao getInstance() {
        return new CatagoryDao();
    }

    @Override
    public void insert(Catagory catagory) {
        String insertSql = "insert into Catagory(catagoryName) value (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, catagory.getCatagoryName());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Catagory catagory) {
        String updateSql = "UPDATE from Catagory\n" + "Set catagoryName=?, where idCatagory = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(2, catagory.getIdCatagory());
            preparedStatement.setString(1, catagory.getCatagoryName());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM Catagory where idCatagory = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Catagory> selectAll() {
        List<Catagory> catagorys = new ArrayList<>();
        String sql = "Select * from Catagory";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idCatagory = resultSet.getInt("idCatagory");
                String catagoryName = resultSet.getString("catagoryName");

                catagorys.add(new Catagory(idCatagory, catagoryName));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return catagorys;
    }

    @Override
    public Catagory selectById() {
        String sql = "Select * from Catagory where idCatagory=?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            int idCatagory = resultSet.getInt("idCatagory");
            String catagoryName = resultSet.getString("catagoryName");

            return new Catagory(idCatagory, catagoryName);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Catagory> selectByCondition(String condition) {
        return null;
    }
}
