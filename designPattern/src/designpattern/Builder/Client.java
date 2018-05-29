/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreateBuilder1();
        Builder builder2 = new ConcreateBuilder2();

        director.Construct(builder1);
        Product product1 = builder1.getBuildResult();
        product1.show();

        director.Construct(builder2);
        Product product2 = builder2.getBuildResult();
        product2.show();
    }
}
