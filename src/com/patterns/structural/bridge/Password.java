package com.patterns.structural.bridge;

public class Password implements Locker{

    @Override
    public void lock() {
        System.out.println("Locked using Password...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocked Using Password...");
    }
}
