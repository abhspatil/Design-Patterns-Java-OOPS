package com.patterns.behavioural.strategy;

public class StratagyContext {
    private int a,b;
    private Operation operation;

    public StratagyContext(){}

    public StratagyContext(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void setAB(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void setOperation(){
        this.operation=operation;
    }

    public void execute(Operation operation){
        operation.execute(a,b);
    }

    public void execute(){
        if(this.operation !=null){
            this.operation.execute(a,b);
        }
    }
}
