/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationSub
 * @Description：减法
 * @Author: ZZZ
 * @Date: 2018/5/14 11:38
 */

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
