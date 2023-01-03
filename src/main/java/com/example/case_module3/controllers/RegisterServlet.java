package com.example.case_module3.controllers;

import com.example.case_module3.models.User;
import com.example.case_module3.services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fullname = req.getParameter("fullName");
        int age = Integer.parseInt(req.getParameter("age"));
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        User user = new User(username, password, fullname, age, phone, email);
        UserService.Add(user);
        req.setAttribute("note2", "Đăng ký thành công!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/hat");
        dispatcher.forward(req,resp);
    }
}
