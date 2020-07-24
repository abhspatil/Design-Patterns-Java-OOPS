package com.patterns.creational.factory;

public class WebFactory {

    public WebFactory(){};

    public static Object getWeb(WebType webType){

        switch (webType){

            case BLOG:
                return new Blog();
            case  ECOMMRCE:
                return new Ecommerce();
            default:
                return null;
        }
    }
}
