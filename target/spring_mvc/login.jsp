<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021-03-18
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
    <% pageContext.setAttribute("page",request.getContextPath()); %>
</head>
<body>
    <form action="${page}/users/login" method="post">
        用户名:<input type="text" name="user" /><br/>
        密码:<input type="password" name="password" /><br/>
        <input type="submit" value="登录" />
    </form>
</body>
</html>
