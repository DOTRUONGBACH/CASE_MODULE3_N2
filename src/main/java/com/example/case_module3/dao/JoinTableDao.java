package com.example.case_module3.dao;

import com.example.case_module3.models.Hat;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class JoinTableDao {

    public static List<Hat> selectByIdHatIdCata(int idHat, int idCata) {
        String sql = "select * from idhatidcata\n" +
                "where (idHattype = ?) and (idCatagory = ?);";
        List<Hat> hats = new ArrayList<>();
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
            hats.add(new Hat(hatId, hatName, true, img, listImg, sellPrice, inputPrice, promotionPrice, quantity,
                    description, detail, idHattype, idCatagory));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hats;
    }
}
