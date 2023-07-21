package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.user.Customer;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class CustomerDBUtilsTest {

    // @Test
    // void testDeleteCustomer() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         CustomerDBUtils.deleteCustomer(connection, 1);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindCustomer() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Customer customer = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         customer = CustomerDBUtils.findCustomer(connection, 1);
    //         System.out.println(customer);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }


    //  @Test
    // void testFindCustomerUsernamePassword() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Customer customer = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         customer = CustomerDBUtils.findCustomer(connection, "taiga", "taiga");
    //         System.out.println(customer);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testInsertCustomer() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Customer> list = new ArrayList<Customer>();
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     Customer customer = new Customer(0, "Tâm", "tam@gmail.com", "+090989089", "tamga", "tamga", 1);
    //     list.add(customer);
    //     customer = new Customer(0, "Thạch", "thach@gmail.com", "+090119089", "thachga", "thachga", 2);
    //     list.add(customer);
    //     customer = new Customer(0, "Tài", "tai@gmail.com", "+090119779", "taiga", "taiga", 4);
    //     list.add(customer);
    //     try {
    //         for (Customer c : list) {
    //             CustomerDBUtils.insertCustomer(connection, c);
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
    // void testQueryCustomer() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Customer> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = CustomerDBUtils.queryCustomer(connection);
    //         for (Customer c : list) {
    //             System.out.println(c.toString());
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testUpdateCustomer() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         Customer customer = new Customer(1, "Tm", "gmail.com", "+", "ga", "ga", 1000);
    //         CustomerDBUtils.updateCustomer(connection, customer);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

}
