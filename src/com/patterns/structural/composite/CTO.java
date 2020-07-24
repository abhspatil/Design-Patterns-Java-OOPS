package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CTO implements EmployeeHierarchy{
    private String empId;
    private String fullname;
    private String role;
    private List<EmployeeHierarchy> lowerlevel;

    public CTO(String empId, String fullname, String role) {
        this.empId = empId;
        this.fullname = fullname;
        this.role = role;
        this.lowerlevel = new ArrayList<>();
    }

    public void setEmployees(EmployeeHierarchy employee){
        this.lowerlevel.add(employee);
    }

    @Override
    public void getDetails() {
        System.out.println("Employee Id : "+this.empId+" , Employee Name :"+this.fullname+", Role : "+this.role);

        for(EmployeeHierarchy emp : lowerlevel){
            emp.getDetails();
        }

    }
}
