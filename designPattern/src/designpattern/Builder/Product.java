/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title Project
 * @Description：产品，多个部件
 * @Author: ZZZ
 */

public class Product {

    List<String> parts = new ArrayList<String>();

    // 添加产品部件
    public void add(String part) {
        parts.add(part);
    }

    // 列举所有的产品部件
    public void show() {
        System.out.println("---产品----创建---");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
