/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Proxy;

/**
 * @Title Proxy
 * @Description：代理类
 * @Author: ZZZ
 */

public class Proxy implements Subject{
    // 引用代理可以访问真实实体
    Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void request() {
        subject.request();
    }
}
