<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021-03-15
  Time: 16:22
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
    $(document).ready(function (){
        $("#bt").click(function (){
            var list =new Array();
            list.push({uid:1000,username:"jack",age:18,phone:13874776666});
            list.push({uid:1001,username:"tom",age:19,phone:13874776666});
            list.push({uid:1002,username:"pitter",age:20,phone:13874776666});
            list.push({uid:1003,username:"joi",age:21,phone:13874776666});
            $.ajax({
                type:"POST",
                data:JSON.stringify(list),
                url:"${page}/listParam",
                contentType:"application/json;charset=utf-8",
                success:function (data){
                    alert(data.uid);
                }
            }).then(function (value){
                console.log(value);
            })
        })
    })
</script>
<input type="button" id="bt" value="submitUser"/>
</body>
</html>
