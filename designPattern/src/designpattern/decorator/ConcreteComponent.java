/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.decorator;

/**
 * @Title ConcreteComponent
 * @Description：ConcreteComponent是定义一个具体的对象，也可以给这个对象添加一些职责
 * @Author: ZZZ
 */

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("---具体操作----START---");
    }
}
