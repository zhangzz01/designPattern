/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.AbstractFactory;

import designpattern.simplefactory.Operation;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) throws Exception {

        Operation operation = OperationFactory.createOperation("+");

        operation.numberA = 7;
        operation.numberB = 8;

        System.out.println(operation.getResult());
    }
}
