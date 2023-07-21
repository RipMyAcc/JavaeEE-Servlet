package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.books.beans.setting.Setting;

public class SettingDBUtils {

	public static List<Setting> querySetting(Connection conn) throws SQLException {
		String sql = "select id, trangThai, tenWeb, moTaWeb, tuKhoaWeb from CaiDat";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Setting> list = new ArrayList<Setting>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String status = rs.getString("trangThai");
			String title = rs.getString("tenWeb");
			String description = rs.getString("moTaWeb");
			String keyword = rs.getString("tuKhoaWeb");
			Setting setting = new Setting(id, status, title, description, keyword);
			list.add(setting);
		}
		return list;
	}

	public static Setting findSetting(Connection conn, int settingID) throws SQLException {
		String sql ="select id, trangThai, tenWeb, moTaWeb, tuKhoaWeb from CaiDat where id = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, settingID);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String status = rs.getString("trangThai");
			String title = rs.getString("tenWeb");
			String description = rs.getString("moTaWeb");
			String keyword = rs.getString("tuKhoaWeb");
			Setting setting = new Setting(id, status, title, description, keyword);
			return setting;
		}
		return null;
	}


	public static void updateSetting(Connection conn, Setting setting) throws SQLException {
		String sql = "update CaiDat set trangThai=?, tenWeb=? , moTaWeb=?, tuKhoaWeb=? where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, setting.getStatus());// trangThai
		pstm.setString(2, setting.getTitle());// tenWeb
		pstm.setString(3, setting.getDescription());// moTaWeb
		pstm.setString(4, setting.getKeyword());// tuKhoaWeb

		pstm.setInt(5, setting.getId());// id
		pstm.executeUpdate();
	}

	public static void insertSetting(Connection conn, Setting setting) throws SQLException {
		String sql = "insert into CaiDat(trangThai, tenWeb, moTaWeb, tuKhoaWeb) values (?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, setting.getStatus());// trangThai
		pstm.setString(2, setting.getTitle());// tenWeb
		pstm.setString(3, setting.getDescription());// moTaWeb
		pstm.setString(4, setting.getKeyword());// tuKhoaWeb
		pstm.executeUpdate();
	}

	public static void deleteSetting(Connection conn, int settingId) throws SQLException {
		String sql = "delete from CaiDat where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, settingId);

		pstm.executeUpdate();
	}

}