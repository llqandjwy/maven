<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/8/10
  Time: 10:29
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
    <title>$Title$</title>
  </head>
  <body>
  <a href="login?name=123&password=123">登录</a>
    <form action="insert" method="post">
      <input type="text" name="name">
      <input type="text" name="id">
      <input type="text" name="password">
      <input type="submit">
    </form>
  </body>
</html>
