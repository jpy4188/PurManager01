package com.hp.dao;

import com.hp.pojo.TApproval;
import com.hp.pojo.TPurchase;

import java.util.List;

public interface TPurchaseDao {
    List<TApproval>  queryall();
    void  addcai(TPurchase   tPurchase);
    TPurchase   queryone(String  pperson,String  pname);
    void  tianjia(int  pid);
    void  update(TApproval  tApproval);
    void   delcai(int  pid);


}
