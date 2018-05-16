/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.factorymethod;

import designpattern.simplefactory.Operation;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) throws Exception {
        IFactory operFactory = new DivFactory();
        Operation operation = operFactory.createOperation();
        operation.numberA = 100;
        operation.numberB = 25;
        System.out.println(operation.getResult());

    }
}
