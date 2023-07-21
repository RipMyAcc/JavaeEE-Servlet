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
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.books.beans.book.BookCategory;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.BookCategoryDBUtils;

@MultipartConfig
@WebServlet(urlPatterns = { "/admin/category/edit" })
public class CategoryEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookCategory bookCategory = null;
        HttpSession session = req.getSession();
        int id = (Integer) session.getAttribute("categoryId");
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            bookCategory = BookCategoryDBUtils.findBookCategory(connection, id);
        } catch (Exception e) {
            String message=null;
            message=e.getMessage();
            req.setAttribute("message", message);
        }
        if (bookCategory != null) {
            req.setAttribute("bookCategory", bookCategory);
        }
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/admin/categoryEdit.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        
        String SAVE_DIR = "/WEB-INF/resources/IMG/category";
        String fileName = "";
        String savedFileName = "";
        
        Part filePart = req.getPart("img");
        
        if (filePart.getSize() == 0) {
           // No file is chosen, set the product picture
           fileName = req.getParameter("imgName");
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
        



        BookCategory bookCategory = new BookCategory(id, name, fileName);
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            BookCategoryDBUtils.updateBookCategory(connection, bookCategory);
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
