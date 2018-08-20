package com.bdqn.pojo;

public class User {
    private int lid;
    private String lname;
    private String lpassword;
    private ClassInfo classInfo;
    public User() {
    }

    public User(int lid, String lname, String lpassword, ClassInfo classInfo) {
        this.lid = lid;
        this.lname = lname;
        this.lpassword = lpassword;
        this.classInfo = classInfo;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLpassword() {
        return lpassword;
    }

    public void setLpassword(String lpassword) {
        this.lpassword = lpassword;
    }
}
