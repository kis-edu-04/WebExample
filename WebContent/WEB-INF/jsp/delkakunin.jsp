<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>商品確認</h1>
<form action="del" method="post">
<p>商品ID:${shouhin.sid }</p>
<p>名前:${shouhin.sname }</p>
<p>単価:${shouhin.tanka }</p>
<input type="hidden" name="sid" value="${shouhin.sid }">
<p>削除しますか?</p>
<input type="submit" value="削除">
</form>
</body>
</html>