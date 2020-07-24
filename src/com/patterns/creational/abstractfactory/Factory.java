package com.patterns.creational.abstractfactory;

public class Factory{

    public Factory(){};

    public static Object getfactory(FactoryType factoryType){
        switch (factoryType){
            case LAPTOP:
                return new LaptopFactory();
            case MOBILE:
                return new MobileFactory();
            default:
                return null;

        }
    }
}
