<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
 
  form div { margin-bottom: 10px; }
  input { width: 100px; padding: 4px; }
  button { padding: 0.4em 2em; margin-top: 10px; }
  table { width: 100px; border-collapse: collapse;}
  
</style>
</head>
<body>
  <% request.setCharacterEncoding("utf-8"); %>
  <% String s1=request.getParameter("text1");
  	 int number1=(s1==null)? 0:Integer.parseInt(s1);
  	%>
  <div class="container">
    <form>
      <div> 
        <input type="text" name="text1" value='<%= number1 %>' />
        <button type="submit">단</button>
      </div>
    </form>

    <table border=1>
    	<% for(int i=1;i<=9;i++){%>
    	<tr>
    	<td>
    	<%= number1 %> x <%= i %> = <%= number1 * i %>
    	</td>
    	</tr>
    	<%} %>
      
   
    </table>
  </div>
</body>
</html>
