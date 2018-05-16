/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.decorator;

/**
 * @Title Decorator
 * @Description：Decorator，装饰抽象类，继承了Component，从外类来扩展Component类的功能，
 *                但对于Component来说，是无需知道Decorator的存在的
 * @Author: ZZZ
 */

public class Decorator extends Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}

class ConcreteDecoratorA extends Decorator {


    @Override
    public void operation() {
        // 首先运行原Component的operation()，再执行ConcreteDecoratorA的功能，相当于对原Component进行了装饰
        super.operation();
        System.out.println("具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象B的操作");
    }
}

class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象C的操作");
    }

}
