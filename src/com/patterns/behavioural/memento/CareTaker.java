package com.patterns.behavioural.memento;

public interface CareTaker {
    void addMemento(Memento m);
    Memento getMemento(int idx);
    Memento undo();
    Memento redo();
}
