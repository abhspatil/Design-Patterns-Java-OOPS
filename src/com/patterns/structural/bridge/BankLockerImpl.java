package com.patterns.structural.bridge;

public class BankLockerImpl extends BankLocker{

    Locker locker;

    public BankLockerImpl(Locker locker) {
        super(locker);
        this.locker=locker;
    }

    @Override
    public void lock() {
        System.out.print("Locking Please Wait : ");
        locker.lock();
    }

    @Override
    public void unlock() {
        System.out.print("Unlocking Locker Please wait : ");
        locker.unlock();
    }
}
