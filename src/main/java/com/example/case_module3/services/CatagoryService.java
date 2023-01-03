package com.example.case_module3.services;

import com.example.case_module3.dao.CatagoryDao;
import com.example.case_module3.models.Catagory;

import java.util.List;

public class CatagoryService {
    public static List<Catagory> catagories = CatagoryDao.getInstance().selectAll();

    public void Add(Catagory catagory) {
        CatagoryDao.getInstance().insert(catagory);
        catagories = CatagoryDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        CatagoryDao.getInstance().delete(id);
        catagories = CatagoryDao.getInstance().selectAll();
    }

    public void Edit() {
//        CatagoryDao.getInstance().update(CatagoryDao.getInstance().selectById(id));
        catagories = CatagoryDao.getInstance().selectAll();
    }
}
