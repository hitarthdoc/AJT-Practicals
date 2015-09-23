<%-- 
    Document   : index
    Created on : Sep 23, 2015, 3:15:10 PM
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
        <form action="index.jsp">
        <input type="text" name="val"/>
        <input type="submit"/>
        </form>
        
        
        <h2>Hello World!</h2>
        <% 
        if(request.getParameter("val") != null)
        {    
        String value=request.getParameter("val"); 
        int n = Integer.parseInt(value);
        %>
        <TABLE BORDER="2">
<%    for (int i = 0; i < 20; i++ ) 
{ %>
        <TR>
        <TD> <%=i%> * <%=n%> </TD>
        <TD><%= n * i %></TD>
        </TR>
        <%
    }
        }
%>

</TABLE>
        -->
    </body>
</html>
