/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) throws Exception {
        Operation oper = OperationFactory.createOperate('+');
        oper.numberA=1;
        oper.numberB=10;
        System.out.println(oper.getResult());
    }
}
