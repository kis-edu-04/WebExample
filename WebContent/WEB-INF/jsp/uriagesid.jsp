<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td,th{
	border:1px solid gray;
	text-align:center;
}
table{
	border-collapse:collapse;
}
</style>

</head>
<body>
<h1>${shouhin.sname }売り上げ一覧</h1>


<table>
<tr><th>日付</th><th>個数</th></tr>
<c:forEach var="ulist" items="${list }">


	<tr>
		<td>${ulist.hi }</td>
		<td>${ulist.kosu }</td>
	</tr>


</c:forEach>
</table>
<form action="uriagesid" method="post">
個数:<input type="text" name="kosu" required ><br>
<input type="hidden" name="sid" value="${shouhin.sid }"><br>
<input type="submit" value="追加">

</form>
</body>
</html>