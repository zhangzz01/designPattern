/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.TemplateMethod;

/**
 * @Title ConcreteClassB
 * @Description：
 * @Author: ZZZ
 */

public class ConcreteClassB extends AbstractTemplate {
    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClassB---------primitiveOperation1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClassB---------primitiveOperation2");
    }
}
