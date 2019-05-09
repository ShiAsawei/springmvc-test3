<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/19 0019
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
  <h3>Welcome to Register Page</h3>
  <form action="registerForm" method="post">
      <table>
          <tr>
              <td><label>用户名: </label></td>
              <td><input type="text" id="username" name="username"></td>
          </tr>
          <tr>
              <td><label>密码: </label></td>
              <td><input type="text" id="password" name="password"></td>
          </tr>
          <tr>
              <td><input id="submit" type="submit" value="注册"></td>
          </tr>
      </table>
  </form>

  </body>
</html>
