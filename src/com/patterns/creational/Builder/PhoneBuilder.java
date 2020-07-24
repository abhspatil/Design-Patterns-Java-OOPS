package com.patterns.creational.Builder;

public class PhoneBuilder {
    String name,brand,os,ram,rom,processor;

    //Default Parameters
    public PhoneBuilder(){
        this.processor= "Snapdragon";
        this.ram="4 GB";
        this.rom="64 GB";
        this.os="Android";
    }
    public PhoneBuilder setName(String name){
        this.name=name;
        return this;
    }

    public PhoneBuilder setBrand(String brand){
        this.brand=brand;
        return this;
    }

    public PhoneBuilder setOs(String os){
        this.os=os;
        return this;
    }

    public PhoneBuilder setRam(String ram){
        this.ram=ram;
        return this;
    }

    public PhoneBuilder setRom(String rom) {
        this.rom=rom;
        return this;
    }

    public PhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name,brand,os,ram,rom,processor);
    }
}
