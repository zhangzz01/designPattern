/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Bridge;

/**
 * @Title Implementor
 * @Description：
 * @Author: ZZZ
 */

public abstract class Implementor {
    public abstract void operation();

}

class ConcreteImplemtorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorA的方法执行");

    }

}

class ConcreteImplemtorB extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorB的方法执行");

    }

}

