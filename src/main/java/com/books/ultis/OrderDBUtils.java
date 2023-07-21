package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.books.beans.order.Order;

public class OrderDBUtils {

	public static List<Order> queryOrder(Connection conn) throws SQLException {
		String sql = "select id, idKhach, idSach, soLuong, ngayMua from DonHang";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Order> list = new ArrayList<Order>();
		while (rs.next()) {
			int id = rs.getInt("id");
			int customerId = rs.getInt("idKhach");
			int productId = rs.getInt("idSach");
			int amount = rs.getInt("soLuong");
			Date date = rs.getTimestamp("ngayMua");
			Order order = new Order(id, customerId, productId, amount, date);
			list.add(order);
		}
		return list;
	}

	public static Order findOrder(Connection conn, int orderId) throws SQLException {
		String sql = "select id, idKhach, idSach, soLuong, ngayMua from DonHang where id = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, orderId);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			int customerId = rs.getInt("idKhach");
			int productId = rs.getInt("idSach");
			int amount = rs.getInt("soLuong");
			Date date = rs.getTimestamp("ngayMua");
			Order order = new Order(id, customerId, productId, amount, date);
			return order;
		}
		return null;
	}

	public static void updateOrder(Connection conn, Order order) throws SQLException {
		String sql = "update DonHang set idKhach=?, idSach=?, soLuong=?, ngayMua=? where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, order.getCustomerId());// idKhach
		pstm.setInt(2, order.getProductId());// idSach
		pstm.setInt(3, order.getAmount());// soLuong

		Timestamp timestamp = new Timestamp(order.getDate().getTime());
		pstm.setTimestamp(4, timestamp);// ngayMua
		pstm.setInt(5, order.getId());// id

		pstm.executeUpdate();
	}

	public static void insertOrder(Connection conn, Order order) throws SQLException {
		String sql = "insert into DonHang(idKhach, idSach, soLuong, ngayMua) values (?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, order.getCustomerId());// idKhach
		pstm.setInt(2, order.getProductId());// idSach
		pstm.setInt(3, order.getAmount());// soLuong

		Timestamp timestamp = new Timestamp(order.getDate().getTime());
		pstm.setTimestamp(4, timestamp);// ngayMua

		pstm.executeUpdate();
	}

	public static void deleteOrder(Connection conn, int orderId) throws SQLException {
		String sql = "delete from DonHang where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, orderId);

		pstm.executeUpdate();
	}

}