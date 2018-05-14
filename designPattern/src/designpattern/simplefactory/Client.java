/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title test
 * @Description：
 * @Author: ZZZ
 * @Date: 2018/5/14 11:52
 */

public class Client {
    public static void main(String[] args) throws Exception {
        Operation oper = OperationFactory.createOperate('+');
        oper.numberA=1;
        oper.numberB=10;
        System.out.println(oper.getResult());
    }
}
