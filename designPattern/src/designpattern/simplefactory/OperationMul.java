/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationMul
 * @Description：乘法
 * @Author: ZZZ
 */

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
