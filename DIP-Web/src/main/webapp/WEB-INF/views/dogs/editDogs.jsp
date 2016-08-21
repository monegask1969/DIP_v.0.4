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
                        ${dog.id}
                    </td>
                </tr>
                <tr>
                    <td>breed</td>
                    <td>
                        ${dog.breed}
                    </td>
                </tr>
                <tr>
                    <td>gender</td>
                    <td>
                        <input type="text" name="gender" value="${dog.gender}"/>
                    </td>
                </tr>
                <tr>
                    <td>name</td>
                    <td>
                        <input type="text" name="name" value="${dog.name}"/>
                    </td>
                </tr>
                <tr>
                    <td>date of birth</td>
                    <td>
                        <input type="text" name="dob" value="${dog.dob}"/>
                    </td>
                </tr>
                <tr>
                    <td>color</td>
                    <td>
                        <input type="text" name="color" value="${dog.color}"/>
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
