/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Flyweight;

import java.util.HashMap;

/**
 * @Title FlyweightFactory
 * @Description：
 * @Author: ZZZ
 */

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight());
        }

        return flyweights.get(key);
    }
}
