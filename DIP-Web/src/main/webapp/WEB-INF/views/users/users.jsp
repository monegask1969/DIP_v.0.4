<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
        <script>
            function removeUser(id){
                if(confirm("remove this user?")){
                console.log('id = ' + id);
                var url = 'users/'+id;
                $.ajax({
                    type: "DELETE",
                    url: url,
                    data: {id:id},
                    success: function(data,status){
                        //remove user from table
                        $('#usr_'+id).remove();
                    },
                    error:function(data,status){
                        $('#usr_'+id).remove();
                        //alert
                    }
                  });
              }
                  return false;
            }
        </script>
        <style>
            table, tr,td{
                border: 1px solid black;
            }
        </style>
        <base href="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />

    </head>
    <body>
        <h1><a href="login?logout">Log Out</a></h1>
        <table>
            <tr>
                <td>id</td>
                <td>login</td>
                <td>firstname</td>
                <td>lastname</td>
                <td>email</td>
                <td>phone</td>
                <td>view</td>
            </tr>
            <c:forEach var="u" items="${users}">
            <tr id="usr_${u.id}">
                <td>${u.id}</td>
                <td>${u.login}</td>
                <td>${u.firstname}</td>
                <td>${u.lastname}</td>
                <td>${u.email}</td>
                <td>${u.phone}</td>
                <td><a href="users/${u.id}">view</a></td>
                <td><a href="users/${u.id}" onclick="return removeUser(${u.id})">delete</a></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
