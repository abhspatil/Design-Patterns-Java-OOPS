package com.patterns.behavioural.memento;

public class Client {
    public static void main(String[] args) {

        OriginatorImpl originator = new OriginatorImpl();
        CareTaker careTaker = new CareTakerImpl();

        originator.setData("State 1");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setData("State 2");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.setData("State 3");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setData("State 4");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);


    }

    public static void printState(OriginatorImpl o){
        System.out.println("Current State : "+ o.getData());
    }
}
