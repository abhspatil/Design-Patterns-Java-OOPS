package com.patterns.behavioural.memento;

public class OriginatorImpl implements Originator{

    String data;

    public OriginatorImpl() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void restore(Memento m) {
        this.data=m.getState();
    }

    @Override
    public Memento save() {
        return new MementoImpl(this.data);
    }
}
