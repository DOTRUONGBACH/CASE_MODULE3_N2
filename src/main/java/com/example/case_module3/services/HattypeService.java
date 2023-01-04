package com.example.case_module3.services;

import com.example.case_module3.dao.HattypeDao;
import com.example.case_module3.models.Hattype;

import java.util.ArrayList;
import java.util.List;

public class HattypeService {
    HattypeDao hattypeDao = new HattypeDao();
    public List<Hattype> hattypes = new ArrayList<>();

    public HattypeService() {
        this.hattypes = hattypeDao.selectAll();
    }

    public void Add(Hattype hattype) {
        hattypeDao.insert(hattype);
        hattypes = hattypeDao.selectAll();
    }

    public void Delete(int id) {
        hattypeDao.delete(id);
        hattypes = hattypeDao.selectAll();
    }

    public void Edit() {
//        hattypeDao.update(hattypeDao.selectById());
        hattypes = hattypeDao.selectAll();
    }


}
