<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/8/10
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", path);
%>
<html>
<head>
    <base href="${path}">
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        function f(){
            $.get("hos",function(re){
                console.log(re)

            })
        }
        function f1(){
            $.get("sel",function(re){
                console.log(re)


            })
        }
    </script>
</head>
<body>
    成功
    <div id="a">

    </div>
    <a href="hos">adfjadlkj</a>
    <a href="sel">adfjadlkj</a>
   <input type="button" value="提交" onclick="f()"/>
   <input type="button" value="提交1" onclick="f1()"/>
</body>
</html>
