package com.zt.pojo;

public class Student {
    private Integer sid;
    private String sname;
    private String classid;


    public Student() {
    }

    public Student(Integer sid, String sname, String classid) {
        this.sid = sid;
        this.sname = sname;
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", classid='" + classid + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }
}
