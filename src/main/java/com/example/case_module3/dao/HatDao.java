package com.example.case_module3.dao;

import com.example.case_module3.models.Hat;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HatDao implements DaoInterface<Hat> {
    static Connection connection = ConnectionMySql.getConnection();

    public static HatDao getInstance() {
        return new HatDao();
    }

    @Override
    public void insert(Hat hat) {
        String insertSql = "insert into Hat(hatName,img,listImg,sellPrice,inputPrice,promotionPrice,quantity," +
                "description,detail) value (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, hat.getHatName());
            preparedStatement.setString(2, hat.getImg());
            preparedStatement.setString(3, String.valueOf(hat.getListImg()));
            preparedStatement.setDouble(4, hat.getSellPrice());
            preparedStatement.setDouble(5, hat.getInputPrice());
            preparedStatement.setDouble(6, hat.getPromotionPrice());
            preparedStatement.setInt(7, hat.getQuantity());
            preparedStatement.setString(8, hat.getDescription());
            preparedStatement.setString(9, hat.getDetail());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Hat hat) {
        String updateSql = "UPDATE from Hat\n"
                + "Set hatName=?,img = ?,listImg=?,sellPrice=?,inputPrice=?,promotionPrice=?,quantity=?,description=?,detail =?" +
                "where hatId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(10, hat.getHatId());
            preparedStatement.setString(1, hat.getHatName());
            preparedStatement.setString(2, hat.getImg());
            preparedStatement.setString(3, String.valueOf(hat.getListImg()));
            preparedStatement.setDouble(4, hat.getSellPrice());
            preparedStatement.setDouble(5, hat.getInputPrice());
            preparedStatement.setDouble(6, hat.getPromotionPrice());
            preparedStatement.setInt(7, hat.getQuantity());
            preparedStatement.setString(8, hat.getDescription());
            preparedStatement.setString(9, hat.getDetail());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM Hat where hatId = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Hat> selectAll() {
        List<Hat> hats = new ArrayList<>();
        String sql = "Select * from Hat";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int hatId = resultSet.getInt("hatId");
                String hatName = resultSet.getString("hatName");
                String img = resultSet.getString("img");
                List<String> listImg = Collections.singletonList(resultSet.getString("listImg"));
                double sellPrice = resultSet.getDouble("sellPrice");
                double inputPrice = resultSet.getDouble("inputPrice");
                double promotionPrice = resultSet.getDouble("promotionPrice");
                int quantity = resultSet.getInt("quantity");
                String description = resultSet.getString("description");
                String detail = resultSet.getString("detail");
                int idHattype = resultSet.getInt("idHattype");
                int idCatagory = resultSet.getInt("idCatagory");

                hats.add(new Hat(hatId, hatName, true, img, listImg, sellPrice, inputPrice, promotionPrice, quantity,
                        description, detail, idHattype, idCatagory));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return hats;
    }

    @Override
    public Hat selectById() {
        String sql = "Select * from Hat where hatId=?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            int hatId = resultSet.getInt("hatId");
            String hatName = resultSet.getString("hatName");
            String img = resultSet.getString("img");
            List<String> listImg = Collections.singletonList(resultSet.getString("listImg"));
            double sellPrice = resultSet.getDouble("sellPrice");
            double inputPrice = resultSet.getDouble("inputPrice");
            double promotionPrice = resultSet.getDouble("promotionPrice");
            int quantity = resultSet.getInt("quantity");
            String description = resultSet.getString("description");
            String detail = resultSet.getString("detail");
            int idHattype = resultSet.getInt("idHattype");
            int idCatagory = resultSet.getInt("idCatagory");

            return new Hat(hatId, hatName, true, img, listImg, sellPrice, inputPrice, promotionPrice, quantity,
                    description, detail, idHattype, idCatagory);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Hat> selectByCondition(String condition) {
        return null;
    }
}
