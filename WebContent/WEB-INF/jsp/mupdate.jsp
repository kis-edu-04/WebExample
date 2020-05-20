<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="mupdate" method="post">
<input type="hidden" name="mid" value="${member.mid}">
名前:<input type="text" name="name" required placeholder="名前"><br>
住所:<input type="text" name="adr" required placeholder="住所"><br>
<input type="submit" value="変更">
</form>
<form action="model" method="post">
<input type="hidden" name="mid" value="${member.mid}">
<input type="submit" value="削除">
</form>

</body>
</html>