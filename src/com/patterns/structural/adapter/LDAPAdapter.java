package com.patterns.structural.adapter;

public class LDAPAdapter implements Employee{

    EmpLDAP empLDAP;

    public LDAPAdapter(EmpLDAP empLDAP){
        this.empLDAP = empLDAP;
    }

    @Override
    public String getId() {
        return this.empLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return this.empLDAP.getGivenname();
    }

    @Override
    public String getLastName() {
        return this.empLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return this.empLDAP.getMail();
    }
}
