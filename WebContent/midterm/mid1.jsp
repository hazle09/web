<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
  div.container { width: 400px; margin: 20px auto; }
  form div { margin-bottom: 10px; }
  label { display: inline-block; width: 50px; text-align: right; }
  input { width: 200px; padding: 4px; }
  button { padding: 0.4em 2em; margin-top: 10px; }
  table { width: 300px; border-collapse: collapse; margin-top: 50px; }
  thead tr { background-color: #eee; }
  td, th { border: 1px solid #aaa; padding: 5px; }  
</style>
</head>
<body>
  <% request.setCharacterEncoding("utf-8"); %>
  <div class="container">
    <form>
      <div> 
        <input type="text" name="text1" value='<%= request.getParameter("text1") %>' />
      </div>
      
      <div>
        <button type="submit">단</button>
      </div>
    </form>

    <table border=1>
    	<% for(int i=1;i<=9;i++){%>
    	<tr>
    	<td>
    	<%= request.getParameter("text1") %> x <% %>
    	
      
      
        
         
    </table>
  </div>
</body>
</html>
