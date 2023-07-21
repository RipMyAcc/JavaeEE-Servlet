package com.books.ultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.books.beans.book.Book;
import com.books.beans.book.BookCategory;

public class BookDBUtils {

	public static List<Book> queryBook(Connection conn) throws SQLException {
		String sql = "select s.id as idSach, s.tenSach, s.theLoai, s.moTa, s.giaTien, s.soLuongTon, s.hinhAnh, t.id as idTheLoai, t.tenTheLoai from Sach s inner join TheLoai t on s.theLoai = t.id";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Book> list = new ArrayList<Book>();
		while (rs.next()) {
			int id = rs.getInt("idSach");
			String name = rs.getString("tenSach");
			String category = rs.getString("tenTheLoai");
			String description = rs.getString("moTa");
			double price = rs.getDouble("giaTien");
			int amount = rs.getInt("soLuongTon");
			String img = rs.getString("hinhAnh");
			Book book = new Book(id, name, category, description, price, amount, img);

			list.add(book);
		}
		return list;
	}

	public static Book findBook(Connection conn, int bookId) throws SQLException {
		String sql = "select s.id as idSach, s.tenSach, s.theLoai, s.moTa, s.giaTien, s.soLuongTon, s.hinhAnh, t.id as idTheLoai, t.tenTheLoai from Sach s inner join TheLoai t on s.theLoai = t.id where s.id = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, bookId);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("idSach");
			String name = rs.getString("tenSach");
			String category = rs.getString("tenTheLoai");
			String description = rs.getString("moTa");
			double price = rs.getDouble("giaTien");
			int amount = rs.getInt("soLuongTon");
			String img = rs.getString("hinhAnh");
			Book book = new Book(id, name, category, description, price, amount, img);
			return book;
		}
		return null;
	}

	public static void updateBook(Connection conn, Book book) throws SQLException {
		String sql = "update Sach set tenSach=?, theLoai=?, moTa=?, giaTien=?, soLuongTon=?, hinhAnh=?  where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, book.getName());// tenSach

		String category = book.getCategory();
		BookCategory bookCategory = BookCategoryDBUtils.findBookCategory(conn, category);
		pstm.setInt(2, bookCategory.getId());// theLoai

		pstm.setString(3, book.getDescription());// moTa
		pstm.setDouble(4, book.getPrice());// giaTien
		pstm.setInt(5, book.getAmount());// soLuongTon
		pstm.setString(6, book.getImg());// img

		pstm.setInt(7, book.getId());// id

		pstm.executeUpdate();
	}

	public static void insertBook(Connection conn, Book book) throws SQLException {
		String sql = "insert into Sach(tenSach, theLoai, moTa, giaTien, soLuongTon, hinhAnh) values (?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, book.getName());// tenSach

		String category = book.getCategory();
		BookCategory bookCategory = BookCategoryDBUtils.findBookCategory(conn, category);
		pstm.setInt(2, bookCategory.getId());// theLoai

		pstm.setString(3, book.getDescription());// moTa
		pstm.setDouble(4, book.getPrice());// giaTien
		pstm.setInt(5, book.getAmount());//soLuongTon
		pstm.setString(6, book.getImg());// img

		pstm.executeUpdate();
	}

	public static void deleteBook(Connection conn, int bookId) throws SQLException {
		String sql = "delete from Sach where id= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, bookId);

		pstm.executeUpdate();
	}

}