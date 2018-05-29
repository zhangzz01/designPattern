/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title Composite
 * @Description：
 * @Author: ZZZ
 */

public class Composite extends Component{
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        // 显示其枝节点名称，并对其下级进行遍历
//        new String("-",depth);
        System.out.println(repeatableString("-", depth) + this.name);

        for (Component component : children) {
            component.display(depth + 2);
        }

    }

    public static String repeatableString(String repeatStr, int repeatNum) {
        StringBuilder stringBuilder = new StringBuilder();

        while (repeatNum-- > 0) {
            stringBuilder.append(repeatStr);
        }

        return stringBuilder.toString();
    }
}
