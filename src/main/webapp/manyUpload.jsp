<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021-03-18
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <% pageContext.setAttribute("page",request.getContextPath()); %>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<script></script>
    <form action="${page}/restful/manyUpload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" multiple="multiple"/>
        <input type="submit" value="submit" />
    </form>
</body>
</html>
