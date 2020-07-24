package com.patterns.creational.factory;

public class Client {

    public static void main(String[] args) {

        Blog blog = (Blog) WebFactory.getWeb(WebType.BLOG);
        blog.subscribe();

        Ecommerce ecommerce = (Ecommerce) WebFactory.getWeb(WebType.ECOMMRCE);
        ecommerce.subscribe();

    }
}
