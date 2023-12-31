<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image:
		url('<c:url value="/resources/img/background_form_register.jpg"/>')
}

.ten_shop {
	background-color: #ff4081; /* Pastel pink background color */
	color: #fff; /* White text color */
	text-align: center; /* Center-align text */
	padding: 20px; /* Add some padding for spacing */
	border-radius: 8px; /* Add rounded corners */
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	/* Add a subtle box shadow for depth */
	margin: 0 auto; /* Center the div horizontally */
	max-width: 600px;
	/* Set a maximum width to control the width of the div */
}

.ten_shop h1 {
	margin: 0; /* Remove default margin for the h1 element */
	font-size: 2em; /* Adjust font size */
}

.login-container {
	max-width: 400px;
	margin: 20px auto;
	/* Add margin for spacing and center the container */
	background-color: #fff; /* White background color */
	padding: 20px; /* Add padding for spacing */
	border-radius: 8px; /* Add rounded corners */
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	/* Add a subtle box shadow for depth */
}

form {
	text-align: center;
}

h2 {
	color: #333;
	margin-bottom: 20px;
}

label {
	display: block;
	margin: 10px 0;
	color: #555;
}

input {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

button {
	background-color: #4caf50;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-right: 5px; /* Add some spacing between buttons */
}

button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="ten_shop">
		<h1>Shoe MD</h1>
	</div>
	<div class="login-container">
		<form:form id="loginForm" onsubmit="submitForm(event)" method="post" action="check-login" modelAttribute="nguoiDung">
			<h2>Login</h2>
			<label for="username">Username:</label>
			<form:input path="tenNguoiDung" id="username" name="username"
				required="required" />
			<label for="password">Password:</label>
			<form:password path="matKhau" id="password" name="password"
				required="required" />

			<button type="submit">Login</button>
			<button type="button"
				onclick="window.location.href='index';return false">Quay
				lại trang chủ</button>
		</form:form>
	</div>
</body>
</html>