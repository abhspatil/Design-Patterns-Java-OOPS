package com.patterns.structural.bridge;

public class FaceLock implements Locker{

    @Override
    public void lock() {
        System.out.println("Locked using FaceLock...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocked Uisng FaceLock...");
    }
}
