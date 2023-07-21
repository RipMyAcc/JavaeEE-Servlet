package com.books.connect;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

public class SQLServerConnUtils_SQLJDBCTest {
    @Test
    void testGetSQLServerConnection_SQLJDBC() {
        Connection connection =null;
        Exception exception = null;
        try {
            connection=SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
        } catch (Exception e) {
            exception=e;
            System.out.println(e);
        }
        assertNotNull(connection);
        assertNull(exception);
    }
}
