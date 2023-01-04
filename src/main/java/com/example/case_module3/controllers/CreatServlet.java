package com.example.case_module3.controllers;

import com.example.case_module3.models.Hat;
import com.example.case_module3.services.HatService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/creat")
public class CreatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/creat.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hatName = req.getParameter("hatName");
        String img = req.getParameter("img");
        String listImg = req.getParameter("listImg");
        double sellPrice = Double.parseDouble(req.getParameter("sellPrice"));
        double inputPrice = Double.parseDouble(req.getParameter("inputPrice"));
        double promotionPrice = Double.parseDouble(req.getParameter("promotionPrice"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String description = req.getParameter("description");
        String detail = req.getParameter("detail");
        Hat hat = new Hat(hatName,img,listImg,sellPrice,inputPrice,promotionPrice,quantity,description,detail);
        HatService.Add(hat);
        req.setAttribute("note3", "Thêm thành công!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req,resp);
    }
}
