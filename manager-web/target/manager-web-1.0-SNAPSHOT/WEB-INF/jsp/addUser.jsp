<%--
  Created by IntelliJ IDEA.
  User: yucheguo
  Date: 2020/5/20
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form action="/user/addUser" method="post">
    name: <input type="text" name="username"/><br/>
    age: <input type="text" name="userage"/><br/>
    <input type="submit" value="ok"/><br/>
</form>
</body>
</html>
