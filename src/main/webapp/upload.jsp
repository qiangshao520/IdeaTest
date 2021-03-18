<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021-03-17
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>hello</title>
    <% pageContext.setAttribute("page",request.getContextPath()); %>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>

<body>
<script>

</script>
    <form action="${page}/restful/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" />
        <input type="submit" value="submit" />
    </form>
</body>
</html>
