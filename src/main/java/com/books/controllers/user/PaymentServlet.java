package com.books.controllers.user;

import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.books.beans.order.Order;
import com.books.beans.order.OrderProduct;
import com.books.beans.user.Customer;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.CustomerDBUtils;
import com.books.ultis.OrderDBUtils;
@WebServlet(urlPatterns = {"/payment"})

public class PaymentServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session= req.getSession();
        Customer account = (Customer) session.getAttribute("account");
        if (account==null) {
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/login.jsp");
            requestDispatcher.forward(req, resp);
            return;
        }
        List<OrderProduct> cart= ( List<OrderProduct>) session.getAttribute("cart");
        if (cart==null || cart.isEmpty()) {
            String message = "Giỏ hàng trống";
            req.setAttribute("message", message);
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/cart.jsp");
            requestDispatcher.forward(req, resp);
            return;
        }

        try {
            int point =0;
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            for (OrderProduct orderProduct : cart) {
                int customerId=account.getId();
                int productId=orderProduct.getProductId();
                int amount=orderProduct.getAmount();
                Date date = new Date();
                Order order = new Order(0, customerId, productId, amount, date);
                OrderDBUtils.insertOrder(connection, order);

                int productPrice = (int) orderProduct.getProductPrice();

                point+= (productPrice*amount);
            } 
            point=(int) (point*0.1);
            account.setPoint(account.getPoint()+point);
            CustomerDBUtils.updateCustomer(connection, account);
    
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/cart.jsp");
            requestDispatcher.forward(req, resp);
            return;
        }



        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/user/paymentSuccess.jsp");
        requestDispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       doGet(req, resp);

       
    }
}
