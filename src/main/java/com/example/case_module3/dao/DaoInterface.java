package com.example.case_module3.dao;

import com.example.case_module3.models.Hat;

import java.util.ArrayList;
import java.util.List;

public interface DaoInterface<T> {
    public void insert(T t);

    public boolean update(T t);

    public void delete(int id);

    public List<T> selectAll();

    public T selectById();

    public ArrayList<T> selectByCondition(String condition);

}
