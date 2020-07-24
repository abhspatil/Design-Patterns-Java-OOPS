package com.patterns.structural.bridge;

public abstract class BankLocker {

    Locker locker;

    public BankLocker(Locker locker){
        this.locker = locker;
    }

    public abstract void lock();
    public abstract void unlock();
}