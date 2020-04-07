package com.suheng.structure;

import com.suheng.structure.utils.NetworkUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

@WebServlet(name = "DemoServlet")
public class DemoServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("HelloServlet, init");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "context path: " + request.getContextPath()
                + "\nservlet path: " + request.getServletPath()
                + "\nrequest url: " + request.getRequestURL()
                + "\nrequest uri:  " + request.getRequestURI()
                + "\nproject real path: " + request.getServletContext().getRealPath("")
                + "\npictures real path: " + request.getServletContext().getRealPath("pictures")
                + "\nclass path: " + getClass().getResource("/").getPath()
                + "\nuser.dir: " + System.getProperty("user.dir");
        System.out.println(msg);//输出文本到控制台

        System.out.println("ip: " + NetworkUtil.getHostIp());

        response.setContentType("text/html");//设置响应内容类型
        PrintWriter out = response.getWriter(); //输出文本到访问端
        out.write("<h3> " + msg + " </h3>");
        out.flush();
    }


    @Override
    public void destroy() {
        super.destroy();
        System.out.println("HelloServlet, destroy");
    }


}
