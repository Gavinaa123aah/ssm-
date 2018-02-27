<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/2/9
  Time: 下午5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>用户注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/users/register">
    <table border="1">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>

</body>
</html>
