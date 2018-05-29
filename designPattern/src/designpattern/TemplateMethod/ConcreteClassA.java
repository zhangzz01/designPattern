/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.TemplateMethod;

/**
 * @Title ConcreteClassA
 * @Description：
 * @Author: ZZZ
 */

public class ConcreteClassA extends AbstractTemplate {
    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClassA---------primitiveOperation1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClassA---------primitiveOperation2");
    }
}
