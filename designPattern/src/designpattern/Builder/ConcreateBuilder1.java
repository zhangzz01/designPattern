/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

/**
 * @Title ConcreateBuilder1
 * @Description：
 * @Author: ZZZ
 */

public class ConcreateBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}
