package com.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PlayerImpl implements Player {

    private List<Gun> guns = null;
    private String id;

    private int shootcnt=0;
    private int reloadcnt=0;

    public PlayerImpl(String id){
        this.id=id;
        this.guns = new ArrayList<>();
    }

    public void setId(String id){
        this.id=id;
    }

    @Override
    public void shoot() {
        System.out.println("Shot with gun : "+this.guns.get(0).getName());
        this.shootcnt++;
    }

    @Override
    public void reload() {
        System.out.println("Reloading Gun : "+this.guns.get(0).getName());
        this.reloadcnt++;
    }

    @Override
    public void addGun(Gun gun) {
        this.guns.add(gun);
    }

    @Override
    public void swithGun() {
        if(this.guns.size() ==0){
            System.out.println("You don't Have guns");
            return;
        }else if(this.guns.size() ==1){
            System.out.println("You have only one Gun");
        }

        Gun gun = this.guns.get(0);
        this.guns.remove(0);
        this.guns.add(gun);
        System.out.println("Gun Switched From "+gun.getName()+ " To "+ this.guns.get(0).getName());
        System.out.println("\t Gun Details : " +this.guns.get(0));

    }

    @Override
    public void details() {
        System.out.println("Player Id : "+this.id+", Gunt Count : "+this.guns.size()+", shot count : "+this.shootcnt+
                ", reload count : "+this.reloadcnt);
        System.out.println("Gun Details : ");
        for(Gun gun:this.guns){
            System.out.println(gun);
        }
    }
}
