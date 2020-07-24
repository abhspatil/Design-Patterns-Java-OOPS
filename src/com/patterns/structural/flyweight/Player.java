package com.patterns.structural.flyweight;

public interface Player {
    public void shoot();
    public void reload();
    public void addGun(Gun gun);
    public void swithGun();
    public void details();
}
