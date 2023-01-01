package com.example.case_module3.services;

import com.example.case_module3.dao.HatDao;
import com.example.case_module3.models.Hat;

import java.util.List;

public class HatService {
    public static List<Hat> hats = HatDao.getInstance().selectAll();
public void Add(Hat hat){
HatDao.getInstance().insert(hat);
hats = HatDao.getInstance().selectAll();
}

}
