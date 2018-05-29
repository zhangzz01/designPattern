/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Bridge;

/**
 * @Title Abstraction
 * @Description：
 * @Author: ZZZ
 */

public abstract class Abstraction {
    protected Implementor implementor;// 桥接模式的关键，使得Abstraction聚合Implementor
    private String name;

    public Abstraction(String name) {
        this.setName(name);
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        System.out.print("Abstraction-" + this.getName() + ": ");
        implementor.operation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AbstractionA extends Abstraction {

    public AbstractionA(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }

}

class AbstractionB extends Abstraction {

    public AbstractionB(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }

}
