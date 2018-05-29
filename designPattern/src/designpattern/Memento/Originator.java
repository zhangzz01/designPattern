/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Memento;

/**
 * @Title Originator
 * @Description：发起人
 * @Author: ZZZ
 */

public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void recoverMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public void show() {
        System.out.println("state = " + this.state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
