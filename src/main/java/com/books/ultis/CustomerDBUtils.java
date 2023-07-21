package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.books.beans.user.Customer;

public class CustomerDBUtils {

	public static List<Customer> queryCustomer(Connection conn) throws SQLException {
		String sql = "select id, ten, email, dienThoai, userName, password, diemThuong from Khach";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("ten");
			String email = rs.getString("email");
			String phoneNumber = rs.getString("dienThoai");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			int point = rs.getInt("diemThuong");
			Customer customer = new Customer(id, name, email, phoneNumber, userName, password, point);

			list.add(customer);
		}
		return list;
	}

	public static Customer findCustomer(Connection conn, int customerId) throws SQLException {
		String sql = "select id, ten, email, dienThoai, userName, password, diemThuong from Khach where id = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, customerId);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("ten");
			String email = rs.getString("email");
			String phoneNumber = rs.getString("dienThoai");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			int point = rs.getInt("diemThuong");
			Customer customer = new Customer(id, name, email, phoneNumber, userName, password, point);
			return customer;
		}
		return null;
	}

	public static Customer findCustomer(Connection conn, String username, String passWord) throws SQLException {
		String sql = "select id, ten, email, dienThoai, userName, password, diemThuong from Khach where userName = ? and password = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, passWord);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("ten");
			String email = rs.getString("email");
			String phoneNumber = rs.getString("dienThoai");
			String userName = rs.getString("userName");
			String password = rs.getString("password");
			int point = rs.getInt("diemThuong");
			Customer customer = new Customer(id, name, email, phoneNumber, userName, password, point);
			return customer;
		}
		return null;
	}

	public static void updateCustomer(Connection conn, Customer customer) throws SQLException {
		String sql = "update Khach set ten=?, email=?, dienThoai=?, userName=?, password=?,diemThuong=?  where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, customer.getName());// ten
		pstm.setString(2, customer.getEmail());// email
		pstm.setString(3, customer.getPhoneNumber());// dienThoai
		pstm.setString(4, customer.getUserName());// userName
		pstm.setString(5, customer.getPassword());// password
		pstm.setInt(6, customer.getPoint());// diemThuong
		pstm.setInt(7, customer.getId());// id

		pstm.executeUpdate();
	}

	public static void insertCustomer(Connection conn, Customer customer) throws SQLException {
		String sql = "insert into Khach(ten, email, dienThoai, userName, password, diemThuong) values (?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, customer.getName());// ten
		pstm.setString(2, customer.getEmail());// email
		pstm.setString(3, customer.getPhoneNumber());// dienThoai
		pstm.setString(4, customer.getUserName());// userName
		pstm.setString(5, customer.getPassword());// password
		pstm.setInt(6, customer.getPoint());// diemThuong

		pstm.executeUpdate();
	}

	public static void deleteCustomer(Connection conn, int customerId) throws SQLException {
		String sql = "delete from Khach where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, customerId);

		pstm.executeUpdate();
	}

}