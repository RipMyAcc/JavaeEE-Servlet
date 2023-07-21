package com.books.filters;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.books.beans.setting.Setting;
import com.books.connect.SQLServerConnUtils_SQLJDBC;
import com.books.ultis.SettingDBUtils;

@WebFilter(urlPatterns = { "/*" })
public class SettingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(true);
        Setting setting = null;
        try {
            Connection connection = SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
            setting = SettingDBUtils.querySetting(connection).get(0);
        } catch (Exception e) {
            setting = new Setting(0, "off", "ERROR", "ERROR", "");
        }
        session.setAttribute("setting", setting);


        String status = setting.getStatus();
        if (status.equals("off")) {

            String uri = ((HttpServletRequest) request).getRequestURI();
            boolean condition = uri.startsWith("/books/admin/") || uri.startsWith("/books/css/")
                    || uri.startsWith("/books/IMG/") || uri.startsWith("/books/js/")
                    || uri.startsWith("/books/resources/");
            if (condition) {
                chain.doFilter(request, response);
            } else {
                request.getRequestDispatcher("/WEB-INF/views/shutdown.jsp").forward(request, response);
            }
            
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
