/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationMul
 * @Description：乘法
 * @Author: ZZZ
 * @Date: 2018/5/14 11:39
 */

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
