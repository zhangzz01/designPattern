/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.TemplateMethod;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate;
        abstractTemplate = new ConcreteClassA();
        abstractTemplate.templateMethod();
        abstractTemplate=new ConcreteClassB();
        abstractTemplate.templateMethod();

    }
}
