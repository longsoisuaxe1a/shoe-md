<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin-form-add-nguoidung</title>
<style type="text/css">
	 /* Reset some default margin and padding for consistent styling */
    body, h1, h2, p, div, form, input {
        margin: 0;
        padding: 0;
    }

    /* Apply some basic styling to the header section */
    .ten-shop {
        background-color: #ffb6c1; /* Pastel pink background color */
        color: #333; /* Example text color */
        padding: 10px; /* Example padding */
        text-align: center; /* Center text */
    }

    /* Style the main content section */
    .container {
        margin: 20px; /* Example margin */
    }

    /* Style the form */
    form {
        margin-top: 20px; /* Example margin */
    }

    /* Style form inputs */
    label {
        display: block;
        margin-bottom: 8px; /* Example margin */
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-bottom: 16px; /* Example margin */
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4CAF50; /* Example button color */
        color: #fff; /* Example text color */
        padding: 10px 20px; /* Example padding */
        border: none; /* Remove border */
        cursor: pointer;
    }
    /* Style the container of the select element */
.custom-select {
    position: relative;
    display: inline-block;
}

/* Style the select element */
.custom-select select {
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #fff;
    cursor: pointer;
}

/* Style the arrow icon */
.custom-select::after {
    content: '\25BC'; /* Unicode character for down arrow */
    font-size: 16px;
    color: #555;
    position: absolute;
    top: 50%;
    right: 10px;
    transform: translateY(-50%);
}

/* Style the options */
.custom-select select option {
    padding: 10px;
    background-color: #fff;
}

/* Hover effect for options */
.custom-select select option:hover {
    background-color: #f0f0f0;
}
    
</style>
</head>
<body>
	<div class="ten-shop">
        <h1>Shoe MD</h1>
    </div>

    <div class="container">
        <form:form action="update-submit-nguoidung" method="post" modelAttribute="nguoiDung">
            <form:hidden path="maNguoiDung" id="brandName" name="brandName" required="required"/>
            <!-- tên người dùng  -->
            <label for="brandName">Tên người dùng:</label>
            <form:input path="tenNguoiDung" id="brandName" name="brandName" required="required"/>
            <!-- mật khẩu -->
            <label for="brandName">Mật khẩu:</label>
            <form:input path="matKhau" id="brandName" name="brandName" required="required"/>
			<!-- email -->
			<label for="brandName">Email:</label>
            <form:input path="email" id="brandName" name="brandName" required="required"/>
            <!-- role -->
            <form:select path="role" class="custom-select">
					<form:option value="user">User</form:option>
    				<form:option value="admin">Admin</form:option>
				</form:select>
            <input type="submit" value="Thêm người dùng">
        </form:form>
    </div>
</body>
</html>