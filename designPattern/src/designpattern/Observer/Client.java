/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Observer;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        ConcreteSubject c =new ConcreteSubject();
        c.attach(new ConcreteObserver(c,"X"));
        c.attach(new ConcreteObserver(c,"Y"));
        ConcreteObserver o= new ConcreteObserver(c,"Z");
        c.attach(o);
        c.setSubjectState("ABC");
        c.notifyObserver();
        c.detach(o);
        c.setSubjectState("ASD");
        c.notifyObserver();
    }

}
