<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>追加確認</title>
</head>
<body>
<h1>商品確認</h1>
<form action="insert" method="post">
<p>名前:<c:out value="${shouhin.sname }"></c:out></p>
<p>単価:${shouhin.tanka }</p>
<input type="hidden" name="name" value="${shouhin.sname }">
<input type="hidden" name="tanka" value="${shouhin.tanka }">
<p>追加しますか?</p>
<input type="submit" value="追加">
</form>


</body>
</html>