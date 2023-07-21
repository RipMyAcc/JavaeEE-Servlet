package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.order.Order;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class OrderDBUtilsTest {

    // @Test
    // void testDeleteOrder() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         OrderDBUtils.deleteOrder(connection, 1);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindOrder() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Order order = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         order = OrderDBUtils.findOrder(connection, 1);
    //         System.out.println(order);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testInsertOrder() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Order> list = new ArrayList<Order>();
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     Order order = new Order(0, 2, 2, 2, new Date());
    //     list.add(order);
    //     order = new Order(0, 3, 3, 6, new Date());
    //     list.add(order);
    //     order = new Order(0, 4, 2, 5, new Date());
    //     list.add(order);
    //     try {
    //         for (Order c : list) {
    //             OrderDBUtils.insertOrder(connection, c);
    //         }
    //     } catch (Exception e) {
    //         if (!e.getMessage().contains("Violation of UNIQUE KEY constraint")) {
    //             System.out.println(e);
    //             exception = e;
    //         }
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testQueryOrder() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Order> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = OrderDBUtils.queryOrder(connection);
    //         for (Order order : list) {
    //             System.out.println(order);
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testUpdateOrder() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         Order order = new Order(1, 4, 5, 1999, new Date());
    //         OrderDBUtils.updateOrder(connection, order);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

}
