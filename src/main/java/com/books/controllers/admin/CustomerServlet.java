package com.books.controllers.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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

@WebServlet(urlPatterns = { "/admin/customer" })
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> list = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            list = CustomerDBUtils.queryCustomer(connection);
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }

        req.setAttribute("customerList", list);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/customer.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("add")) {

        } else if (action.equals("edit")) {
            int customerId = Integer.parseInt(req.getParameter("customerId"));
            HttpSession session = req.getSession();
            session.setAttribute("customerId", customerId);
            resp.sendRedirect(req.getContextPath() + "/admin/customer/edit");
        } else if (action.equals("delete")) {

            try {
                int customerId = Integer.parseInt(req.getParameter("customerId"));
                Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
                CustomerDBUtils.deleteCustomer(connection, customerId);
            } catch (Exception e) {
                String message = null;
                message = e.getMessage();
                req.setAttribute("message", message);
            }

            doGet(req, resp);
        }
    }
}
