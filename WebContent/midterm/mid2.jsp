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
</head>
<%
String s1 = request.getParameter("s1");
if (s1 == null) s1 = "one";
%>
<body>

<form>
  <div>
  <input id="s1" type="radio" name="number" value=<%= "one".equals(s1) ? "checked" : "" %>  />
  <label for="s1">one</label>
  <input id="s1" type="radio" name="number" value=<%= "two".equals(s1) ? "checked" : "" %>  />
  <label for="s1">two</label>
  <input id="s1" type="radio" name="number" value=<%= "three".equals(s1) ? "checked" : "" %>  />
  <label for="s1">three</label>
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
