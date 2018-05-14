/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationSub
 * @Description：减法
 * @Author: ZZZ
 */

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
