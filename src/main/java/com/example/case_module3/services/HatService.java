package com.example.case_module3.services;

import com.example.case_module3.dao.HatDao;
import com.example.case_module3.models.Hat;

import java.util.List;

public class HatService {
    public static List<Hat> hats = HatDao.getInstance().selectAll();

    public static void Add(Hat hat) {
        HatDao.getInstance().insert(hat);
        hats = HatDao.getInstance().selectAll();
    }

    public static void Delete(int id) {
        HatDao.getInstance().delete(id);
        hats = HatDao.getInstance().selectAll();
    }
public static Hat findname(String name){
    for (int i = 0; i < hats.size(); i++) {
        if (name.equals(hats.get(i).getHatName()));
        return new Hat();
    }
        return null;
}
    public void Edit() {
//        HatDao.getInstance().update(HatDao.getInstance().selectById());
        hats = HatDao.getInstance().selectAll();
    }

}
