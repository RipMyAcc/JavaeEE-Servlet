package com.books.controllers.admin;

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

@WebServlet(urlPatterns = { "/admin/customer/edit" })
public class CustomerEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = null;
        HttpSession session = req.getSession();
        int id = (Integer) session.getAttribute("customerId");
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            customer = CustomerDBUtils.findCustomer(connection, id);
        } catch (Exception e) {
            String message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        if (customer != null) {
            req.setAttribute("customer", customer);
        }
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/customerEdit.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        int point = Integer.parseInt(req.getParameter("point"));
        Customer customer = new Customer(id, name, email, phoneNumber, userName, password, point);

        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            CustomerDBUtils.updateCustomer(connection, customer);
        } catch (Exception e) {
            String message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        doGet(req, resp);
    }
}
