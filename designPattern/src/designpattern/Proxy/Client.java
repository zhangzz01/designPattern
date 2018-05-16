/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Proxy;

/**
 * @Title Client
 * @Description：客户端
 * @Author: ZZZ
 */

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
