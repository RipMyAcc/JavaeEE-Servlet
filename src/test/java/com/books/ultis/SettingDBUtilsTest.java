package com.books.ultis;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.books.beans.admin.Admin;
import com.books.beans.setting.Setting;
import com.books.connect.SQLServerConnUtils_SQLJDBC;

public class SettingDBUtilsTest {
    // @Test
    // void testDeleteSetting() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         SettingDBUtils.deleteSetting(connection, 3);

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);
    // }

    // @Test
    // void testFindSetting() {

    //     Connection connection = null;
    //     Exception exception = null;
    //     Setting setting = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         setting = SettingDBUtils.findSetting(connection, 3);
    //         System.out.println(setting);
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }

    //     assertNotNull(connection);
    //     assertNull(exception);

    // }

    // @Test
    // void testInsertSetting() {
    // Connection connection = null;
    // Exception exception = null;
    // List<Setting> list = new ArrayList<Setting>();
    // try {
    // connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    // } catch (Exception e) {
    // exception = e;
    // System.out.println(e);
    // }
    // Setting setting = new Setting(0, "on", "sách", "sách", "sách");
    // list.add(setting);

    // try {
    // for (Setting s : list) {
    // SettingDBUtils.insertSetting(connection, s);
    // }
    // } catch (Exception e) {
    // if (!e.getMessage().contains("Violation of UNIQUE KEY constraint")) {
    // System.out.println(e);
    // exception = e;
    // }
    // }
    // assertNotNull(connection);
    // assertNull(exception);
    // }

    // @Test
    // void testQuerySetting() {
    //     Connection connection = null;
    //     Exception exception = null;
    //     List<Setting> list = null;
    //     try {
    //         connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     try {
    //         list = SettingDBUtils.querySetting(connection);
    //         for (Setting setting : list) {
    //             System.out.println(setting);
    //         }
    //     } catch (Exception e) {
    //         exception = e;
    //         System.out.println(e);
    //     }
    //     assertNotNull(connection);
    //     assertNull(exception);

    // }

    // @Test
    // void testUpdateSetting() {
    // Connection connection = null;
    // Exception exception = null;
    // try {
    // connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();

    // } catch (Exception e) {
    // exception = e;
    // System.out.println(e);
    // }
    // try {
    // Setting setting = new Setting(3, "off", "null", "null", "null");
    // SettingDBUtils.updateSetting(connection, setting);

    // } catch (Exception e) {
    // exception = e;
    // System.out.println(e);
    // }
    // assertNotNull(connection);
    // assertNull(exception);
    // }
}
