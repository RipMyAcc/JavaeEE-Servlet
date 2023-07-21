package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.admin.Admin;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class AdminDBUtilsTest {
    // @Test
    // void testDeleteAdmin() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         AdminDBUtils.deleteAdmin(connection, 1);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindAdmin() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Admin admin = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         admin = AdminDBUtils.findAdmin(connection, 1);
    //         System.out.println(admin);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindAdminByUsernameAndPassword() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Admin admin = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         admin = AdminDBUtils.findAdmin(connection, "tai","3");
    //         System.out.println(admin);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testInsertAdmin() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Admin> list = new ArrayList<Admin>();
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     Admin admin = new Admin(0, "tam", "123");
    //     list.add(admin);
    //     admin = new Admin(0, "tai", "3");
    //     list.add(admin);
    //     admin = new Admin(0, "thach", "2");
    //     list.add(admin);
        
    //     try {
    //         for (Admin a : list) {
    //             AdminDBUtils.insertAdmin(connection, a);
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
    // void testQueryAdmin() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Admin> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = AdminDBUtils.queryAdmin(connection);
    //         for (Admin admin : list) {
    //             System.out.println(admin);
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testUpdateAdmin() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         Admin admin = new Admin(0, "tm", "13");
    //         AdminDBUtils.updateAdmin(connection, admin);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

}
