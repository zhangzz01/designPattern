/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Adapter;

/**
 * @Title Adapter
 * @Description：
 * @Author: ZZZ
 */

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {

        adaptee.specificRequest();
    }
}
