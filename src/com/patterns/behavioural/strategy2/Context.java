package com.patterns.behavioural.strategy2;

public class Context {

    Strategy strategy;

    public Context(Strategy s){
        this.strategy=s;
    }

    public void setStrategy(Strategy s){
        this.strategy=s;
    }

    public String execute(){
        return this.strategy.execute();
    }
}


