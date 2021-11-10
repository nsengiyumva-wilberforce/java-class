<%-- 
    Document   : index
    Created on : Nov 6, 2021, 4:16:55 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>Makerere University</h1>
        <form method="POST" action="Form1">
        <% 
            if(request.getAttribute("error")!=null){
            out.println(request.getAttribute("error")); 
            }
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Value</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login" name="submit" /></td>
                </tr>
            </tbody>
        </table>
            </form>

    </body>
</html>
