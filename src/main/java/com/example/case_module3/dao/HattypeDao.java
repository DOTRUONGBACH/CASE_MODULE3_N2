package com.example.case_module3.dao;

import com.example.case_module3.models.Hattype;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class HattypeDao implements DaoInterface<Hattype> {
//    public static HattypeDao getInstance() {
//        return new HattypeDao();
//    }

    @Override
    public void insert(Hattype hattype) {
        String insertSql = "insert into Hattype(typeName) value (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, hattype.getTypeName());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Hattype hattype) {
        String updateSql = "UPDATE from Hattype\n"
                + "Set typeName=?, where idHattype = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(2, hattype.getIdHattype());
            preparedStatement.setString(1, hattype.getTypeName());

            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM Hattype where idHattype = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Hattype> selectAll() {
        List<Hattype> hattypes = new ArrayList<>();
        String sql = "Select * from Hattype";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idHattype = resultSet.getInt("idHattype");
                String typeName = resultSet.getString("typeName");

                hattypes.add(new Hattype(idHattype, typeName));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return hattypes;
    }

    @Override
    public Hattype selectById(int id) {
        String sql = "Select * from Hattype where idHattype="+id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idHattype = resultSet.getInt("idHattype");
                String typeName = resultSet.getString("typeName");

                return new Hattype(idHattype, typeName);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<Hattype> selectByCondition(String condition) {
        return null;
    }
}
