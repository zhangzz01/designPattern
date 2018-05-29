/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Memento;

/**
 * @Title Memento
 * @Description：备忘录
 * @Author: ZZZ
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
