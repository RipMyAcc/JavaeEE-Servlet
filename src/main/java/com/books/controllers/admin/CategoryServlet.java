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

import com.books.beans.book.BookCategory;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookCategoryDBUtils;

@WebServlet(urlPatterns = { "/admin/category" })
public class CategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BookCategory> list = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            list = BookCategoryDBUtils.queryBookCategory(connection);
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }

        req.setAttribute("bookCategoryList", list);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/category.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("add")) {

        } else if (action.equals("edit")) {
            int categoryId = Integer.parseInt(req.getParameter("categoryId"));
            HttpSession session = req.getSession();
            session.setAttribute("categoryId", categoryId);
            resp.sendRedirect(req.getContextPath() + "/admin/category/edit");
        } else if (action.equals("delete")) {

            try {
                int categoryId = Integer.parseInt(req.getParameter("categoryId"));
                Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
                BookCategoryDBUtils.deleteBookCategory(connection, categoryId);
            } catch (Exception e) {
                String message = null;
                message = e.getMessage();
                req.setAttribute("message", message);
            }

            doGet(req, resp);
        }
    }
}
