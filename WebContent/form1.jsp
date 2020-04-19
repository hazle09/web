<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<style> 
body { font-family: 굴림체; } 

form div { margin-bottom: 10px; } 
input { width: 200px; padding: 4px; } 
button { padding: 0.4em 3em; margin-top: 10px; } 
</style> 
</head> 
<body> 
<%
		String s1 = request.getParameter("param1");
	int number1 = Integer.parseInt(s1);
	
	String cmd = request.getParameter("cmd");
	int result = 0;
	if (cmd.equals("+"))
		result = number1 + 1;
	%>
	 

<div class="container"> 
<form method="post"> 

<div> 

<input type="text" name="param1" value="1" /> 
 
<button type="submit" name="cmd" value="ok">++</button> 
</form> 
</div> 
</body> 
</html>

