package com.patterns.structural.facade;

public class Customer {
    private String fullname;
    private String address;
    private String mobilenumber;
    private PizzaHutCounter pizzaHutCounter;

    public Customer(String fullname, String address, String mobilenumber) {
        this.fullname = fullname;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.pizzaHutCounter= new PizzaHutCounter(this);
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public void addtoCart(PizzaType type){
        pizzaHutCounter.addtoCart(type);
    }

    public void order() {
        pizzaHutCounter.checkOut();
    }

    @Override
    public String toString() {
        return "\tfullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", mobilenumber='" + mobilenumber +'\'';
    }
}
