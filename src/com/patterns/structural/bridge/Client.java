package com.patterns.structural.bridge;

public class Client {

    public static void main(String[] args) {

        BankLocker bankLocker = new BankLockerImpl(new Password());
        bankLocker.lock();
        bankLocker.unlock();

        System.out.println("*************************************************");

        bankLocker = new BankLockerImpl(new FaceLock());
        bankLocker.lock();
        bankLocker.unlock();

        System.out.println("*************************************************");

        bankLocker = new BankLockerImpl(new FingerPrint());
        bankLocker.lock();
        bankLocker.unlock();
    }
}
