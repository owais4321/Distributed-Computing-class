<%-- 
    Document   : index
    Created on : Jul 23, 2019, 2:19:56 PM
    Author     : Owais
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
         out.println("Your IP address is " + request.getRemoteAddr());
      %>
      <%! int i = 0; %> 
       <%
         out.println("Value of " + i);
      %>
      <%-- This comment will not be visible in the page source --%> 
      <p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>
    </body>
</html>
