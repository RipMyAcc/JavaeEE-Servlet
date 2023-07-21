<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <jsp:useBean id="admin" scope="session" class="com.books.beans.admin.Admin" />

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width,initial-scale=1,maximun-scale=1">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet"
                href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/css/style.css">
            <title>Customer's Admin</title>
        </head>

        <body>
            <input type="checkbox" id="nav-toggle">
            <div class="sidebar">
                <div class="sidebar-brand">
                    <h2><span class="las la-bible"></span><span>Books Store</span></h2>
                </div>
                <div class="sidebar-menu">
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/dashboard"><span
                                    class="las la-igloo"></span>
                                <span>Dashboard</span></a>
                        </li>
                        <!-- quản lý list khách hàng -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/customer"><span
                                    class="las la-users"></span>
                                <span>Customers</span></a>
                        </li>
                        <!-- lưu danh sách sản phẩm -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/product"><span
                                    class="las la-clipboard-list"></span>
                                <span>Products</span></a>
                        </li>
                        <!-- lưu đơn hàng -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/order"><span
                                    class="las la-shopping-bag"></span>
                                <span>Orders</span></a>
                        </li>
                        <!-- lưu list các loại sách -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/category"><span
                                    class="las la-receipt"></span>
                                <span>Inventory</span></a>
                        </li>
                        <!-- thêm tài khoản đăng nhập cho admin -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/admin" class="active"><span
                                    class="las la-user-circle"></span>
                                <span>Accounts</span></a>
                        </li>
                        <!-- quyền khóa trang web -->
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/task"><span
                                    class="las la-clipboard-list"></span>
                                <span>Tasks</span></a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/logout"><span
                                    class="las la-sign-out-alt"></span>
                                <span>Log Out</span></a>

                        </li>
                    </ul>
                </div>
            </div>
            <div class="main-content">
                <header>
                    <h3>
                        <label for="nav-toggle">
                            <span class="las la-bars"></span>
                        </label>
                        Dashboard
                    </h3>
                    <div class="search-wrapper">
                        <span class="las la-search"></span>
                        <input type="search" placeholder="search here">
                    </div>
                    <div class="user-wrapper">
                        <img src="${pageContext.request.contextPath}/resources/IMG/people-1.png" width="40px" height="30px" alt="">
                        <div>
                            <h4>${admin.userName}</h4>
                            <small>Super admin</small>
                        </div>
                    </div>
                </header>
                <c:if test="${not empty message}">
                    <p>${message}</p>
                </c:if>
                <main>
                    <h2>List Account Admin</h2>
                    <div class="but-ed">
                        <a href="${pageContext.request.contextPath}/admin/admin/new"><button class="new-button las la-plus">Thêm</button></a>
                        <a href="${pageContext.request.contextPath}/admin/admin"><button class="reload-button las la-sync">Reload</button></a>
                        <!-- <a href="#"><button class="delete-button lar la-trash-alt">Delete</button></a> -->
                    </div>
                    <table>
                        <thead>
                            <tr>
                                <td></td>
                                <td>id</td>
                                <td>username</td>
                                <td>password</td>
                                <td class="but-ed">tools</td>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- <tr>
                                <th><input type="checkbox"></th>
                                <th>ad1</th>
                                <th>admin</th>
                                <th>123</th>
                                <th class="but-ed">
                                    <a href="#"><button class="delete-button lar la-trash-alt"></button></a>
                                </th>
                            </tr> -->
                            <c:forEach items="${adminList}" var="admin">
                                <tr>
                                    <th><input type="checkbox"></th>
                                    <th>${admin.id}</th>
                                    <th>${admin.userName}</th>
                                    <th>${admin.password}</th>
                                    <th class="but-ed">
                                        <form action="${pageContext.request.contextPath}/admin/admin" method="post">
                                            <input type="hidden" name="adminId" value="${admin.id}">
                                            <input type="hidden" name="action" value="delete">
                                            <a><button class="delete-button lar la-trash-alt" type="submit"></button></a>
                                        </form>
                                    </th>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </main>
            </div>
        </body>

        </html>