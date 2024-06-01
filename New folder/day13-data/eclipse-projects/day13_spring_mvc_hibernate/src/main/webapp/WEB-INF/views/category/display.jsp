<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="cat" items="${requestScope.category_list}">
		<h5>${cat.id}${cat.categoryName} ${cat.description}</h5>
	</c:forEach>
</body>
</html>