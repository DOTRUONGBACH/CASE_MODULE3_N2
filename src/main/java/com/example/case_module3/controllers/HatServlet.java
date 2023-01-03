package com.example.case_module3.controllers;

import com.example.case_module3.dao.UserDao;
import com.example.case_module3.models.User;
import com.example.case_module3.services.HatService;
import com.example.case_module3.services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/hat")
public class HatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
        dispatcher.forward(req, resp);
    }

      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
          List<User> users = UserDao.getInstance().selectAcc();

          for (int i = 0; i < users.size(); i++) {
              if(username.equals(users.get(i).getUsername())&&password.equals(users.get(i).getPassword())){
                  RequestDispatcher dispatcher = req.getRequestDispatcher("/user.jsp");
                  dispatcher.forward(req,resp);
              }
          }
          req.setAttribute("note", "Sai ten dang nhap!");
          RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
          dispatcher.forward(req,resp);


    }
    }

