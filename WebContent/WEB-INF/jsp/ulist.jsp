<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr><th>商品ID</th><th>商品名</th><th>商品価格</th><th>日付</th></tr>
<c:forEach var="uriage" items="${list }">

	<tr>
		<td>${uriage.uid }</td>
		<td>${uriage.sid }</td>
		<td>${uriage.kosu }</td>
		<td>${uriage.hi }</td>

	</tr>


</c:forEach>
</table>

</body>
</html>