<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista osób - laboratorium 4</title>
    </head>
    <body>
        <h1>Lista osób</h1>
        <table border = "1">
        <c:forEach items="${lista}" var="osoba">
            <tr>
                <td>${osoba.firstName}</td> <td>${osoba.lastName}</td> <td>${osoba.email}</td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
