/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationAdd
 * @Description：加法
 * @Author: ZZZ
 * @Date: 2018/5/14 11:35
 */

public class OperationAdd extends Operation {

    @Override
    public double getResult() {

        return numberA + numberB;
    }
}
