package com.books.controllers.user;

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
import javax.servlet.http.HttpSession;

import com.books.beans.book.Book;
import com.books.beans.order.OrderProduct;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;

@WebServlet(urlPatterns = { "/cart" })
public class CartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strAction = request.getParameter("action");

        if (strAction != null && !strAction.equals("")) {
            if (strAction.equals("add")) {
                addToCart(request);
            } else if (strAction.equals("update")) {
                updateCart(request);
            } else if (strAction.equals("delete")) {
                deleteCart(request);
            }
        }
        setTotal(request);
        // response.sendRedirect(request.getContextPath() + "/cart");
        RequestDispatcher requestDispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/user/cart.jsp");
        requestDispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strAction = request.getParameter("action");

    }

    private void addToCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<OrderProduct> cart = null;

        Object sessionCart = session.getAttribute("cart");
        if (sessionCart != null) {
            cart = (List<OrderProduct>) sessionCart;
        } else {
            cart = new ArrayList<OrderProduct>();
            session.setAttribute("cart", cart);
        }

        int bookId = Integer.parseInt(request.getParameter("id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Book book = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            book = BookDBUtils.findBook(connection, bookId);

        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            request.setAttribute("message", message);
        }

        OrderProduct orderProduct = new OrderProduct(0, 0, bookId, quantity, null, book.getName(), book.getCategory(),
                book.getDescription(), book.getPrice(), book.getAmount(), book.getImg(),
                String.format("%.1f", book.getPrice() * quantity));

        if (cart.isEmpty()) {
            cart.add(orderProduct);

        } else {
            for (OrderProduct p : cart) {
                if (p.getProductId() == bookId) {
                    p.setAmount(quantity + p.getAmount());

                    p.setTotalPrice(String.format("%.1f", p.getProductPrice() * p.getAmount()));
                    return;
                }
            }
            cart.add(orderProduct);

        }

    }

    private void deleteCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        int bookId = Integer.parseInt(request.getParameter("id"));
        List<OrderProduct> cart = null;

        Object sessionCart = session.getAttribute("cart");
        if (sessionCart != null) {
            cart = (List<OrderProduct>) sessionCart;
        } else {
            cart = new ArrayList<OrderProduct>();
        }

        for (OrderProduct p : cart) {
            if (p.getProductId() == bookId) {
                cart.remove(p);
                break;
            }
        }
    }

    private void updateCart(HttpServletRequest request) {
        HttpSession session = request.getSession();

    }

    private void setTotal(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<OrderProduct> cart = (List<OrderProduct>) session.getAttribute("cart");
        double totalPrice = 0;
        int totalQuantity = 0;
        if (cart != null) {
            for (OrderProduct orderProduct : cart) {
                totalPrice += (orderProduct.getAmount() * orderProduct.getProductPrice());
                totalQuantity++;
            }
        }
        String strTotalPrice = String.format("%.1f", totalPrice);
        session.setAttribute("totalPrice", strTotalPrice);
        session.setAttribute("totalQuantity", totalQuantity);

    }

}
