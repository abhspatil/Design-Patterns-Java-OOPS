package com.patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTakerImpl implements CareTaker{

    List<Memento> branch ;
    int currState=-1;

    public CareTakerImpl(){
        branch = new ArrayList<>();
    }

    @Override
    public void addMemento(Memento m) {
        branch.add(m);
        currState = branch.size() -1;
    }

    @Override
    public Memento getMemento(int idx) {
        return branch.get(idx);
    }

    @Override
    public Memento undo() {
        System.out.println("Undoing State...");

        if(currState<=0){
            currState=0;
            return getMemento(currState);
        }
        currState--;
        return getMemento(currState);
    }

    @Override
    public Memento redo() {
        System.out.println("Redoing State...");

        if(currState>=branch.size()-1){
            currState=branch.size()-1;
            return getMemento(currState);
        }
        currState++;
        return getMemento(currState);
    }
}
