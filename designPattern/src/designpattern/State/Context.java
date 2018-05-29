/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.State;

/**
 * @Title Context
 * @Description：
 * @Author: ZZZ
 */

public class Context {
    private  State state;


    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        this.state.Handle(this);
    }
}
