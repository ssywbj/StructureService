<%--
  Created by IntelliJ IDEA.
  User: weibangjie
  Date: 2020/4/7
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>StructureService</title>
    </head>

    <body>
        <%--Service for App Structure Demo--%>
        <h2>${remind}</h2>
        <h1>登录页面</h1>
        <form action="Login" method="post">
            登录名:<input type="text" name="user_name"><br/>
            密码为:<input type="password" name="login_pwd"><br/>
            <input type="submit" value="登录">
        </form>

        <h5>还未注册，快来注册</h5>
        <%--<a href="Register">注册</a><!--跳转到Servlet-->--%>
        <%--<a href="https://www.baidu.com/">注册</a><!--跳转到指定外部网页-->--%>
        <a href="register.jsp">注册</a><!--跳转到指定本地页面-->
    </body>
</html>
