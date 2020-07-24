package com.patterns.structural.flyweight;

import java.util.HashMap;

public class GunFactory {
    private static HashMap<GunTypes,Gun> cache = new HashMap<>();

    public static Gun getGun(GunTypes types){
        if(!cache.containsKey(types)){
            Gun gun=null;

            switch (types){
                case AK47:
                    gun=new Gun("AK47","4.3");
                    break;
                case AKM:
                    gun = new Gun("AKM","3.9");
                    break;
                case CAR98:
                    gun = new Gun("CAR98","4.9");
                    break;
                case VECTOR:
                    gun = new Gun("Vector","4.4");
                    break;
                default:
                    System.out.println("Gun Not Found");
            }
            cache.put(types,gun);
        }

        return  cache.get(types);
    }
}
