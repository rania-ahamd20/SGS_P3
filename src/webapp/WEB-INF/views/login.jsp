<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login/processForm" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <button type="submit">Login</button>
    </form>

    <%-- Display error message if authentication fails --%>
    <c:if test="${param.error eq '1'}">
        <p style="color: red;">Authentication failed. Please try again.</p>
    </c:if>
</body>
</html>
