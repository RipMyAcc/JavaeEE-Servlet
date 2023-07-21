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
            <img src="${pageContext.request.contextPath}/resources/IMG/logo.png" alt="logo Website">
        </div>
        <div class="menu">
            <li><a href="${pageContext.request.contextPath}/book-list">Sách</a>
                <!-- <ul class="sub-menu">
                        <li><a href="">Bài Giảng-Suy niệm</a></li>
                        <li><a href="">Đức Mẹ-Các Thánh</a></li>
                        <li><a href="">Đời Sống Thánh Hiến</a></li>
                        <li><a href="">Nghệ Thuật</a></li>
                        <li><a href="">Sách Thiêng Liêng</a></li>
                        <li><a href="">Sách Thiếu Nhi</a>
                            <ul>
                                <li><a href="">Sách Giáo Lí</a></li>
                                <li><a href="">Truyện Công Giáo</a></li>
                                <li><a href="">Truyện Tranh</a></li>

                            </ul>
                        </li>
                        <li><a href="">Tâm Lí</a>
                            <ul>
                                <li><a href="">Kỹ Năng Sống</a></li>
                                <li><a href="">Sách Học Làm Người</a></li>
                                <li><a href="">Tâm Lí Học</a></li>
                                <li><a href="">Tâm Lí Giáo Dục</a></li>
                            </ul>
                        </li>
                        <li><a href="">Thánh Kinh</a></li>
                        <li><a href="">Thần Học</a>
                            <ul>
                                <li><a href="">Luân Lý</a></li>
                                <li><a href="">Tín Lý</a></li>
                                <li><a href="">Mục Vụ</a></li>
                                <li><a href="">Phụng Vụ & Bí Tích</a></li>
                            </ul>
                        </li>
                        <li><a href="">Triết Học</a></li>
                        <li><a href="">Chủ Đề Khác</a>
                            <ul>
                                <li><a href="">B.Khoa-T.Điển-Nghiên Cứu</a></li>
                                <li><a href="">Giáo Huấn</a></li>
                                <li><a href="">Lịch Sử</a></li>
                                <li><a href="">Sách Khác</a></li>
                                <li><a href="">Truyện Ngắn</a></li>
                            </ul>
                        </li>
                    </ul> -->
            </li>
            <li><a href="do-choi.html">Đồ Chơi</a>
                <!-- <ul class="sub-menu">
                        <li><a href="">BÌNH CIBOIRE</a></li>
                        <li><a href="">BÌNH XÔNG HƯƠNG/TRẦM</a></li>
                        <li><a href="">BỘ XỨC DẦU/HỘP DẦU</a></li>
                        <li><a href="">CHÂN ĐÈN</a></li>
                        <li><a href="">CHÉN LỄ</a></li>
                        <li><a href="">CHUÔNG</a></li>
                        <li><a href="">HỘP MÌNH THÁNH</a></li>
                        <li><a href="">MẶT NHẬT</a></li>
                        <li><a href="">NẾN</a></li>
                    </ul> -->
            </li>
            <li><a href="gau-bong.html">Gấu Bông</a>
                <!-- <ul>
                        <li><a href="">ÁO ALBA</a></li>
                        <li><a href="">ÁO CHẦU</a></li>
                        <li><a href="">ÁO GIÚP LỄ</a></li>
                        <li><a href="">ÁO LỄ</a></li>
                        <li><a href="">ÁO RỬA TỘI/KHĂN RỬA TỘI</a></li>
                        <li><a href="">ÁO SURPLIS</a></li>
                        <li><a href="">DÂY STOLA</a></li>
                        <li><a href="">KHĂN THÁNH</a></li>
                    </ul> -->
            </li>
            <li><a href="dung-cu-hoc-tap.html">Dụng Cụ Học Tập</a>
                <!-- <ul class="sub-menu">
                        <li><a href="">ẢNH ĐỂ BÀN</a></li>
                        <li><a href="">ẢNH ĐEO</a></li>
                        <li><a href="">TRANH TREO TƯỜNG</a></li>
                    </ul> -->
            </li>
            <li><a href="suc-khoe.html">Sức Khỏe</a>
                <!-- <ul class="sub-menu">
                        <li><a href="">BÀN THỜ</a></li>
                        <li><a href="">TƯỢNG CÁC THÁNH</a></li>
                        <li><a href="">TƯỢNG CHÚA GIÊ-SU</a></li>
                        <li><a href="">TƯỢNG ĐỨC MẸ</a></li>
                        <li><a href="">TƯỢNG GAI ĐÌNH THÁNH GIA</a></li>
                        <li><a href="">THÁNH GIÁ</a>
                            <ul>
                                <li><a href="">THÁNH GIÁ ĐỂ BÀN</a></li>
                                <li><a href="">THÁNH GIÁ TREO TƯỜNG</a></li>
                            </ul>
                        </li>
                        <li><a href="">TƯỢNG THNAHS GIUSE</a></li>
                    </ul> -->
            </li>
            <li><a href="luu-niem.html">Lưu Niệm</a>
                <!-- <ul class="sub-menu">
                        <li><a href="">CHUỖI</a>
                            <!-- <ul>
                                <li><a href="">CHUỖI 10</a></li>
                                <li><a href="">CHUỖI 50</a></li>
                            </ul>
                        </li> -->
                <!-- <li><a href="">SỔ TAY</a></li>
                    </ul> -->
            </li>
            <li><a href="loai-khac.html">Loại Khác</a>
                <!-- <ul>
                        <li><a href="">BAO LÌ XÌ</a></li>
                        <li><a href="">THIỆP GIÁNG SINH</a></li>
                    </ul> -->
            </li>
        </div>
        <div class="others">
            <li><input placeholder="Tìm kiếm" type="text"></li>
            <li><a class="fa fa-search" href=""><img src="${pageContext.request.contextPath}/resources/IMG/search.png" alt="image" title="icon search"
                        width="50%"></a></li>
            <li><a class="fa fa-user" href="${pageContext.request.contextPath}/login"><img src="${pageContext.request.contextPath}/resources/IMG/user.png" alt="image" title="icon user"></a></li>
            <li><a class="fa fa-cart" href="${pageContext.request.contextPath}/cart"><img src="${pageContext.request.contextPath}/resources/IMG/cart.png" alt="image" title="cart"></a></li>
        </div>
    </header>
    <!------------------------slider------------------------>
    <section id="slider">
        <div class="aspect-ratio-169">
            <img src="${pageContext.request.contextPath}/resources/IMG/slider1.png" alt="image" title="image slider1">
            <img src="${pageContext.request.contextPath}/resources/IMG/slider2.png" alt="image" title="image slider2">
            <img src="${pageContext.request.contextPath}/resources/IMG/slider3.png" alt="image" title="image slider3">
        </div>
        <div class="dot-container">
            <div class="dot active"></div>
            <div class="dot active"></div>
            <div class="dot active"></div>
        </div>
    </section>
    <!-- ----------------app-container------------------>
    <section class="app-container">
        <p>Tải Ứng dụng Nhà Sách Công Giáo</p>
        <div class="app-google">
            <img src="${pageContext.request.contextPath}/resources/IMG/icon_appstore.png" alt="image" title="icon app store">
            <img src="${pageContext.request.contextPath}/resources/IMG/icon_ggplay.png" alt="image" title="icon google paly">
        </div>
        <p>Hòm Thư Góp Ý Của Nhà Sách Công Giáo</p>
        <input type="text" placeholder="Nhập email của bạn...">
    </section>
    <!-- ----------------Footer------------------>
    <section class="footer">
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
    </section>
</body>
<script>
    const header = document.querySelector("header")
    window.addEventListener("scroll", function () {
        x = window.pageYOffset
        if (x > 0) {
            header.classList.add("sticky")
        } else {
            header.classList.remove("sticky")
        }
    })

    const imgPosition = document.querySelectorAll(".aspect-ratio-169 img")
    const imgContainer = document.querySelector('.aspect-ratio-169')
    const dotItem = document.querySelectorAll(".dot")
    let imgNuber = imgPosition.length
    let index = 0
    // console.log(imgPosition)
    imgPosition.forEach(function (image, index) {
        image.style.left = index * 100 + "%"
        dotItem[index].addEventListener("click", function () {
            slider(index)
        })
    })
    function imgSlider() {
        index++;
        console.log(index)
        if (index >= imgNuber) { index = 0 }
        slider(index)
    }
    function slider(index) {
        imgContainer.style.left = "-" + index * 100 + "%"
        const dotActive = document.querySelectorAll(".active")
        dotActive.classList.remove("active")
        dotItem[index].classList.add("active")
    }

    setInterval(imgslider, 5000)
</script>

</html>