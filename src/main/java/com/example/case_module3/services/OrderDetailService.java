package com.example.case_module3.services;

import com.example.case_module3.dao.OrderDetailDao;
import com.example.case_module3.models.OrderDetail;

import java.util.List;

public class OrderDetailService {
    public static List<OrderDetail> orderDetails = OrderDetailDao.getInstance().selectAll();

    public void Add(OrderDetail orderDetail) {
        OrderDetailDao.getInstance().insert(orderDetail);
        orderDetails = OrderDetailDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        OrderDetailDao.getInstance().delete(id);
        orderDetails = OrderDetailDao.getInstance().selectAll();
    }

    public void Edit() {
        OrderDetailDao.getInstance().update(OrderDetailDao.getInstance().selectById());
        orderDetails = OrderDetailDao.getInstance().selectAll();
    }
}
