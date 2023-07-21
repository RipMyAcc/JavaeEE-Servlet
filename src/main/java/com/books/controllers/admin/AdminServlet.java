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

import com.books.beans.admin.Admin;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.AdminDBUtils;

@WebServlet(urlPatterns = { "/admin/admin" })
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Admin> list = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            list = AdminDBUtils.queryAdmin(connection);
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }

        req.setAttribute("adminList", list);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/admin.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("add")) {

        } else if (action.equals("edit")) {
            int adminId = Integer.parseInt(req.getParameter("adminId"));
            HttpSession session = req.getSession();
            session.setAttribute("adminId", adminId);
            resp.sendRedirect(req.getContextPath() + "/admin/admin/edit");
        } else if (action.equals("delete")) {

            try {
                int adminId = Integer.parseInt(req.getParameter("adminId"));
                Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
                AdminDBUtils.deleteAdmin(connection, adminId);
            } catch (Exception e) {
                String message = null;
                message = e.getMessage();
                req.setAttribute("message", message);
            }

            doGet(req, resp);
        }
    }
}
