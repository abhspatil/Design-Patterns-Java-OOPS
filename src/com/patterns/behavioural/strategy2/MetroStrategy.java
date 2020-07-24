package com.patterns.behavioural.strategy2;

public class MetroStrategy implements Strategy{
    @Override
    public String execute() {
        return "Going By Metro";
    }
}
