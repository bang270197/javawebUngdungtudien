<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/17/2019
  Time: 7:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <form action="/translate" method="post">
    <h2>Vietnamese Dictionary</h2>
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search">
  </form>
  </body>
</html>
