package com.books.controllers.user;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.beans.book.Book;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;

@WebServlet(urlPatterns = { "/book-list" })
public class BookListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Book> list = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            list = BookDBUtils.queryBook(connection);
        } catch (Exception e) {
            String message = null;

            if (list.isEmpty()) {
                message="Hiện tại không có sản phẩm";
            }
            message = e.getMessage();
            request.setAttribute("message", message);
        }

        request.setAttribute("bookList", list);
        RequestDispatcher requestDispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/user/bookList.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doGet(request, response);
    }

}
