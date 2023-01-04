package com.example.case_module3.dao;

import com.example.case_module3.models.Comment;
import com.example.case_module3.models.Hattype;

import java.util.ArrayList;
import java.util.List;

public interface DaoInterface<T> {
    public void insert(T t);

    public boolean update(T t);

    public void delete(int id);

    public List<T> selectAll();

    public T selectById(int id);


    public ArrayList<T> selectByCondition(String condition);

}
