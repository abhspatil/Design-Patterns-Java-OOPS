package com.patterns.creational.abstractfactory;

public class MobileFactory {

    public MobileFactory(){};

    public Object getMobile(MobileType mobileType){

        switch (mobileType){
            case MI:
                return new Mi();
            case SAMSUNG:
                return new Samsung();
            case IOS:
                return new Iphone();
            default:
                return null;
        }
    }

    public void display(){
        System.out.println("kjdbfsjd");
    }
}
