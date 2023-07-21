package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.book.BookCategory;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class BookCategoryDBUtilsTest {

    // @Test
    // void testDeleteBookCategory() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         BookCategoryDBUtils.deleteBookCategory(connection, 1);

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindBookCategory() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     BookCategory bookCategory = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         bookCategory = BookCategoryDBUtils.findBookCategory(connection, "KINH TẾ");
    //         System.out.println(bookCategory.toString());
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
        
    // }

    // @Test
    // void testInsertBookCategory() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     List<BookCategory> list;
    //     list = new ArrayList<BookCategory>();
    //     BookCategory bookCategory = new BookCategory(0, "TÔN GIÁO","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "THIẾU NHI","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "GIÁO KHOA-THAM KHẢO","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "VĂN HỌC","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "TÂM LÝ-KỸ NĂNG SỐNG","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "SÁCH NGOẠI NGỮ","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "KINH TẾ","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "CHÍNH TRỊ-TRIẾT HỌC","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "BÁO-TẠP CHÍ","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "GIÁO TRÌNH","a");
    //     list.add(bookCategory);

    //     bookCategory = new BookCategory(0, "GIẢI TRÍ","a");
    //     list.add(bookCategory);

    //     try {
    //         for (BookCategory b : list) {
    //             BookCategoryDBUtils.insertBookCategory(connection, b);
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
    // void testQueryBookCategory() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<BookCategory> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = BookCategoryDBUtils.queryBookCategory(connection);
    //         for (BookCategory bookCategory : list) {
    //             System.out.println(bookCategory.toString());
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testUpdateBookCategory() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         BookCategory bookCategory = new BookCategory(1, "tt","a");
    //         BookCategoryDBUtils.updateBookCategory(connection, bookCategory);

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

}
