/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.AbstractFactory;

import designpattern.simplefactory.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title OperationFactory
 * @Description：
 * @Author: ZZZ
 */

public class OperationFactory {
    private static Map<String, Class<?>> allOperationMaps = new HashMap<String, Class<?>>();

    public static void fillMap() {
        allOperationMaps.put("+", OperationAdd.class);
        allOperationMaps.put("-", OperationSub.class);
        allOperationMaps.put("*", OperationMul.class);
        allOperationMaps.put("/", OperationDiv.class);
    }

    public static Operation createOperation(String operator)
            throws InstantiationException, IllegalAccessException {
        Operation operation;

        fillMap();
        Class<?> operationClass = allOperationMaps.get(operator);

        if (operationClass == null) {
            throw new RuntimeException("unsupported operation");
        }

        operation = (Operation) operationClass.newInstance();

        return operation;
    }
}
