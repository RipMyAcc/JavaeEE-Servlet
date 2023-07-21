package com.books.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/admin/*" })
public class AuthenticationFilter implements Filter {
  public void init(FilterConfig config) throws ServletException {
  }

  public void destroy() {
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws ServletException, IOException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;
    HttpSession session = req.getSession(false);

    boolean loggedIn = session != null && session.getAttribute("admin") != null;
    String loginURI = req.getContextPath() + "/admin/";

    boolean loginRequest = req.getRequestURI().equals(loginURI);
    boolean loginPage = req.getRequestURI().endsWith("login.jsp");

    if (loggedIn || loginRequest || loginPage) {
      chain.doFilter(request, response);
    } else {
      res.sendRedirect(loginURI);
    }
  }
}
