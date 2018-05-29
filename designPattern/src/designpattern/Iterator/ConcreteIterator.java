/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Iterator;

/**
 * @Objectitle ConcreteIterator
 * @Description：
 * @Author: ZZZ
 */

public class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteAggregate<T> concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {
        this.setConcreteAggregate(concreteAggregate);
    }

    @Override
    public T first() {
        return concreteAggregate.getItems(0);
    }

    @Override
    public T next() {
        current++;

        if (current < concreteAggregate.count()) {
            return concreteAggregate.getItems(current);
        }

        return null;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count() ? true : false;
    }

    @Override
    public T currentItem() {
        return concreteAggregate.getItems(current);
    }

    public ConcreteAggregate<T> getConcreteAggregate() {
        return concreteAggregate;
    }

    public void setConcreteAggregate(ConcreteAggregate<T> concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
