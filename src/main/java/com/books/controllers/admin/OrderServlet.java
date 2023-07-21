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
import com.books.beans.order.OrderProduct;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;
import com.books.ultis.OrderDBUtils;

@WebServlet(urlPatterns = {"/admin/order"})
public class OrderServlet extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<OrderProduct> list = new ArrayList<OrderProduct>();

    try {
        List<Order> orderList = null;
        Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
        orderList = OrderDBUtils.queryOrder(connection);

        for (Order order : orderList) {
            Book book= BookDBUtils.findBook(connection, order.getProductId());
            OrderProduct orderProduct = new OrderProduct(order.getId(), order.getCustomerId(), order.getCustomerId(), order.getAmount(), order.getDate(), book.getName(), book.getCategory(), book.getDescription(), book.getPrice(), book.getAmount(), book.getImg(),String.format("%.3f", book.getPrice()*order.getAmount()));
            list.add(orderProduct);
        }
    } catch (Exception e) {
        String message = null;
        message = e.getMessage();
        req.setAttribute("message", message);
    }

    req.setAttribute("orderProductList", list);
    RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/order.jsp");
    requestDispatcher.forward(req, resp);
   }
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
   }
}
