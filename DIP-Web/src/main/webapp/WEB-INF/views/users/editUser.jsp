<%-- 
    Document   : index
    Created on : 02.08.2016, 19:23:48
    Author     : stan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, tr,td{
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <form action="" method="post">
            <table>
                <tr>
                    <td>id</td>
                    <td>
                        ${user.id}
                    </td>
                </tr>
                <tr>
                    <td>login</td>
                    <td>
                        ${user.login}
                    </td>
                </tr>
                <tr>
                    <td>firstname</td>
                    <td>
                        <input type="text" name="firstname" value="${user.firstname}"/>
                    </td>
                </tr>
                <tr>
                    <td>lastname</td>
                    <td>
                        <input type="text" name="lastname" value="${user.lastname}"/>
                    </td>
                </tr>
                <tr>
                    <td>email</td>
                    <td>
                        <input type="text" name="email" value="${user.email}"/>
                    </td>
                </tr>
                <tr>
                    <td>phone</td>
                    <td>
                        <input type="text" name="phone" value="${user.phone}"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="save" value="save"/>
                    </td>
                </tr>
        </table>
        </form>
    </body>
</html>
