<%-- 
    Document   : login-success
    Created on : Jul 25, 2019, 1:31:48 PM
    Author     : Owais
--%>

<%@page import="controllers.LoginBean"%>  
  
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());  
%>  