package com.patterns.behavioural.memento;

public interface Originator {
    void restore(Memento m);
    Memento save();
}
