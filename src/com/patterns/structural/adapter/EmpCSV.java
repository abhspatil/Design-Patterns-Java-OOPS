package com.patterns.structural.adapter;

public class EmpCSV {
    public String id;
    public String fname;
    public String lname;
    public String emailid;

    public EmpCSV(String data){

        String [] details = data.split(",");

        this.id = details[0];
        this.fname = details[1];
        this.lname = details[2];
        this.emailid = details[3];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
