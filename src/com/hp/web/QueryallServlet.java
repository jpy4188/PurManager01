package com.hp.web;

import com.hp.pojo.TApproval;
import com.hp.service.TPurchaseService;
import com.hp.service.impl.TPurchaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/queryall.do")
public class QueryallServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("全查询方法");
        TPurchaseService tPurchaseService = new TPurchaseServiceImpl();
        List<TApproval> list = tPurchaseService.queryall();
        req.setAttribute("list",list);
        req.getRequestDispatcher("showall.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
