package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.books.beans.book.BookCategory;

public class BookCategoryDBUtils {

	public static List<BookCategory> queryBookCategory(Connection conn) throws SQLException {
		String sql = "select id, tenTheLoai, hinhAnh from TheLoai";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<BookCategory> list = new ArrayList<BookCategory>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getNString("tenTheLoai");
			String img = rs.getString("hinhAnh");
			BookCategory bookCategory = new BookCategory(id, name, img);
			list.add(bookCategory);
		}
		return list;
	}

	public static BookCategory findBookCategory(Connection conn, String categoryName) throws SQLException {
		String sql = "select id, tenTheLoai, hinhAnh from TheLoai where tenTheLoai=?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, categoryName);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getNString("tenTheLoai");
			String img = rs.getString("hinhAnh");
			BookCategory bookCategory = new BookCategory(id, name, img);
			return bookCategory;
		}
		return null;
	}

	public static BookCategory findBookCategory(Connection conn, int categoryId) throws SQLException {
		String sql = "select id, tenTheLoai, hinhAnh from TheLoai where id=?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, categoryId);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getNString("tenTheLoai");
			String img = rs.getString("hinhAnh");
			BookCategory bookCategory = new BookCategory(id, name, img);
			return bookCategory;
		}
		return null;
	}

	public static void updateBookCategory(Connection conn, BookCategory bookCategory) throws SQLException {
		String sql = "update TheLoai set tenTheLoai=?, hinhAnh=?  where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, bookCategory.getName());
		pstm.setString(2, bookCategory.getImg());
		pstm.setInt(3, bookCategory.getId());
		pstm.executeUpdate();
	}

	public static void insertBookCategory(Connection conn, BookCategory bookCategory) throws SQLException {
		String sql = "insert into TheLoai(tenTheLoai, hinhAnh) values (?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, bookCategory.getName());
		pstm.setString(2, bookCategory.getImg());

		pstm.executeUpdate();
	}

	public static void deleteBookCategory(Connection conn, int id) throws SQLException {
		String sql = "delete from TheLoai where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, id);

		pstm.executeUpdate();
	}

}