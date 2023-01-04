package com.example.case_module3.controllers;

import com.example.case_module3.dao.HattypeDao;
import com.example.case_module3.models.Hat;
import com.example.case_module3.models.Hattype;
import com.example.case_module3.services.HatService;
import com.example.case_module3.services.HattypeService;
import com.example.case_module3.services.JoinTableService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/hatstyle")
public class HatStyleSerrvlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/hattype.jsp");
        int idHat = Integer.parseInt(req.getParameter("idHat"));
        int idCata = Integer.parseInt(req.getParameter("idCata"));
//        List<Hattype> hattypes = HattypeService.hattypes;
//        HttpSession session = req.getSession();
        Hattype hattype = HattypeDao.getInstance().selectById(idHat);
        List<Hat> hats = JoinTableService.findByIdHatIdCata(idHat, idCata);
        String name = hattype.getTypeName();
        req.setAttribute("hattype",name);
        req.setAttribute("hats",hats);
        dispatcher.forward(req, resp);
    }
}
