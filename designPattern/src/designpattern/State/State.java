/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.State;

/**
 * @Title State
 * @Description：
 * @Author: ZZZ
 */

public abstract class State {
    public   abstract  void Handle(Context context);
}

class ConcreteStateA extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("现在是在状态A");
        context.setState(new ConcreteStateB());
    }

}

class ConcreteStateB extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("现在是在状态B");
        context.setState(new ConcreteStateC());

    }

}

class ConcreteStateC extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("现在是在状态C");
        context.setState(new ConcreteStateA());

    }

}
