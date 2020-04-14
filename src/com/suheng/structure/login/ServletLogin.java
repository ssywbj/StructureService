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
            + "\"member_id\":17" + ",\"age\":18" + ",\"email_address\":\"韦Wbj@qq.com\"" + "}" + "}";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    //内部访问：http://localhost:8080/StructureService/Login?user_name=Wbj韦&login_pwd=abc123
    //外部访问：http://ip:8080/StructureService/Login?user_name=Wbj韦&login_pwd=abc123
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//设置字符集编码为"UTF-8"(同客户端)以防止取出的值出现乱码的情况（前后两端需统一编码才能保证不出现乱码的情况）
        response.setContentType("text/html;charset=UTF-8");//设置响应内容类型以防止输出结果出现乱码的情况

        String userName = request.getParameter("user_name");
        String loginPwd = request.getParameter("login_pwd");
        System.out.println("user name: " + userName + ", login pwd: " + loginPwd);

        /*request.setAttribute("remind", "登录成功");//设置页面自定义的属性值
        request.getRequestDispatcher("/index.jsp").forward(request, response);//页面跳转*/

        PrintWriter out = response.getWriter();
        //System.out.println("json: " + JSON);
        out.write(JSON);
        out.flush();
        out.close();
    }
}
