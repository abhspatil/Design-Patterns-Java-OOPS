package com.patterns.structural.adapter;

public class Client {

    public static void main(String[] args) {

        Employee empdb = new EmployeeDB("1","Abhi","Patil","xyz@gmail.com");
        System.out.println("From Database : "+empdb.getId() +" "+empdb.getFirstName()+" "+empdb.getLastName()+" "+empdb.getEmail());

        // ldap not compatible with Standard Employee format, to convert it to Standard format we use LDAP Adapter
        EmpLDAP ldap = new EmpLDAP("2","Vishal","Patil","vish1@gmail.com");
        Employee empldap = new LDAPAdapter(ldap);
        System.out.println("From LDAP : "+empldap.getId() +" "+empldap.getFirstName()+" "+empldap.getLastName()+" "+empldap.getEmail());

        // CSV not compatible with Standard Employee format, to convert it to Standard format we use CSV Adapter
        EmpCSV csv = new EmpCSV("3,Anita,Patil,anita@gmail.com");
        Employee empcsv = new CSVAdapter(csv);
        System.out.println("From CSV File : "+empcsv.getId() +" "+empcsv.getFirstName()+" "+empcsv.getLastName()+" "+empcsv.getEmail());


    }
}
