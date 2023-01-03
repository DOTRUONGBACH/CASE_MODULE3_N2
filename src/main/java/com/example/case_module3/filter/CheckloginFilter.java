package com.example.case_module3.filter;

import com.example.case_module3.models.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class CheckloginFilter extends HttpFilter {
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException, IOException, ServletException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("account");
        String path = req.getContextPath();

        if(user == null){
            res.sendRedirect("/home");
        }else {
            chain.doFilter(req,res);
        }
    }
}
