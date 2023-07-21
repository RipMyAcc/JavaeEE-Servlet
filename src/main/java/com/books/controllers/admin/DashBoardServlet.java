package com.books.controllers.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.beans.book.Book;
import com.books.beans.order.Order;
import com.books.beans.user.Customer;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;
import com.books.ultis.CustomerDBUtils;
import com.books.ultis.OrderDBUtils;

@WebServlet(urlPatterns = { "/admin/dashboard" })
public class DashBoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> recentCustomerList = null;
        int numberOfCustomer =0;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            List<Customer> tempList = CustomerDBUtils.queryCustomer(connection);
            numberOfCustomer=tempList.size();
            if (numberOfCustomer < 7) {
                recentCustomerList = tempList;
            } else {
                recentCustomerList = new ArrayList<Customer>();

                for (int i = numberOfCustomer; i > (numberOfCustomer - 6); i--) {
                    recentCustomerList.add(tempList.get(i - 1));
                }

            }
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }
        req.setAttribute("numberOfCustomer", numberOfCustomer);
        req.setAttribute("customerList", recentCustomerList);



        List<Book> recentBookList = null;
        int numberOfBook =0;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            List<Book> tempList = BookDBUtils.queryBook(connection);
            numberOfBook= tempList.size();
            if (numberOfBook < 7) {
                recentBookList = tempList;
            } else {
                recentBookList = new ArrayList<Book>();

                for (int i = numberOfBook; i > (numberOfBook - 6); i--) {
                    recentBookList.add(tempList.get(i - 1));
                }

            }
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }
        req.setAttribute("numberOfBook", numberOfBook);
        req.setAttribute("productList", recentBookList);



        double income=0;
        int numberOfOrder=0;

        try {
            List<Order> orderList = null;
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            orderList = OrderDBUtils.queryOrder(connection);
            numberOfOrder=orderList.size();
    
            for (Order order : orderList) {
                Book book= BookDBUtils.findBook(connection, order.getProductId());
                income += (book.getPrice()*order.getAmount());
            }
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
        }

        String stringIncome =String.format("%.3f",income);

        req.setAttribute("numberOfOrder", numberOfOrder);
        req.setAttribute("income", stringIncome);







        RequestDispatcher requestDispatcher = req.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/admin/dashboard.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
