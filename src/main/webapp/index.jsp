<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<html>
<head>
   <title>hello</title>
   <% pageContext.setAttribute("page",request.getContextPath()); %>
   <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
   <script>
      var param = {uid: 123, username: "周永强", age: 22, phone: "15211638393"};
      var postMethod = function () {
         $.ajax({
            type: "POST",
            url: "${page}/restful",
            data: JSON.stringify(param),
            contentType: "application/json"
         }).then(function (value) {
            console.log(value)
         })
      };

      var putMethod=function () {
         $.ajax({
            type:"PUT",
            url:"${page}/restful/"+param.uid,
            data:JSON.stringify(param),
            contentType: "application/json"
         }).then(function (value) {
            console.log(value)
         })
      }

      var getMethod=function () {
         $.ajax({
            type:"GET",
            url:"${page}/restful/"+param.uid,
            data:JSON.stringify(param),
            contentType: "application/json"
         }).then(function (value) {
            console.log(value)
         })
      }

      var deleteMethod=function () {
         $.ajax({
            type:"DELETE",
            url:"${page}/restful/"+param.uid,
            data:JSON.stringify(param),
            contentType: "application/json"
         }).then(function (value) {
            console.log(value)
         })
      }
   </script>
   <input type="button" value="post" onclick="postMethod()" />

  <br/>
  <br/>

   <input type="button" value="put" onclick="putMethod()" />

   <br/>
   <br/>

   <input type="button" value="get" onclick="getMethod()" />

   <br/>
   <br/>

   <input type="button" value="delete" onclick="deleteMethod()" />
</body>
</html>
