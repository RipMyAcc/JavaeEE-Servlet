package com.books.controllers.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.beans.user.Customer;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.CustomerDBUtils;

@WebServlet(urlPatterns = { "/admin/customer/new" })
public class CustomerNewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/customerNew.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        int point = Integer.parseInt(req.getParameter("point"));
        Customer customer = new Customer(0, name, email, phoneNumber, userName, password, point);
        String message=null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            CustomerDBUtils.insertCustomer(connection, customer);
        } catch (Exception e) {
            message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        doGet(req, resp);
    }
}
