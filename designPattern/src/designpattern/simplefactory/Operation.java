/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.simplefactory;

/**
 * @Title operation
 * @Description：运算方法抽象类
 * @Author: ZZZ
 * @Date: 2018/5/14 11:30
 */

public abstract class Operation {
    public double numberA;
    public double numberB;

    /**
     * @description
     * @author zhengzheng.zhang@hand-china.com
     * @date 2018/5/14 : 11:34
     * @param
     * @return double
     */
    public abstract double getResult() throws Exception;
}

