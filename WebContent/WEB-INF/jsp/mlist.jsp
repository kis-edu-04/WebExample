<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名前、住所リスト</title>
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
<form action="mlist" method="post">
名前:<input type="text" name="name" required placeholder="名前"><br>
住所:<input type="text" name="adr" required placeholder="住所"><br>
<input type="submit" value="追加">
</form>
<table>
<tr><th>名前</th><th>住所</th></tr>
<c:forEach var="member" items="${list }">

	<tr>
		<td><a href="mupdate?mid=${member.mid }">${member.name }</a></td>
		<td>${member.adr}</td>

	</tr>


</c:forEach>
</table>


</body>
</html>