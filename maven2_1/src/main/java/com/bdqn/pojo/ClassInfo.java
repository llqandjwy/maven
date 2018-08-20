package com.bdqn.pojo;

import java.util.List;

public class ClassInfo {
    private int cid;
    private String cname;
    private List<User> users;

    public ClassInfo() {
    }

    public ClassInfo(int cid, String cname, List<User> users) {
        this.cid = cid;
        this.cname = cname;
        this.users = users;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
