/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.interpreter;

/**
 * @Title AbstractExpression
 * @Description：声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 * @Author: ZZZ
 */

public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
/**
 * @author zhengzheng.zhang@hand-china.com
 * @description  实现与文法中的终结符相关联的解释操作，文法中每一个终结符都有一个具体终结表达式与之相对应
 * @version 1.0
 * @date 2018/5/28 : 23:14
 */
class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");

    }

}
/**
 * @author zhengzheng.zhang@hand-china.com
 * @description 非终结符表达式，为文法中的非终结符实现解释操作。对文法中每一条规则R1、R2 ... ... Rn都需要一个具体的非终结符表达式类。
 * @version 1.0
 * @date 2018/5/28 : 23:15
 */
class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }

}