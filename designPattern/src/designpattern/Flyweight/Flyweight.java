/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Flyweight;

/**
 * @Title Flyweight
 * @Description：
 * @Author: ZZZ
 */

public abstract class Flyweight {
    public abstract void operation(int extrinsicState);

}

class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体FlyWeight：" + extrinsicState);
    }

}

class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体FlyWeight：" + extrinsicState);
    }

}
