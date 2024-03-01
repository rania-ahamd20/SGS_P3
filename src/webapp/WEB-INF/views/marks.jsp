<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Marks Page</title>
</head>
<body>
    <%-- Display student marks here --%>
    <h2>Marks:</h2>
    <c:forEach var="mark" items="${marks}">
        <p>${mark}</p>
    </c:forEach>
</body>
</html>
