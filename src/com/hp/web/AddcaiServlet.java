package com.hp.web;

import com.hp.pojo.TPurchase;
import com.hp.service.TPurchaseService;
import com.hp.service.impl.TPurchaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addcai.do")
public class AddcaiServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("添加方法");
        req.setCharacterEncoding("UTF-8");
        String ptype = req.getParameter("ptype");
        String pname = req.getParameter("pname");
        String punit = req.getParameter("punit");
        int pnum = Integer.parseInt(req.getParameter("pnum"));
        String pperson = req.getParameter("pperson");
        TPurchase tPurchase = new TPurchase(ptype,pname,punit,pnum,pperson);
        TPurchaseService tPurchaseService = new TPurchaseServiceImpl();
        tPurchaseService.addcai(tPurchase);
        TPurchase tp = tPurchaseService.queryone(pperson, pname);
        tPurchaseService.tianjia(tp.getPid());
        resp.sendRedirect("queryall.do");


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
