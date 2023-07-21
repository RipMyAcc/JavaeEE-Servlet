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
            <title>Product-${setting.title}</title>
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
                    <li><a href="loai-khac.html">Loại Khác</a></li>
                </div>
                <div class="others">
                    <li><input placeholder="Tìm kiếm" type="text"></li>
                    <li><a class="fa fa-search" href=""><img src="${pageContext.request.contextPath}/resources/IMG/search.png" alt="image"
                                title="icon search" width="50%"></a></li>
                    <li><a class="fa fa-user" href="${pageContext.request.contextPath}/login"><img src="${pageContext.request.contextPath}/resources/IMG/user.png" alt="image"
                                title="icon user"></a></li>
                    <li><a class="fa fa-cart" href="${pageContext.request.contextPath}/cart"><img src="${pageContext.request.contextPath}/resources/IMG/cart.png" alt="image" title="cart"></a>
                    </li>
                </div>
            </header>
            <!------------------Product------------------>
            <section class="product">
                <div class="container">
                    <div class="product-top row">
                        <p>TRANG CHỦ / SÁCH / ${book.name}</p>
                    </div>
                    <div class="product-content row">
                        <div class="product-content-left row">
                            <div class="product-content-left-big-img">
                                <img src="${pageContext.request.contextPath}/resources/IMG/books/${book.img}" alt="image"
                                    title="${book.name}">
                            </div>
                            <div class="product-content-left-small-img">
                                <img src="${pageContext.request.contextPath}/resources/IMG/books/${book.img}" alt="image">
                                <!-- <img src="resources/IMG/books/thanhhien1.1.jpg" alt="image"> -->
                            </div>
                        </div>
                        <div class="product-content-right">


                            <div class="product-content-right-product-name">
                                <h2>${book.name}</h2>
                            </div>
                            <div class="product-content-right-product-price">
                                <p>• ${book.description}</p>
                              
                                <p>Giá: <b style="color: red;">${book.price}</b><sup style="color: red;">đ</sup></p>
                            </div>
                            <div class="quantity">
                                <p style="font-weight: bold;">Số lượng:</p>
                                <input id="quantity" type="number" min="0" value="1">
                                <p></p>
                            </div>
                            <div class="product-content-right-product-button">
                                <a id="addToCart" href="#">
                                        <img src="${pageContext.request.contextPath}/resources/IMG/cart.png" alt="image cart">
                                        <p>MUA HÀNG</p>
                                    </a>
                                <a href="books.html">
                                        <p>TÌM TẠI CỬA HÀNG</p>
                                    </a>
                            </div>

                            <script>
                                var link = document.getElementById("addToCart")
                                link.addEventListener("click", function (event) {
                                    event.preventDefault();
                                    var input = document.getElementById("quantity");
                                    console.log(input.value);
                                    window.location.href = "${pageContext.request.contextPath}/cart?action=add&id=${book.id}&quantity=" + input.value
                                });
                            </script>





                            <!-- </form> -->
                            <div class="product-content-right-product-icon row">
                                <div class="product-content-right-product-icon-item">
                                    <img src="${pageContext.request.contextPath}/resources/IMG/phone.png" alt="image">
                                    <p>Hot line</p>
                                </div>
                                <div class="product-content-right-product-icon-item">
                                    <img src="${pageContext.request.contextPath}/resources/IMG/comment.jpg" alt="image">
                                    <p>Mail</p>
                                </div>
                                <div class="product-content-right-product-icon-item">
                                    <img src="${pageContext.request.contextPath}/resources/IMG/mail.png" alt="image">
                                    <p>Mail</p>
                                </div>
                                <div class="product-content-right-product-qr ">
                                    <img src="${pageContext.request.contextPath}/resources/IMG/qr.png" alt="image" width="17.5%">
                                </div>
                                <div class="product-content-right-bottom ">
                                    <div class="product-content-right-bottom-top row">
                                        &#8897;
                                    </div>
                                    <div class="product-content-right-bottom-content-big">
                                        <div class="product-content-right-bottom-content-title row">
                                            <div class="product-content-right-bottom-content-title-item-thongbao">
                                                <P>THÔNG BÁO</P>
                                            </div>
                                            <div class="product-content-right-bottom-content-title-item-thongtinbosung">
                                                <p>THÔNG TIN BỔ SUNG</p>
                                            </div>
                                            <div class="product-content-right-bottom-content-title-item-mota">
                                                <p>MÔ TẢ</p>
                                            </div>
                                        </div>
                                        <div class="product-content-right-bottom-content">
                                            <div class="product-content-right-bottom-content-thongbao">
                                                Sau khi đặt hàng thành công, quý khách muốn thay đổi đơn hàng (hủy, thêm
                                                sản
                                                phẩm, đổi địa chỉ, ghép đơn...) <br>
                                                xin vui lòng cung cấp tên và số điện thoại qua email, zalo, messenger;
                                                chúng tôi
                                                sẽ xử lý nhanh nhất. <br>
                                                Trong trường hợp quý khách có tài khoản, quý khách có thể chủ động điều
                                                chỉnh
                                                đơn hàng trong phần "Tài khoản" <br>
                                                Xin chân thành cảm ơn.
                                            </div>
                                            <div class="product-content-right-bottom-content-thongtinbosung">
                                                <b>TRỌNG LƯỢNG</b>200g
                                            </div>
                                            <div class="product-content-right-bottom-content-title-item-mota">

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <!-------------PRODUCT-related------------>
            <section class="product-related">
                <div class="product-related-title">
                    <p>SẢN PHẨM LIÊN QUAN</p>
                </div>
                <div class="product-content row">
                    <c:forEach items="${bookList}" var="b">
                        <div class="cartegory-right-content-item">
                            <a href="${pageContext.request.contextPath}/book?id=${b.id}" name="addToCart">
                                <img name="${b.img}" src="${pageContext.request.contextPath}/resources/IMG/books/${b.img}" class="hinh" title="${b.img}"></a>
                                <p>Giá:<b>${b.price}</b><sup>đ</sup></p>
                            </a>

                        </div>
                    </c:forEach>

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
                <li><a href="">Liên hệ</a></li>
                <li><a href="">Tuyển dụng</a></li>
                <li><a href="">Giới thiệu</a></li>
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