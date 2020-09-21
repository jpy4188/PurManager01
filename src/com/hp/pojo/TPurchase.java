package com.hp.pojo;

public class TPurchase {
    private int  pid;
    private String  ptype;
    private String  pname;
    private String punit;
    private int  pnum;
    private String  pperson;

    public TPurchase(int pid, String ptype, String pname, String punit, int pnum, String pperson) {
        this.pid = pid;
        this.ptype = ptype;
        this.pname = pname;
        this.punit = punit;
        this.pnum = pnum;
        this.pperson = pperson;
    }

    public TPurchase(String ptype, String pname, String punit, int pnum, String pperson) {
        this.ptype = ptype;
        this.pname = pname;
        this.punit = punit;
        this.pnum = pnum;
        this.pperson = pperson;
    }

    @Override
    public String toString() {
        return "TPurchase{" +
                "pid=" + pid +
                ", ptype='" + ptype + '\'' +
                ", pname='" + pname + '\'' +
                ", punit='" + punit + '\'' +
                ", pnum=" + pnum +
                ", pperson='" + pperson + '\'' +
                '}';
    }

    public TPurchase() {
        super();
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPunit() {
        return punit;
    }

    public void setPunit(String punit) {
        this.punit = punit;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public String getPperson() {
        return pperson;
    }

    public void setPperson(String pperson) {
        this.pperson = pperson;
    }
}
