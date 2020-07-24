package com.patterns.structural.adapter;

public class CSVAdapter implements Employee{

    EmpCSV empCSV;

    public CSVAdapter(EmpCSV empCSV){
        this.empCSV = empCSV;
    }

    @Override
    public String getId() {
        return this.empCSV.getId();
    }

    @Override
    public String getFirstName() {
        return this.empCSV.getFname();
    }

    @Override
    public String getLastName() {
        return this.empCSV.getLname();
    }

    @Override
    public String getEmail() {
        return this.empCSV.getEmailid();
    }
}
