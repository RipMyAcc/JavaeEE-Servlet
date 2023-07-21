<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/script.js">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/slider.js">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/IMG/logo.png">
    <title>${setting.title}</title>
</head>

<body>
    <header>
        <div class="logo">
            <a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/IMG/logo.png" alt="logo Website"></a>
            
        </div>
        <div class="menu">
            <li><a href="${pageContext.request.contextPath}/book-list">Sách</a></li>
            <li><a href="do-phung-tu.html">Đồ Phụng Tự</a></li>
            <li><a href="pham-phuc.html">Phẩm Phục</a></li>
            <li><a href="luu-niem.html">Lưu Niệm</a></li>
            <li><a href="tranh-anh.html">Tranh Ảnh</a></li>
            <li><a href="tuong.html">Tượng</a></li>
        </div>
        <div class="others">
            <li><input placeholder="Tìm kiếm" type="text"></li>
            <li><a class="fa fa-search" href=""><img src="${pageContext.request.contextPath}/resources/IMG/search.png" alt="image"
                        title="icon search" width="50%"></a></li>
            <li><a class="fa fa-user" href="${pageContext.request.contextPath}/login"><img src="${pageContext.request.contextPath}/resources/IMG/user.png" alt="image"
                        title="icon user"></a></li>
            <li><a class="fa fa-cart" href="${pageContext.request.contextPath}/cart"><img src="${pageContext.request.contextPath}/resources/IMG/cart.png" alt="image"
                        title="cart"></a></li>
        </div>
    </header>
    <!-- section -->
    <div class="form-reg">
        <div class="cover">
            <h1 class="form-login-heading">ĐĂNG KÝ</h1>
            <form action="${pageContext.request.contextPath}/register" class="form-login-form" method="post">
                <label for="name">Họ và tên</label><br>
                <input name="name" type="text" id="name" placeholder="Nhập Họ & Tên"><br>
                <label for="email">Email</label><br>
                <input name="email" type="email" id="email" placeholder="Nhập Email"><br>
                <label for="phone">Số điện thoại</label><br>
                <input name="phoneNumber" type="text" id="phoneNumber" placeholder="Nhập SĐT"><br>
                <label for="username">Tài khoản</label><br>
                <input name="userName" type="text" id="userName" placeholder="Nhập Tên Tài Khoản"><br>
                <label for="password">Mật khẩu</label><br>
                <input name="password" type="password" id="password" placeholder="Nhập Password"><br>
                <!-- <label for="birth">Ngày sinh</label><br>
                <input type="date" id="birth"><br>
                <label for="">Giới Tính:</label><br>
                <label for="male">Nam</label>
                <input type="radio" name="gender" value="male" id="male">
                <label for="female">Nữ</label>
                <input type="radio" name="gender" value="female" id="female"><br><br> -->
                <button>Đăng kí</button>

                <c:if test="${not empty message}">
                    <br><p>${message}</p>
                </c:if>
            </form>
        </div>
    </div>
    <hr>
    <!-- footer phần chân của trang web( chứa thông tin liên lạc cần thiết...) -->
     <!-- ----------------Footer------------------>

    <!-- ----------------app-container------------------>
    <section class="app-container">
        <p><b>Tải Ứng dụng Nhà Sách Công Giáo</b></p>
        <div class="app-google">
            <img src="${pageContext.request.contextPath}/resources/IMG/icon_appstore.png" alt="image" title="icon app store">
            <img src="${pageContext.request.contextPath}/resources/IMG/icon_ggplay.png" alt="image" title="icon google paly">
        </div>
        <p>Hòm Thư Góp Ý Của Nhà Sách Công Giáo</p>
        <input type="text" placeholder="Nhập email của bạn...">
    </section>

    <div class="footer-top">
        <li><a href=""><img src="${pageContext.request.contextPath}/resources/IMG/da-thong-bao-voi-bo-cong-thuong.png" alt=""></a></li>
        <li><a href=""></a>Liên hệ</li>
        <li><a href=""></a>Tuyển dụng</li>
        <li><a href=""></a>Giới thiệu</li>
    </div>
    <div class="footer-icon">
        <li>
            <a href=""><img src="https://pubcdn.ivymoda.com/ivy2/images/ic_fb.svg" alt=""></a>
        </li>
        <li>
            <a href=""> <img src="https://pubcdn.ivymoda.com/ivy2/images/ic_instagram.svg" alt=""></a>
        </li>
        <li>
            <a href=""><img src="	https://pubcdn.ivymoda.com/ivy2/images/ic_ytb.svg" alt=""></a>
        </li>
        <li>
            <a href=""><img src="https://pubcdn.ivymoda.com/ivy2/images/ic_gg.svg" alt=""></a>
        </li>
        <li>
            <a href=""><img src="	https://pubcdn.ivymoda.com/ivy2/images/ic_pinterest.svg" alt=""></a>
        </li>
    </div>
    <div class="footer-center">
        <p>
            Giấy chứng nhận Đăng ký Kinh doanh số 01ABCD123456 cấp ngày 01/01/2022. <br>
            Địa chỉ đăng kí: 120 Chiến thắng, phường 9, Quận Phú Nhuận, TP.HCM. <br>
            Đặt hàng online: <b>0363 562 084</b>
        </p>
    </div>
    <div class="footer-bottom">
        ©NSCG All rights reserved
    </div>
    <!--------------end footer--------------->
</body>

</html>