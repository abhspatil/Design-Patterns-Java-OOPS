package com.patterns.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {

        /* LaptopFactory and Mobilefactory Maintaining is tedious
        HP hp = (HP) LaptopFactory.getLaptop(LaptopType.HP);
        hp.getDetails();

        Dell dell = (Dell) LaptopFactory.getLaptop(LaptopType.DELL);
        dell.getDetails();

        Mi mi = (Mi) MobileFactory.getMobile(MobileType.MI);
        mi.getDetails();

        Iphone iphone = (Iphone) MobileFactory.getMobile(MobileType.IOS);
        iphone.getDetails();*/

        LaptopFactory laptopFactory = (LaptopFactory) Factory.getfactory(FactoryType.LAPTOP);
        MobileFactory mobileFactory = (MobileFactory) Factory.getfactory(FactoryType.MOBILE);

        HP hp = (HP) laptopFactory.getLaptop(LaptopType.HP);
        hp.getDetails();

        MAC mac = (MAC) laptopFactory.getLaptop(LaptopType.MAC);
        mac.getDetails();

        Dell dell = (Dell) laptopFactory.getLaptop(LaptopType.DELL);
        dell.getDetails();

        Mi mi = (Mi) mobileFactory.getMobile(MobileType.MI);
        mi.getDetails();

        Iphone iphone = (Iphone) ((MobileFactory) Factory.getfactory(FactoryType.MOBILE)).getMobile(MobileType.IOS);
        iphone.getDetails();

        Samsung samsung = (Samsung) ((MobileFactory) Factory.getfactory(FactoryType.MOBILE)).getMobile(MobileType.SAMSUNG);
        samsung.getDetails();

    }
}
