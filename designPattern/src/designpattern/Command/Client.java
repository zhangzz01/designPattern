/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        List<Reciever> recievers = new ArrayList<Reciever>();

        recievers.add(new RecieverA());
        recievers.add(new RecieverB());
        recievers.add(new RecieverC());

        Command command = new ConcreteCommand(recievers);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
