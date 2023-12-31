<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form register</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/form-register.css">
<script>
	function submitForm(event) {
		event.preventDefault();

		// Lấy giá trị từ các trường input
		var username = document.getElementById("username").value;
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;
		var confirmPassword = document.getElementById("confirmPassword").value;

		// Kiểm tra xác nhận mật khẩu
		if (password !== confirmPassword) {
			alert("Mật khẩu xác nhận không khớp");
			return;
		}

		// Gửi dữ liệu đăng ký đến server (trong ứng dụng thực tế, bạn cần sử dụng AJAX hoặc Fetch API)
		// Ở đây chỉ hiển thị thông báo đăng ký thành công
		alert("Đăng ký thành công!\nTên đăng nhập: " + username + "\nEmail: "
				+ email);
	}
</script>
<style type="text/css">
body {
	background-image:
		url('<c:url value="/resources/img/background_form_register.jpg"/>')
}
</style>
</head>
<body>
	<div class="ten_shop">
		<h1>Shoe MD</h1>
	</div>
	<div class="container">
		<form:form action="add-nguoidung" id="registrationForm"
			method="post" modelAttribute="nguoiDung">
			<h2>Đăng ký</h2>
			<label for="username">Tên đăng nhập:</label>
			<form:input path="tenNguoiDung" id="username"
				name="username" required="required" />

			<label for="password">Mật khẩu:</label>
			<form:password path="matKhau" id="password"
				name="password" required="required" />

			<label for="confirmPassword">Xác nhận mật khẩu:</label>
			<input type="password" id="confirmPassword" name="confirmPassword"
				required>
			<label for="email">Email:</label>
			<form:input path="email" id="email" name="email"
				required="required" />

			<form:hidden path="role" id="role" name="role" value="user"
				required="required" />
			<input type="submit" value="Đăng ký"/>
			<input type="button"
				onclick="window.location.href='index';return false"
				value="Quay lại trang chủ"></input>
		</form:form>
	</div>
</body>
</html>