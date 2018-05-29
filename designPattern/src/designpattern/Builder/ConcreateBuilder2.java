/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

/**
 * @Title ConcreateBuilder2
 * @Description：
 * @Author: ZZZ
 */

public class ConcreateBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件C");
    }

    @Override
    public void buildPartB() {
        product.add("部件D");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}
