package com.hp.service.impl;

import com.hp.dao.TPurchaseDao;
import com.hp.dao.impl.TPurchaseDaoImpl;
import com.hp.pojo.TApproval;
import com.hp.pojo.TPurchase;
import com.hp.service.TPurchaseService;

import java.util.List;

public class TPurchaseServiceImpl implements TPurchaseService {
    TPurchaseDao   tpurchaseDao=new  TPurchaseDaoImpl();
    @Override
    public List<TApproval> queryall() {
        return tpurchaseDao.queryall();
    }

    @Override
    public void addcai(TPurchase tPurchase) {
        tpurchaseDao.addcai(tPurchase);
    }

    @Override
    public TPurchase queryone(String pperson, String pname) {
        return tpurchaseDao.queryone(pperson,pname);
    }

    @Override
    public void tianjia(int pid) {
        tpurchaseDao.tianjia(pid);
    }

    @Override
    public void update(TApproval tApproval) {
        tpurchaseDao.update(tApproval);
    }

    @Override
    public void delcai(int pid) {
        tpurchaseDao.delcai(pid);
    }
}
