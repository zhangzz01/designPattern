/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

/**
 * @Title Director
 * @Description：指挥者，指挥建造
 * @Author: ZZZ
 */

public class Director {
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
