<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <jsp:useBean id="admin" scope="session" class="com.books.beans.admin.Admin" />
        <jsp:useBean id="setting" scope="session" class="com.books.beans.setting.Setting" />


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
            <title>Admin Dashboard</title>
        </head>
        <style>
            tr td:last-child {
                display: flex;
                align-items: center;
            }
        </style>

        <body>
            <input type="checkbox" id="nav-toggle">
            <div class="sidebar">
                <div class="sidebar-brand">
                    <h2><span class="las la-bible"></span><span>Books Store</span></h2>
                </div>
                <div class="sidebar-menu">
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/dashboard" class="active"><span
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
                            <a href="${pageContext.request.contextPath}/admin/admin"><span
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
                        <img src="${pageContext.request.contextPath}/resources/IMG/people-1.png" width="40px"
                            height="30px" alt="">
                        <div>
                            <h4>${admin.userName}</h4>
                            <small>Super admin</small>
                        </div>
                    </div>
                </header>
                <main>
                    <div class="cards">
                        <div class="card-single">
                            <div>
                                <h1>${numberOfCustomer}</h1>
                                <span>Customers</span>
                            </div>
                            <div>
                                <span class="las la-users"></span>
                            </div>
                        </div>
                        <div class="card-single">
                            <div>
                                <h1>${numberOfBook}</h1>
                                <span>Products</span>
                            </div>
                            <div>
                                <span class="las la-clipboard"></span>
                            </div>
                        </div>
                        <div class="card-single">
                            <div>
                                <h1>${numberOfOrder}</h1>
                                <span>Oders</span>
                            </div>
                            <div>
                                <span class="las la-clipboard"></span>
                            </div>
                        </div>
                        <div class="card-single">
                            <div>
                                <h1>${income}đ</h1>
                                <span>Income</span>
                            </div>
                            <div>
                                <span class="lab la-google-wallet"></span>
                            </div>
                        </div>
                    </div>
                    <div class="recent-grid">
                        <div class="projects">
                            <div class="card">
                                <div class="card-header">
                                    <h3>Recent Products</h3>
                                    <button><a href="${pageContext.request.contextPath}/admin/product">See all </a><span
                                            class="las la-arrow-right">
                                        </span></button>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table width="100%">
                                            <thead>
                                                <tr>
                                                    <td>Image</td>
                                                    <td>Name</td>
                                                    <td>Price</td>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${productList}" var="product">

                                                    <tr>
                                                        <th class="thimg"><img
                                                                src="${pageContext.request.contextPath}/resources/IMG/books/${product.img}"
                                                                alt="img sách"></th>
                                                                <th>${product.name}</th>
                                                                <th>${product.price}đ</th>
                                                            </tr>
                                                </c:forEach>



                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="customers">
                            <div class="card">
                                <div class="card-header">
                                    <h3>New customer</h3>
                                    <button><a href="${pageContext.request.contextPath}/admin/customer">See all</a>
                                        <span class="las la-arrow-right">
                                        </span></button>
                                </div>
                                <div class="card-body">
                                    <c:forEach items="${customerList}" var="customer">

                                        <div class="customer">
                                            <div class="info">
                                                <img src="${pageContext.request.contextPath}/resources/IMG/people-1.png"
                                                    width="40px" height="40px" alt="">
                                                <div>
                                                    <h4>${customer.name}</h4>
                                                    <small>${customer.userName}</small>
                                                </div>
                                            </div>
                                            <div class="contact">
                                                <span class="las la-user-circle"></span>
                                                <span class="las la-comment"></span>
                                                <span class="las la-phone"></span>
                                            </div>
                                        </div>
                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </body>

        </html>