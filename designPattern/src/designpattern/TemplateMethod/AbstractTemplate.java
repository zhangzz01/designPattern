/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.TemplateMethod;

/**
 * @Title AbstractTemplate
 * @Description：
 * @Author: ZZZ
 */

public abstract class AbstractTemplate {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
        System.out.println("模板方法----------START----");
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法----------END----");
    }



}
