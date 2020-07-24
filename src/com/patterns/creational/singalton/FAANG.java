package com.patterns.creational.singalton;

public class FAANG {
    public static FAANG faang=null;

    private FAANG(){};

    public static FAANG getInstance(){
        if(faang == null) {
            faang = new FAANG();
        }
        return faang;
    }

    public void join(){
        System.out.println("Welcome to FAANG Group..!!");
    }
}
