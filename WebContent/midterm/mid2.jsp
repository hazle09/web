<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
  div { margin-bottom: 10px; }
  input, select { padding: 5px; }
  button { padding: 0.4em 2em; }
</style>
<title>Insert title here</title>
</head>
<%
String s1 = request.getParameter("s1");
if (s1 == null) s1 = "one";
%>
<body>

<form>
  <div>
  <input id="r1" type="radio" name="number1" value=<%= "one".equals(s1) ? "selected" : "" %>  />
  <label for="r1">one</label>
  <input id="r2" type="radio" name="number2" value=<%= "two".equals(s1) ? "selected" : "" %>  />
  <label for="r2">two</label>
  <input id="r3" type="radio" name="number3" value=<%= "three".equals(s1) ? "selected" : "" %>  />
  <label for="r3">three</label>
  </div>
  
  <div>
    <input type="text" value="<%= s1 %>" />
  </div>
  
  <div>
    <button type="submit">Ok</button>
  </div>
</form>

</body>
</html>
