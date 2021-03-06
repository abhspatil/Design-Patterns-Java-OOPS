package com.patterns.structural.composite;

public class Employee implements EmployeeHierarchy{

    String empId;
    String fullname;
    String role;

    public Employee(String empId, String fullname, String role) {
        this.empId = empId;
        this.fullname = fullname;
        this.role = role;
    }

    @Override
    public void getDetails() {
        System.out.println("Employee Id : "+this.empId+" , Employee Name :"+this.fullname+", Role : "+this.role);
    }
}
