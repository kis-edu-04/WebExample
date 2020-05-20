<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>売り上げ詳細</title>
</head>
<body>
<h1>売上詳細</h1>

<p>売り上げID:${uriage.uid }</p>
<p>商品ID:${uriage.sid }</p>
<p>商品名:${shouhin.sname }</p>
<p>価格:${shouhin.tanka }</p>
<p>個数:${uriage.kosu }</p>
<p>金額:${shouhin.tanka*uriage.kosu }</p>
<p>日付:${uriage.hi }</p>

<table>
	<tr><th>売り上げ詳細</th></tr>
	<tr><td></td></tr>


</table>
</body>
</html>