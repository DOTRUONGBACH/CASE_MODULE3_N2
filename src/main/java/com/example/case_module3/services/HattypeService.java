package com.example.case_module3.services;

import com.example.case_module3.dao.HattypeDao;
import com.example.case_module3.models.Hattype;

import java.util.List;

public class HattypeService {
    public static List<Hattype> hattypes = HattypeDao.getInstance().selectAll();

    public void Add(Hattype hattype) {
        HattypeDao.getInstance().insert(hattype);
        hattypes = HattypeDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        HattypeDao.getInstance().delete(id);
        hattypes = HattypeDao.getInstance().selectAll();
    }

    public void Edit() {
//        HattypeDao.getInstance().update(HattypeDao.getInstance().selectById());
        hattypes = HattypeDao.getInstance().selectAll();
    }

//    public static Hattype selectById() {
//        return HattypeDao.getInstance().selectById(selectById());
//    }
}
