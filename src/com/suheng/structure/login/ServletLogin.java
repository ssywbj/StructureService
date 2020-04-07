package com.suheng.structure.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
    private static final String JSON = "{" + "\"code\":0" + ",\"msg\":ok" + ",data:{"
            + "\"member_id\":17" + ",\"age\":18" + ",\"email_address\":\"Wbj@qq.com\"" + "}" + "}";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    //内部访问：http://localhost:8080/StructureService/Login?user_name=Wbj韦&login_pwd=abc123
    //外部访问：http://ip:8080/StructureService/Login?user_name=Wbj韦&login_pwd=abc123
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("user_name");
        String loginPwd = request.getParameter("login_pwd");
        System.out.println("user name: " + userName + ", login pwd: " + loginPwd);

        PrintWriter out = response.getWriter();
        out.write(JSON);
        out.flush();
        out.close();
    }
}
