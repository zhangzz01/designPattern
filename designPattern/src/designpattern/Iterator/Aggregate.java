/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Iterator;

/**
 * @Title Aggregate
 * @Description：
 * @Author: ZZZ
 */

public interface Aggregate<T> {
    public Iterator<T> createIterator();
}
