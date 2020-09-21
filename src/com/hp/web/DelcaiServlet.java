package com.hp.web;

import com.hp.service.TPurchaseService;
import com.hp.service.impl.TPurchaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delcai.do")
public class DelcaiServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("删除方法");
        int pid=Integer.parseInt(req.getParameter("pid"));
        TPurchaseService tPurchaseService = new TPurchaseServiceImpl();
        tPurchaseService.delcai(pid);
        resp.sendRedirect("queryall.do");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
