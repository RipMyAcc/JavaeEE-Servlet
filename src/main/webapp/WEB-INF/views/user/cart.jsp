<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/script.js">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/slider.js">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
            <link rel="icon" href="${pageContext.request.contextPath}/resources/IMG/logo.png">
            <title>CART-${setting.title}</title>
        </head>

        <body>
            <header>
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/IMG/logo.png" alt="logo Website"></a>

                </div>
                <div class="menu">
                    <li><a href="${pageContext.request.contextPath}/book-list">Sách</a></li>
                    <li><a href="do-choi.html">Đồ Chơi</a></li>
                    <li><a href="gau-bong.html">Gấu Bông</a></li>
                    <li><a href="dung-cu-hoc-tap.html">Dụng Cụ Học Tập</a></li>
                    <li><a href="">Sức Khỏe</a></li>
                    <li><a href="">Lưu Niệm</a></li>
                    <li><a href="">Loại Khác</a></li>
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
            <!-- ----------------cart------------------>

            <section class="cart">
                <div class="container">
                    <div class="cart-top-wrap">
                        <div class="cart-top">
                            <div class="cart-top-cart cart-top-item">
                                <i><img src="${pageContext.request.contextPath}/resources/IMG/cart.png" alt=""></i>
                            </div>
                            <div class="cart-top-cart cart-top-item">
                                <i></i>
                            </div>
                            <div class="cart-top-cart cart-top-item">
                                <i class="fa-duotone fa-money-check-dollar"></i>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="cart-content">
                        <div class="cart-content-left">
                            <table>
                                <tr>
                                    <th>SẢN PHẨM</th>
                                    <th>TÊN SẢN PHẨM</th>
                                    <th>SỐ LƯỢNG</th>
                                    <th>THÀNH TIỀN</th>
                                    <th>XÓA</th>
                                </tr>
                                <c:forEach items="${cart}" var="orderProduct">

                                <tr>
                                    <td><img src="${pageContext.request.contextPath}/resources/IMG/books/${orderProduct.productImg}" alt=""></td>
                                    <td>
                                        <p>${orderProduct.productName}</p>
                                    </td>
                                    <td><input type="number" value="${orderProduct.amount}" min="1"></td>
                                    <td>
                                        <p>Giá: <b>${orderProduct.totalPrice}</b><sup>đ</sup></p></a>
                                    </td>
                                    <td><a href="${pageContext.request.contextPath}/cart?action=delete&id=${orderProduct.productId}"><span>X</span></a></td>

                                </tr>
                            </c:forEach>

                            </table>
                        </div>
                        <div class="cart-content-right">
                            <table>
                                <tr>
                                    <th colspan="2">TỔNG TIỀN GIỎ HÀNG</th>
                                </tr>
                                <tr>
                                    <td>TỔNG SẢN PHẦM</td>
                                    <td>${totalQuantity==null ? 0 : totalQuantity}</td>
                                </tr>
                                <tr>
                                    <td>TỔNG TIỀN HÀNG</td>
                                    <td><b>${totalPrice==null ? 0 : totalPrice}</b><sup>đ</sup></td>
                                </tr>
                                <tr>
                                    <td>TẠM TÍNH</td>
                                    <td>
                                        <p style="color: black; font-weight: bold;"><b>${totalPrice}</b><sup>đ</sup></p>
                                    </td>
                                </tr>
                            </table>
                            <div class="cart-content-right-text">
                                <p>Bạn sẽ được freeship khi đơn hàng của bạn toognr giá trị trên 200.000 đ</p>
                                <p style="color: red;">Mua thêm 120.000đ để được freeship </p>
                                <c:if test="${not empty message}">
                                <p>${message}</p>
                            </c:if>
                            </div>
                            <div class="cart-content-right-button">
                                <a href="${pageContext.request.contextPath}/book-list"><button>TIẾP TỤC MUA SẮM</button></a>
                                <a href="${pageContext.request.contextPath}/payment"><button>THANH TOÁN</button></a>

                            </div>
                            <div class="cart-content-right-dangnhap">
                                <p>TÀI KHOẢN NSCG</p>
                                <P>HÃY <a href="${pageContext.request.contextPath}/login">ĐĂNG NHẬP</a> tài khoản của bạn để được tích điểm thành viên
                                </P>
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