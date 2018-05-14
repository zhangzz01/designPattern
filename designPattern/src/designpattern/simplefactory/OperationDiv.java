/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operationDiv
 * @Description：除法
 * @Author: ZZZ
 * @Date: 2018/5/14 11:40
 */

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (numberB == 0) {
            throw new RuntimeException("除数不可为0");
        }
        return numberA / numberB;
    }
}
