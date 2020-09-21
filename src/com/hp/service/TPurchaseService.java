package com.hp.service;

import com.hp.pojo.TApproval;
import com.hp.pojo.TPurchase;

import java.util.List;

public interface TPurchaseService {
    List<TApproval>  queryall();
    void  addcai(TPurchase   tPurchase);
    TPurchase   queryone(String  pperson,String  pname);
    void  tianjia(int  pid);
    void  update(TApproval  tApproval);
    void   delcai(int  pid);
}
