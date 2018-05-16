/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.factorymethod;

import designpattern.simplefactory.*;

/**
 * @Title IFactory
 * @Description：工厂接口
 * @Author: ZZZ
 */

public interface IFactory {
    public Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
