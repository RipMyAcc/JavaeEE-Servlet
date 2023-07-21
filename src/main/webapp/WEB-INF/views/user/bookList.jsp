<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/js/script.js">
    <link rel="stylesheet" href="resources/js/slider.js">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="icon" href="resources/IMG/logo.png">
    <title>SÁCH-${setting.title}</title>
</head>

<body>
    <header>
        <div class="logo">
            <a href="${pageContext.request.contextPath}/"><img src="resources/IMG/logo.png" alt="logo Website"></a>
        </div>
        <div class="menu">
            <li>
                <h3>SÁCH</h3>
            </li>
            <li><a href="do-choi.html">Đồ Chơi</a></li>
            <li><a href="gau-bong.html">Gấu Bông</a></li>
            <li><a href="dung-cu-hoc-tap.html">Dụng Cụ Học Tập</a></li>
            <li><a href="suc-khoe.html">Sức Khỏe</a></li>
            <li><a href="luu-niem.html">Lưu Niệm</a></li>
            <li><a href="loai-khac.html">Loại Khác</a></li>
        </div>
        <div class="others">
            <li><input placeholder="Tìm kiếm" type="text"></li>
            <li><a class="fa fa-search" href=""><img src="resources/IMG/search.png" alt="image" title="icon search"
                        width="50%"></a></li>
            <li><a class="fa fa-user" href="${pageContext.request.contextPath}/login"><img src="resources/IMG/user.png" alt="image" title="icon user"></a></li>
            <li><a class="fa fa-cart" href="${pageContext.request.contextPath}/cart"><img src="resources/IMG/cart.png" alt="image" title="cart"></a></li>
        </div>
    </header>
    <!--------------------Cartegory---------------------->
    <section class="cartegory">
        <div class="container">
            <div class="cartegory-top row">
                <p>TRANG CHỦ / SÁCH</p>
            </div>
            <div class="container">
                <div class="row">
                    <div class="cartegory-left">
                        <ul>
                            <h1>SÁCH</h1>
                            <li class="cartegory-left-li"><a href="#">SUY NIỆM</a></li>
                            <li class="cartegory-left-li"><a href="#">CÁC THÁNH</a></li>
                            <li class="cartegory-left-li"><a href="#">ĐỜI SỐNG</a></li>
                            <li class="cartegory-left-li"><a href="#">NGHỆ THUẬT</a></li>
                            <li class="cartegory-left-li"><a href="#">SÁCH THIÊNG LIÊNG</a></li>
                            <li class="cartegory-left-li"><a href="#">SÁCH THIẾU NHI</a></li>
                            <li class="cartegory-left-li"><a href="#">TÂM LÝ</a></li>
                            <li class="cartegory-left-li"><a href="#">THÁNH KINH</a></li>
                            <li class="cartegory-left-li"><a href="#">THẦN HỌC</a></li>
                            <li class="cartegory-left-li"><a href="#">TRIẾT HỌC</a></li>
                            <li class="cartegory-left-li"><a href="#">CHỦ ĐỀ KHÁC</a></li>
                        </ul>
                    </div>
                    <div class="cartegory-right row">
                        <div class="cartegory-right-top-item">
                            <p>ĐỜI SỐNG THÁNH HIẾN</p>
                        </div>
                        <div class="cartegory-right-top-item">
                            <select name="" id="">
                                <option value="">Sắp xếp</option>
                                <option value="">Giá cao đến thấp</option>
                                <option value="">Giá thấp đến cao</option>
                            </select>
                        </div>
                        <div class="cartegory-right-content row">
                            <!-- Danh sách books thánh hiến -->
                            <c:if test="${not empty message}">
                                <p>${message}</p>
                            </c:if>
                            <c:forEach items="${bookList}" var="book">
                                

                                    <div class="cartegory-right-content-item">
                                        <a href="${pageContext.request.contextPath}/book?id=${book.id}"><img src="${pageContext.request.contextPath}/resources/IMG/books/${book.img}" alt="image" title="sách đs thánh hiến "></a>
                                        <a href="${pageContext.request.contextPath}/book?id=${book.id}"><h2>${book.name}</h2>
                                            <p>Giá: <b>${book.price}</b><sup>đ</sup></p></a>
        
                                    </div>
                                
                            </c:forEach>
                           
                        </div>
                        <div class="cartegory-right-bottom row">
                            <div class="cartegory-right-bottom-items">
                                <p>Hiện thị 2 <span>|</span> 4 Sản phẩm</p>
                            </div>
                            <div class="cartegory-right-bottom-items">
                                <p><span>&#171;</span>1 2 3 4<span>&#187;</span>Trang cuối</p>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!-- ----------------Footer------------------>

    <!-- ----------------app-container------------------>
    <section class="app-container">
        <p><b>Tải Ứng dụng Nhà Sách Công Giáo</b></p>
        <div class="app-google">
            <img src="resources/IMG/icon_appstore.png" alt="image" title="icon app store">
            <img src="resources/IMG/icon_ggplay.png" alt="image" title="icon google paly">
        </div>
        <p>Hòm Thư Góp Ý Của Nhà Sách Công Giáo</p>
        <input type="text" placeholder="Nhập email của bạn...">
    </section>

    <div class="footer-top">
        <li><a href=""><img src="IMG/da-thong-bao-voi-bo-cong-thuong.png" alt=""></a></li>
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