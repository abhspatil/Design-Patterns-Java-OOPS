package com.patterns.behavioural.visitor;

public interface ShoppingcartVisitor {
    double visit(Computer computer);
    double visit(Fruit fruit);
}
