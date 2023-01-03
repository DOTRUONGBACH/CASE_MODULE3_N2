package com.example.case_module3.services;

import com.example.case_module3.dao.OrderDao;
import com.example.case_module3.models.Order;

import java.util.List;

public class OrderService {
    public static List<Order> orders = OrderDao.getInstance().selectAll();

    public void Add(Order order) {
        OrderDao.getInstance().insert(order);
        orders = OrderDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        OrderDao.getInstance().delete(id);
        orders = OrderDao.getInstance().selectAll();
    }

    public void Edit() {
        OrderDao.getInstance().update(OrderDao.getInstance().selectById());
        orders = OrderDao.getInstance().selectAll();
    }
}
