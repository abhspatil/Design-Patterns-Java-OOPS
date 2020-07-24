package com.patterns.structural.bridge;

public class FingerPrint implements Locker{
    @Override
    public void lock() {
        System.out.println("Locked using FingerPrint...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocked Using FingerPrint...");
    }
}
