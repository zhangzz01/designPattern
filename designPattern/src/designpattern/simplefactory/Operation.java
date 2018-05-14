/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operation
 * @Description：运算方法抽象类
 * @Author: ZZZ
 */

public abstract class Operation {
    public double numberA;
    public double numberB;

    /**
     * @description
     * @author zhengzheng.zhang@hand-china.com
     * @param
     * @return double
     */
    public abstract double getResult() throws Exception;
}

