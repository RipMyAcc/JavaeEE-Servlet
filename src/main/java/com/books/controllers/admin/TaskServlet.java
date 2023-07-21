package com.books.controllers.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.beans.setting.Setting;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.SettingDBUtils;

@WebServlet(urlPatterns = { "/admin/task" })

public class TaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Setting setting = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            setting = SettingDBUtils.querySetting(connection).get(0);
        } catch (Exception e) {
            String message = null;
            message = e.getMessage();
            req.setAttribute("message", message);

        }

        req.setAttribute("setting", setting);
        RequestDispatcher requestDispatcher = req.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/admin/task.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message="Saved!!!";
        req.setCharacterEncoding("UTF-8");
        int id= Integer.parseInt(req.getParameter("id"));
        String status = req.getParameter("status");
        String title= req.getParameter("title");
        String description= req.getParameter("description");
        String keyword= req.getParameter("keyword");
        Setting setting = new Setting(id, status, title, description, keyword);
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            SettingDBUtils.updateSetting(connection, setting);
        } catch (Exception e) {
            message=e.getMessage();
        }
        req.setAttribute("message", message);

        doGet(req, resp);
    }
}
