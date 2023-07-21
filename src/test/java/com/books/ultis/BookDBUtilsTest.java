package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.book.Book;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class BookDBUtilsTest {

    // @Test
    // void testDeleteBook() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         BookDBUtils.deleteBook(connection, 1);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindBook() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     Book book = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         book = BookDBUtils.findBook(connection, 1);
    //         System.out.println(book);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testInsertBook() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Book> list = new ArrayList<Book>();
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     Book book = new Book(0, "Thánh Hiền 1", "Tôn giáo", "idk", 2.099, 2, "thanhhien1.jpg");
    //     list.add(book);
    //     book = new Book(0, "Thánh Hiền 2", "Tôn giáo", "mbik", 3.0998, 1, "thanhhien2.jpg");
    //     list.add(book);
    //     try {
    //         for (Book b : list) {
    //             BookDBUtils.insertBook(connection, b);

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
    // void testQueryBook() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Book> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = BookDBUtils.queryBook(connection);
    //         for (Book book : list) {
    //             System.out.println(book);
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testUpdateBook() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         Book book = new Book(1, "1", "VĂN HỌC", "k", 2, 0, "1.jpg");
    //         BookDBUtils.updateBook(connection, book);
            
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

}
