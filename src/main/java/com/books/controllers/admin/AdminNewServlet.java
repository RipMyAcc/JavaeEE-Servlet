package com.books.controllers.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.beans.admin.Admin;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.AdminDBUtils;

@WebServlet(urlPatterns = { "/admin/admin/new" })
public class AdminNewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/adminNew.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        Admin admin = new Admin(0, userName, password);
        String message=null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            AdminDBUtils.insertAdmin(connection, admin);
        } catch (Exception e) {
            message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        doGet(req, resp);
    }
}
