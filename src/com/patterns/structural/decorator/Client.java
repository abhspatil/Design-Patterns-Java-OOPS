package com.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {

        BasicTV basicTV = new BasicTV();
        basicTV.assemble();
        System.out.println("------------------------*************************---------------------");

        //Color TV
        TV colorTv = new ColorTV(new BasicTV());
        colorTv.assemble();
        System.out.println("------------------------*************************---------------------");

        //HD and Color TV
        TV colorandhdTV = new HDTV(new ColorTV(new BasicTV()));
        colorandhdTV.assemble();
        System.out.println("------------------------*************************---------------------");

        //Full HD and Smart TV
        TV FullhdAndSmartTV = new FullHDTV(new SmartTV(new BasicTV()));
        FullhdAndSmartTV.assemble();
        System.out.println("------------------------*************************---------------------");

        //Full Hd and Color TV
        TV FullhdandColorTV = new FullHDTV(new ColorTV(new BasicTV()));
        FullhdandColorTV.assemble();
        System.out.println("------------------------*************************---------------------");

    }
}
