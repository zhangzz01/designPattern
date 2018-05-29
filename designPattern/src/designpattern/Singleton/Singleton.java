/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Singleton;

/**
 * @Title Singleton
 * @Description：
 * @Author: ZZZ
 */

public class Singleton {
    // 懒汉式
    // private static Singleton instance;
    // 饿汉式
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        // 懒汉式
        // if (instance == null) {
        // instance = new Singleton();
        // }
        return instance;
    }
}
