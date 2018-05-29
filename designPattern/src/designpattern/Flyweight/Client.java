/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Flyweight;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicState);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);

    }
}
