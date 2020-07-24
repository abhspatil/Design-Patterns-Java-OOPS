package com.patterns.structural.flyweight;

import java.util.List;

public class Gun {
    private String name;
    private String rating;

    public Gun(String name, String rating) {
        this.name = name;
        this.rating = rating;

        // Some DB operations
        for (long i=0;i<10000000l;i++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
