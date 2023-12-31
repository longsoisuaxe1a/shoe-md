<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin-home-manager</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
}


.menu {
	background-color: #333;
	color: #fff;
	padding: 10px;
	text-align: center; /* Canh giữa nội dung */
}

.menu ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

.menu ul li {
	display: inline;
	margin-right: 20px;
}

.menu a {
	text-decoration: none;
	color: #fff;
	transition: underline 0.3s ease; /* Thêm hiệu ứng chuyển động */
}

.menu a:hover {
	text-decoration: underline;
}

.content {
	text-align: center; /* Canh giữa nội dung */
	padding: 20px;
}

.footer {
	background-color: #333;
	color: #fff;
	text-align: center;
	padding: 10px;
	position: fixed;
	bottom: 0;
	width: 100%;
}
.header {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.tenDangNhap {
    display: flex;
    align-items: center;
}

.tenDangNhap h5 {
    color: #fff;
    margin-right: 10px;
}

button {
    background-color: #4CAF50;
    color: #fff;
    padding: 10px 20px;
    border: none;
    cursor: pointer;
}

button:hover {
    background-color: #45a049;
}

/* Center the text in the header */
.header h1 {
    margin: 0 auto; /* Set margin auto to center the text */
}
</style>
<script>
        function showContent(contentText) {
    const contentElement = document.getElementById('content');
    contentElement.innerHTML = `<p>${contentText} sẽ được hiển thị ở đây.</p>`;
}

    </script>
</head>
<body>
	<div class="header">
		<h1>Shoe MD</h1>
		<div class="tenDangNhap">
            <h5>Ten dang nhap</h5>
            <a href="logout">Logout</a>
        </div>
	</div>

	<div class="menu">
		<ul>
			<li><a href="admin/list-giay"
				onclick="showContent('Quản lý giày')">Quản lý giày</a></li>
			<li><a href="admin/list-thuonghieu"
				onclick="showContent('Quản lý thương hiệu')">Quản lý thương hiệu</a></li>
			<li><a href="admin/list-loaigiay"
				onclick="showContent('Quản lý loại giày')">Quản lý loại giày</a></li>
			<li><a href="admin/list-nguoidung"
				onclick="showContent('Quản lý người dùng')">Quản lý người dùng</a></li>
			<li><a href="#quan-ly-hoa-don"
				onclick="showContent('Quản lý hóa đơn')">Quản lý hóa đơn</a></li>
		</ul>
	</div>

	<div class="content" id="content">
		<p>Vui lòng chọn một mục quản lý từ menu để hiển thị nội dung
			tương ứng.</p>
	</div>

	<div class="footer">
		<p>&copy; 2023 Shoe MD. All rights reserved.</p>
	</div>
</body>
</html>