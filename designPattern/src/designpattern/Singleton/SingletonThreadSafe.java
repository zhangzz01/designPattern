/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Singleton;

/**
 * @Title SingletonThreadSafe
 * @Description：线程安全
 * @Author: ZZZ
 */

public class SingletonThreadSafe {
    private static  SingletonThreadSafe instance;

    private SingletonThreadSafe() {

    }
    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
