<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table{border-collapse:collapse;}
	td{padding:3px; font-family:"맑은 고딕"}
</style>
</head>
<body>
<table border=1>

<% for (int i=1; i <= 9; ++i) {

out.println(" <tr>");

for (int j=2; j <= 9; ++j) {

out.println(" <td>" + j+" x "+i+" = "+i*j+ "</td>");

}

out.println(" </tr>");

}

%>

</table>

</body>
</html>