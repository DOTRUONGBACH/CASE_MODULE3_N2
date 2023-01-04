package com.example.case_module3.controllers;

import com.example.case_module3.models.Hat;
import com.example.case_module3.services.HatService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Hat> hats = HatService.hats;
        req.setAttribute("hats", hats);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/delete.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idmu"));
        List<Hat> hats = HatService.hats;
        HatService.Delete(id);
        req.setAttribute("hats", hats);
        req.setAttribute("note3", "Xóa thành công!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req,resp);
    }
}
