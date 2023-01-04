package com.example.case_module3.services;

import com.example.case_module3.dao.HatDao;
import com.example.case_module3.dao.JoinTableDao;
import com.example.case_module3.models.Hat;

import java.util.List;

public class JoinTableService {
    public static List<Hat> findByIdHatIdCata(int idHat, int idCata) {
        return JoinTableDao.selectByIdHatIdCata(idHat, idCata);
    }
}
