<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/custom.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/fontawesome-free-6.1.1-web/css/all.css">
<style type="text/css">
.content {
	background-image:
		url('<c:url value="/resources/img/background_gach.jpg" />');
	/* Đường dẫn đến hình ảnh được xây dựng bằng cú pháp JSTL */
}
</style>
</head>
<body>
	<div class="container">
		<!-- header -->
		<div class="header">
			<!-- <img class="img_header" src="/MNT-DESIGN-BANNER-GIAY-11.jpg" alt="banner" width="1500px" height="150px"> -->
			<div class="logo_header">
				<img src="<c:url value="/resources/img/logo.jpg"/>" alt="logo">
			</div>
			<div class="box_search">
				<form action="">
					<input type="text" name="txtSearch" id="txtSearch" required
						placeholder="Nhập vào để tìm kiếm ...">
					<button type="submit" class="btn btn-success ml-3">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</form>
			</div>
			<div class="login_register">
				<a href="form-login">Đăng nhập</a>
				<p>|</p>
				<a href="form-register">Đăng ký</a>
			</div>
			<div class="cart_header">
				<button type="submit">
					<i class="fa-solid fa-cart-shopping"></i>
				</button>
			</div>
			<div class="shop_name">
				<h1>Shoe MD</h1>
			</div>
		</div>
		<!-- nav -->
		<div class="nav">
			<div class="nav_menu">
				<ul>
					<li><a href="#">Trang chủ <i class="fa-solid fa-house"></i></a></li>
					<li><a href="#">Giày nam <i
							class="fa-solid fa-child-reaching"></i></a></li>
					<li><a href="#">Giày nữ <i class="fa-solid fa-child-dress"></i></a></li>
					<li><a href="#">Giày trẻ em <i class="fa-solid fa-child"></i></a></li>
					<li><a href="#">Hỗ trợ <i
							class="fa-regular fa-address-book"></i></a></li>
				</ul>
			</div>
		</div>
		<!-- banner -->
		<div class="banner">
			<div class="box_banner_left" id="leftBanner">
				<img src="<c:url value="/resources/img/banner3.jpg"/>" alt="banner"
					class="banner-image">
			</div>
			<div class="box_banner_right" id="rightBanner">
				<img src="<c:url value="/resources/img/banner7.jpg"/>" alt="banner"
					class="banner-image">
			</div>
		</div>
		<!-- content -->
		<div class="content">
			<table>
				<c:forEach var="giay" items="${giays}" varStatus="loopStatus">
					<c:if test="${loopStatus.index % 3 == 0}">
						<!-- Start a new row after every three iterations -->
						<tr>
					</c:if>
					<td>
						<div class="box_shoe">
							<div class="box_tenGiay">
								<h1 class="tenGiay">${giay.tenGiay}</h1>
							</div>
							<div class="box_btn_detail">
								<button class="btn_detail"
									onclick="openModal('${giay.tenGiay}', '${giay.size}',
									 '${giay.gia}', '${giay.phongCach}',
									  '${giay.kieuDang}', '${giay.getChiTietGiay().getMoTa()}',
									   '${giay.getChiTietGiay().getMauSac()}', '${giay.getChiTietGiay().getTrongLuong()}',
									    '${giay.getChiTietGiay().getChatLieu()}')">Xem
									chi tiết</button>

							</div>
							<div class="image-container">
								<img class="shoe_image"
									src="<c:url value='/resources/img/shoe_1.jpg'/>" alt="shoe_1">
							</div>
							<div class="box_add_buy">
								<input type="button" value="Mua ngay"> <input
									type="button" value="Đặt hàng">
							</div>
						</div>
					</td>

					<!-- The modal -->
					<div id="myModal" class="modal">
						<div class="modal-content">
							<span class="close" onclick="closeModal()">&times;</span>
							<!-- Content of your modal goes here -->
							<h2>Chi tiết giày</h2>
							<h4 class="tenGiay" id="modalTenGiay"></h4>
							<h4 class="size" id="modalSize"></h4>
							<h4 class="gia" id="modalGia"></h4>
							<h4 class="phongCach" id="modalPhongCach"></h4>
							<h4 class="kieuDang" id="modalKieuDang"></h4>
							<h4 class="moTa" id="modalMoTa"></h4>
							<h4 class="mauSac" id="modalMauSac"></h4>
							<h4 class="trongLuong" id="modalTrongLuong"></h4>
							<h4 class="chatLieu" id="modalChatLieu"></h4>
						</div>
					</div>
					<c:if test="${loopStatus.index % 3 == 2 or loopStatus.last}">
						<!-- Close the row after every three iterations or on the last iteration -->
						</tr>
					</c:if>
				</c:forEach>
			</table>
		</div>
		<script>
			function openModal(tenGiay, size, gia, phongCach, kieuDang, moTa, mauSac, trongLuong, chatLieu) {
				document.getElementById("modalTenGiay").innerText = tenGiay;
				document.getElementById("modalSize").innerText = size;
				document.getElementById("modalGia").innerText = gia;
				document.getElementById("modalPhongCach").innerText = phongCach;
				document.getElementById("modalMoTa").innerText = moTa;
				document.getElementById("modalMauSac").innerText = mauSac;
				document.getElementById("modalTrongLuong").innerText = trongLuong;
				document.getElementById("modalChatLieu").innerText = chatLieu;
				document.getElementById("modalKieuDang").innerText = kieuDang;

				document.getElementById("myModal").style.display = "flex";
			}

			function closeModal() {
				document.getElementById("myModal").style.display = "none";
			}

			window.onclick = function(event) {
				var modal = document.getElementById("myModal");
				if (event.target === modal) {
					modal.style.display = "none";
				}
			}
		</script>

		<!-- footer -->
		<div class="footer">
			<div class="footer-logo">Shoe MD</div>
			<div class="footer-description">Nơi cung cấp những đôi giày
				chất lượng hàng đầu</div>
			<div class="footer-social">
				<a href="#" target="_blank">Facebook</a> <a href="#" target="_blank">Instagram</a>
				<a href="#" target="_blank">Twitter</a>
			</div>
			<div class="footer-links">
				<a href="#">Trang chủ</a> <a href="#">Giày nam</a> <a href="#">Giày
					nữ</a> <a href="#">Giày trẻ em</a> <a href="#">Hổ trợ</a>
			</div>
			<div class="footer-address">123 Đường ABC, Quận XYZ, Thành phố
				HCM</div>
		</div>
	</div>
	<script>
		// JavaScript code to change images in the left and right banner sections
		var leftBanner = document.getElementById('leftBanner');
		var rightBanner = document.getElementById('rightBanner');
		var leftImages = [ "<c:url value="/resources/img/banner1.jpg"/>",
				"<c:url value="/resources/img/banner2.jpg"/>",
				"<c:url value="/resources/img/banner3.jpg"/>",
				"<c:url value="/resources/img/banner4.jpg"/>" ];
		var rightImages = [ "<c:url value="/resources/img/banner5.webp"/>",
				"<c:url value="/resources/img/banner6.jpg"/>",
				"<c:url value="/resources/img/banner7.jpg"/>",
				"<c:url value="/resources/img/banner8.jpg"/>" ];
		var leftImageIndex = 0;
		var rightImageIndex = 0;

		function changeLeftImage() {
			// Change image source for the left banner
			leftBanner.querySelector('.banner-image').src = leftImages[leftImageIndex];

			// Increment index or reset to 0 if the last image is reached
			leftImageIndex = (leftImageIndex + 1) % leftImages.length;
		}

		function changeRightImage() {
			// Change image source for the right banner
			rightBanner.querySelector('.banner-image').src = rightImages[rightImageIndex];

			// Increment index or reset to 0 if the last image is reached
			rightImageIndex = (rightImageIndex + 1) % rightImages.length;
		}

		// Change images every 3 seconds (adjust the time as needed)
		setInterval(function() {
			changeLeftImage();
			changeRightImage();
		}, 3000);
	</script>
</body>
</html>