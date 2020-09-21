package com.hp.pojo;

public class TApproval {
    private int paid;
    private TPurchase tpurchase;
    private String padate;
    private String pastate;

    public TApproval(int paid, TPurchase tpurchase, String padate, String pastate) {
        this.paid = paid;
        this.tpurchase = tpurchase;
        this.padate = padate;
        this.pastate = pastate;
    }

    public TApproval(TPurchase tpurchase, String padate, String pastate) {
        this.tpurchase = tpurchase;
        this.padate = padate;
        this.pastate = pastate;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public TPurchase getTpurchase() {
        return tpurchase;
    }

    public void setTpurchase(TPurchase tpurchase) {
        this.tpurchase = tpurchase;
    }

    public String getPadate() {
        return padate;
    }

    public void setPadate(String padate) {
        this.padate = padate;
    }

    public String getPastate() {
        return pastate;
    }

    public void setPastate(String pastate) {
        this.pastate = pastate;
    }

    @Override
    public String toString() {
        return "TApproval{" +
                "paid=" + paid +
                ", tpurchase=" + tpurchase +
                ", padate='" + padate + '\'' +
                ", pastate='" + pastate + '\'' +
                '}';
    }

    public TApproval() {
        super();
    }
}
