package com.patterns.creational.Builder;

public class Phone {

    String name,brand,os,ram,rom,processor;

    public Phone(String name, String brand, String os, String ram, String rom, String processor) {
        this.name = name;
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.rom = rom;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
