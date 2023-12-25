<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin-form-update-thuonghieu</title>
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
</style>
</head>
<body>
	<div class="ten-shop">
        <h1>Shoe MD</h1>
    </div>

    <div class="container">
        <form:form action="submit" method="post" modelAttribute="thuongHieu">
            <form:hidden path="maThuongHieu" id="brandName" name="brandName" required="required"/>
            <label for="brandName">Tên thương hiệu:</label>
            <form:input path="tenThuongHieu" id="brandName" name="brandName" required="required"/>

            <input type="submit" value="Cập nhật Thương hiệu">
        </form:form>
    </div>
</body>
</html>