package com.example.case_module3.filter;

import com.example.case_module3.models.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebFilter(urlPatterns = "/admin.jsp")
public class CheckloginFilter extends HttpFilter {

    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException, IOException, ServletException {
        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("username");
        if(user == null){
            res.sendRedirect("/hat");
        }
        else {
            chain.doFilter(req,res);
        }
    }
}
