<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin-thuonghieu-manager</title>
<style type="text/css">
        /* Reset some default margin and padding for consistent styling */
body, h1, h2, p, div, table, tr, td {
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

/* Style the "Add Thương hiệu" button */
input[type="button"] {
    background-color: #4CAF50; /* Example button color */
    color: #fff; /* Example text color */
    padding: 10px 20px; /* Example padding */
    border: none; /* Remove border */
    cursor: pointer;
}

/* Style the table */
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px; /* Example margin */
}

/* Style the table header row */
table tr {
    background-color: #f2f2f2; /* Example background color */
}

/* Style the table cells */
table td {
    border: 1px solid #ddd; /* Example border color */
    padding: 8px; /* Example padding */
}

    </style>
</head>
<body>
	<div class="ten-shop">
        <h1>Shoe MD</h1>
    </div>
    <div class="container">
        <input type="button" value="Add Thương hiệu" onclick="window.location.href='admin-form-add-thuonghieu';return false">
        <table>
            <tr>
                <td>Mã thương hiệu</td>
                <td>Tên thương hiệu</td>
                <td>Actions</td>
            </tr>
            <c:forEach var="th" items="${thuongHieus }">
            <c:url var="deleteLink" value="/admin/deleteThuongHieu" >
            	<c:param name="maThuongHieu" value="${th.maThuongHieu }"></c:param>
            </c:url>
            <c:url var="updateLink" value="/admin/admin-form-update-thuonghieu" >
            	<c:param name="maThuongHieu" value="${th.maThuongHieu }"></c:param>
            </c:url>
            	<tr>
            		<td>${th.maThuongHieu }</td>
            		<td>${th.tenThuongHieu }</td>
            		<td>
            			<a href="${deleteLink }" onclick="if(!(confirm('Bạn có muốn xóa thương hiệu này không?'))) return false">delete</a>
            			<a href="${updateLink }">update</a>
            		</td>
            	</tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>