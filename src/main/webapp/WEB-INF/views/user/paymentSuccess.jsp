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
    <!---------------Payment-------------->


    <section class="payment">
        <div class="container">
            <div class="payment-top-wrap">
                <div class="payment-top">
                    <!--------------icon----------->
                    <div class="payment-top-delivery payment-top-item">
                        <img src="" alt="">
                    </div>
                    <div class="payment-top-adress payment-top-item">
                        <img src="" alt="">
                    </div>
                    <div class="payment-top-payment payment-top-item">
                        <img src="" alt="">
                    </div>
                </div>
            </div>
            <div class="container">
                <!-- <div class="payment-content row">
                    <div class="payment-content-left">
                        <div class="payment-content-left-method-delivery">
                            <p style="font-weight: bold;">PHƯƠNG THỨC THANH TOÁN</p>
                            <div class="payment-content-left-method-delivery-item">
                                <input type="radio">
                                <label for="">GIAO HÀNG CHUYỂN PHÁT NHANH</label>
                            </div>
                        </div>
                        <div class="payment-content-left-method-payment">
                            <p style="font-weight: bold;">PHƯƠNG THỨC THANH TOÁN</p>
                            <p>Mọi giao dịch đều được bảo mật và mã hóa. Thông tin thẻ tín dụng sẽ không bao giờ được lưu lại.</p>
                            <div class="payment-content-left-method-payment-item">
                                <input name="method-payment" type="radio">
                                <label for="">Thanh toán bằng thẻ tín dụng(OnePay)</label>
                            </div>
                            <div class="payment-content-left-method-payment-item-img">
                                <img src="IMG/visa.jpg" alt="image" title="" width="50%">
                            </div>
                            <div class="payment-content-left-method-payment-item">
                                <input name="method-payment" type="radio">
                                <label for="">Thanh toán bằng thẻ ATM(OnePay)</label>
                            </div>
                            <div class="payment-content-left-method-payment-item-img">
                                <img src="IMG/LOGO-NGAN-HANG-VIET-NAM.jpg" alt="" width="50%">
                            </div>
                            <div class="payment-content-left-method-payment-item">
                                <input name="method-payment" type="radio">
                                <label for="">Thanh toán bằng ví momo</label>
                            </div>
                            <div class="payment-content-left-method-payment-item-img">
                                <img src="IMG/momo.png" alt="image" width="30%">
                            </div>
                            <div class="payment-content-left-method-payment-item">
                                <input name="method-payment" type="radio">
                                <label for="">Thanh toán khi nhận hàng</label>
                            </div>
                    </div>
                    <div class="payment-content-right">
                        <div class="payment-content-right-button">
                            <input type="text" placeholder="Mã giảm giá/Quà tặng">
                            <button><img src="IMG/check.jpg" alt="" width="35%"></button>
                        </div>
                        <div class="payment-content-right-button">
                            <input type="text" placeholder="Mã cộng tác viên">
                            <button><img src="IMG/check.jpg" alt="" width="35%"></button>
                        </div>
                        <div class="payment-content-right-mnv">
                            <select name="" id="">
                                <option value="">Chọn mã nhân viên thân thiết</option>
                                <option value="">A123</option>
                                <option value="">D345</option>
                                <option value="">E123</option>
                                <option value="">I456</option>
                            </select>
                        </div>
                    </div>
                </div> -->
                <div class="payment-content-right-payment">
                    <P>Thanh toán thành công</P><br>
                </div>
                <div class="payment-content-right-payment">
                    <a href="${pageContext.request.contextPath}/book-list">Trở về</a>
                </div>

               

            </div>
        </div>
    </section>

     <!-- ----------------Footer------------------>
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