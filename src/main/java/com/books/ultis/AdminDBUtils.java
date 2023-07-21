package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.books.beans.admin.Admin;

public class AdminDBUtils {

	public static List<Admin> queryAdmin(Connection conn) throws SQLException {
		String sql = "select id, userName, password from Admin";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Admin> list = new ArrayList<Admin>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			Admin admin = new Admin(id, userName, password);
			list.add(admin);
		}
		return list;
	}

	public static Admin findAdmin(Connection conn, int adminID) throws SQLException {
		String sql = "select id, userName, password from Admin where id = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, adminID);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			Admin admin = new Admin(id, userName, password);
			return admin;
		}
		return null;
	}

	public static Admin findAdmin(Connection conn, String adminUsername, String adminPassword) throws SQLException {
		String sql = "select id, userName, password from Admin where userName = ? and password =?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, adminUsername);
		pstm.setString(2, adminPassword);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			Admin admin = new Admin(id, userName, password);
			return admin;
		}
		return null;
	}

	public static void updateAdmin(Connection conn, Admin admin) throws SQLException {
		String sql = "update Admin set userName=?, password=?  where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, admin.getUserName());// userName
		pstm.setString(2, admin.getPassword());// password

		pstm.setInt(3, admin.getId());// id
		pstm.executeUpdate();
	}

	public static void insertAdmin(Connection conn, Admin admin) throws SQLException {
		String sql = "insert into Admin(userName, password) values (?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, admin.getUserName());// userName
		pstm.setString(2, admin.getPassword());// password

		pstm.executeUpdate();
	}

	public static void deleteAdmin(Connection conn, int adminId) throws SQLException {
		String sql = "delete from Admin where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, adminId);

		pstm.executeUpdate();
	}

}