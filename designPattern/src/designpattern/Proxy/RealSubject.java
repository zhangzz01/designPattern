/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Proxy;

/**
 * @Title RealSubject
 * @Description：真实实体类
 * @Author: ZZZ
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实对象的请求");
    }
}
