package com.hp.dao.impl;

import com.hp.dao.TPurchaseDao;
import com.hp.pojo.TApproval;
import com.hp.pojo.TPurchase;
import com.hp.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TPurchaseDaoImpl implements TPurchaseDao {
    //查所有方法
    @Override
    public List<TApproval> queryall() {
        //连接数据库
        Connection conn = DBHelper.getcconn();
        //执行的SQL语句
        String  sql="SELECT  *  FROM  tbl_purchase   tp1,tbl_pur_approval   ta1  WHERE  tp1.pid=ta1.pid;";
        PreparedStatement    ps=null;
        ResultSet   rs=null;
        List<TApproval>   list=new ArrayList<>();
        try {
            //执行SQL语句
             ps = conn.prepareStatement(sql);
             rs = ps.executeQuery();

             //循环赋值
             while(rs.next()){
                 TApproval ta = new TApproval();
                 ta.setPaid(rs.getInt("paid"));
                 ta.setPadate(rs.getString("padate"));
                 ta.setPastate(rs.getString("pastate"));
                 TPurchase tp = new TPurchase();
                 tp.setPid(rs.getInt("pid"));
                 tp.setPtype(rs.getString("ptype"));
                 tp.setPname(rs.getString("pname"));
                 tp.setPunit(rs.getString("punit"));
                 tp.setPnum(rs.getInt("pnum"));
                 tp.setPperson(rs.getString("pperson"));
                 ta.setTpurchase(tp);
                 //添加到集合
                 list.add(ta);

             }

        }catch (Exception  e){
            e.printStackTrace();
        }finally {
            //关闭资源
            DBHelper.close(conn,ps,rs);
        }


        return list;
    }

    //添加方法
    @Override
    public void addcai(TPurchase tPurchase) {
        //连接数据库
        Connection conn = DBHelper.getcconn();
        //执行的SQL语句
        String  sql="INSERT  INTO   tbl_purchase(ptype,pname,punit,pnum,pperson)  VALUES(?,?,?,?,?);";
        PreparedStatement    ps=null;

        try {
            //执行SQL语句
            ps=conn.prepareStatement(sql);
            ps.setString(1,tPurchase.getPtype());
            ps.setString(2,tPurchase.getPname());
            ps.setString(3,tPurchase.getPunit());
            ps.setInt(4, tPurchase.getPnum());
            ps.setString(5,tPurchase.getPperson());

            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            DBHelper.close(conn,ps);
        }
    }

    //单条查询
    @Override
    public TPurchase queryone(String pperson, String pname) {
        Connection conn = DBHelper.getcconn();
        //sql语句
        String  sql="SELECT  * FROM  tbl_purchase  WHERE  pperson=?  and  pname=?; ";
        PreparedStatement    ps=null;
        ResultSet   rs=null;
        TPurchase tp = new TPurchase();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,pperson);
            ps.setString(2,pname);

             rs = ps.executeQuery();
            while(rs.next()){
                tp.setPid(rs.getInt("pid"));
             }

        }catch (Exception  e){
            e.printStackTrace();
        }finally {
            //关闭资源
            DBHelper.close(conn,ps,rs);
        }


        return tp;
    }
    //添加方法
    @Override
    public void tianjia(int pid) {
        {
            Connection conn = DBHelper.getcconn();
            String  sql="INSERT   INTO  tbl_pur_approval(pid,padate,pastate)  VALUES(?,?,?);";
            PreparedStatement    ps=null;

            try {
                ps=conn.prepareStatement(sql);
                ps.setInt(1,pid);
                ps.setString(2,"");
                ps.setString(3,"");

                ps.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                DBHelper.close(conn,ps);
            }
        }
    }

    //审批方法
    @Override
    public void update(TApproval tApproval) {
        {
            Connection conn = DBHelper.getcconn();
            String  sql="UPDATE  tbl_pur_approval  set padate=?,pastate=?  WHERE  pid=?;";
            PreparedStatement    ps=null;

            try {
                ps=conn.prepareStatement(sql);

                ps.setString(1,tApproval.getPadate());
                ps.setString(2,tApproval.getPastate());

                ps.setInt(3,tApproval.getTpurchase().getPid());


                ps.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                DBHelper.close(conn,ps);
            }
        }
    }

    //删除方法
    @Override
    public void delcai(int pid) {
        {
            Connection conn = DBHelper.getcconn();
            String  sql="DELETE  FROM   tbl_pur_approval  WHERE  pid=?;";
            String  sql2="DELETE  FROM   tbl_purchase  WHERE  pid=?;";

            PreparedStatement ps=null;

            try {
                 ps=conn.prepareStatement(sql);
                 ps.setInt(1,pid);
                 ps.executeUpdate();

                 ps=conn.prepareStatement(sql2);
                 ps.setInt(1,pid);
                 ps.executeUpdate();







                ps.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                DBHelper.close(conn,ps);
            }
        }
    }
}
