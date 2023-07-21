package com.books.controllers.admin;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.books.beans.book.Book;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookDBUtils;

@MultipartConfig
@WebServlet(urlPatterns = { "/admin/product/new" })
public class ProductNewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/productNew.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String category = req.getParameter("category");
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        int amount = Integer.parseInt(req.getParameter("amount"));


        
        String SAVE_DIR = "/WEB-INF/resources/IMG/books";
        String fileName = "";
        String savedFileName = "";
        
        Part filePart = req.getPart("img");
        
        if (filePart.getSize() == 0) {
           // No file is chosen, set the default picture
           fileName = "default.img";
        } else {
           // A file is chosen, save it to the desired folder
           fileName = getFileName(filePart);
           String appPath = req.getServletContext().getRealPath("");
           String savePath = appPath + File.separator + SAVE_DIR;
           File fileSaveDir = new File(savePath);
           if (!fileSaveDir.exists()) {
              fileSaveDir.mkdir();
           }
           savedFileName = savePath + File.separator + fileName;
           filePart.write(savedFileName);
        }
        


        Book book = new Book(0, name, category, description, price, amount, fileName);
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            BookDBUtils.insertBook(connection, book);
        } catch (Exception e) {
            String message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        doGet(req, resp);
    }
    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }
        return "";
    }
}
