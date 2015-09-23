<%-- 
    Document   : sendto
    Created on : Sep 23, 2015, 3:41:03 PM
    Author     : adminsyss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        
        
         <h2>Hello World!</h2>
        <% String value=request.getParameter("val"); %>
        <%= value%>
        <% int n = Integer.parseInt(value);%>
        <TABLE BORDER="2">
<%    for ( int i = 0; i <= 200; i++ ) { %>
        <TR>
        <TD> <%=i%> * <%=n%> </TD>
        <TD><%= n * i %></TD>
        </TR>
        <%
    }
%>

        </TABLE>
    </body>
</html>
