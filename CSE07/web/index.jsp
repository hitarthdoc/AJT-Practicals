<%-- 
    Document   : index
    Created on : Jul 16, 2015, 12:58:01 PM
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
        
        <form method="post" action="./LoginCheck">
            
            <label> User Name:</label> <input type="text" name="uName"/> <br/>
            <label> Password:</label> <input type="password" name="pass"/> <br/>
            <input type="submit" /> <br/>
            
        </form>
        
    </body>
</html>
