/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.decorator;

/**
 * @Title DecoratorClient
 * @Description：装饰模式客户端调用代码，装饰的过程更像是层层包装，用前面的对象装饰后面的对象
 * @Author: ZZZ
 */

public class Client {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.operation();

    }
}
