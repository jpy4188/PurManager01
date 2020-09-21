package com.hp.web;

import com.hp.pojo.TApproval;
import com.hp.pojo.TPurchase;
import com.hp.service.TPurchaseService;
import com.hp.service.impl.TPurchaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("审批方法");
        int pid=Integer.parseInt(req.getParameter("pid"));
        String  pastate="已审批";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String padate = sdf.format(date);
        TPurchase tPurchase = new TPurchase();
        tPurchase.setPid(pid);
        TApproval ta = new TApproval(tPurchase,padate,pastate);
        TPurchaseService tPurchaseService = new TPurchaseServiceImpl();
        tPurchaseService.update(ta);
        resp.sendRedirect("queryall.do");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
