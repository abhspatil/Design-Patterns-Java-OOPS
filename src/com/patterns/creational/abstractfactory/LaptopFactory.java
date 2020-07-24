package com.patterns.creational.abstractfactory;

public class LaptopFactory {

    public LaptopFactory(){};

    public Object getLaptop(LaptopType laptopType){

        switch (laptopType) {

            case HP:
                return new HP();
            case MAC:
                return new MAC();
            case DELL:
                return new Dell();
            default:
                return null;

        }
    }
}
