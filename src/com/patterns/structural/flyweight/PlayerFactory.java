package com.patterns.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String,Player> cache = new HashMap<>();

    public static Player getPlayer(String id){
        if(!cache.containsKey(id)){
            Gun gun=null;

            cache.put(id,new PlayerImpl(id));
        }

        return  cache.get(id);
    }
}
