/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Iterator;

/**
 * @Title Iterator
 * @Description：
 * @Author: ZZZ
 */

public interface  Iterator<T> {
    public T first();

    public T next();

    public boolean isDone();

    public T currentItem();
}
