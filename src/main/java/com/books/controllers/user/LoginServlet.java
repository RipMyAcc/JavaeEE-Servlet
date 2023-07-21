package com.books.controllers.user;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.books.beans.user.Customer;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.CustomerDBUtils;
@WebServlet(urlPatterns = {"/login"})

public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();
        Object sessionAccount= session.getAttribute("account");
        if (sessionAccount!=null) {
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/logout.jsp");
            requestDispatcher.forward(req, resp);
        }

        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/login.jsp");
        requestDispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username= req.getParameter("username");
        String password = req.getParameter("password");
        Customer customer = null;
        String message=null;
        try {
            Connection connection =SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            customer=CustomerDBUtils.findCustomer(connection, username,password);
        } catch (Exception e) {
            message=e.getMessage();
        }

        if (customer!=null) {
            HttpSession session= req.getSession(true);
            session.setAttribute("account", customer);
            resp.sendRedirect(req.getContextPath()+"/book-list");
        }
        else{
            if (message==null) {         
                message="Đăng nhập thất bại";
                }
                req.setAttribute("message", message);
                doGet(req, resp);        
        }

       
    }
}
