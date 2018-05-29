/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Composite;

/**
 * @Title Leaf
 * @Description：
 * @Author: ZZZ
 */

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        // 通过“-”的数目显示级别
        System.out.println(Composite.repeatableString("-", depth) + this.name);
    }
}
