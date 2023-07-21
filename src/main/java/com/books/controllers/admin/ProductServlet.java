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

import com.books.beans.book.Book;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;

@WebServlet(urlPatterns = { "/admin/product" })
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> list = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            list = BookDBUtils.queryBook(connection);
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }

        req.setAttribute("productList", list);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/product.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("add")) {

        } else if (action.equals("edit")) {
            int productId = Integer.parseInt(req.getParameter("productId"));
            HttpSession session = req.getSession();
            session.setAttribute("productId", productId);
            resp.sendRedirect(req.getContextPath() + "/admin/product/edit");
        } else if (action.equals("delete")) {

            try {
                int productId = Integer.parseInt(req.getParameter("productId"));
                Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
                BookDBUtils.deleteBook(connection, productId);
            } catch (Exception e) {
                String message = null;
                message = e.getMessage();
                req.setAttribute("message", message);
            }

            doGet(req, resp);
        }
    }
}
