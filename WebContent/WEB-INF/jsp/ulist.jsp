<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>売り上げリスト</title>
<style>
td,th{
	border:1px solid gray;
}
table{
	border-collapse:collapse;
}
</style>
</head>
<body>
<h1>売り上げリスト</h1>
<p>ようこそ、${user.uname }さん (${user.mail })</p>
<a href="logout">ログアウト</a>
<a href="uinsert">売り上げ追加</a>
<table>
<tr><th>商品ID</th><th>商品名</th><th>商品価格</th><th>日付</th></tr>
<c:forEach var="uriage" items="${list }">

	<tr>
		<td>${uriage.uid }</td>
		<td>${uriage.sid }</td>
		<td>${uriage.kosu }</td>
		<td>${uriage.hi }</td>
		<td><a href="uinfo?uid=${uriage.uid }">売り上げ詳細</a></td>


	</tr>


</c:forEach>
</table>

</body>
</html>