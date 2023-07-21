package com.books.controllers.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.books.beans.admin.Admin;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.AdminDBUtils;
@WebServlet(urlPatterns = {"/admin/"})

public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/login.jsp");
        requestDispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String username= req.getParameter("username");
        String password = req.getParameter("password");
        Admin admin = null;
        String message=null;
        try {
            admin=AdminDBUtils.findAdmin(SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC(), username,password);
        } catch (Exception e) {
            message=e.getMessage();
        }

        if (admin!=null) {
            HttpSession session= req.getSession(true);
            session.setAttribute("admin", admin);
            resp.sendRedirect(req.getContextPath()+"/admin/dashboard");
        }
        else{
            if (message==null) {         
                message="login false";
                }
                req.setAttribute("message", message);
                doGet(req, resp);        
        }

       
    }
}
