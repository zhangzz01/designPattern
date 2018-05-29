/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.strategy;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void main(String[] args) {
        CashDto dto=new CashDto();
        dto.setType("return");
        dto.setTotalMoney(1000);
        dto.setFullMoney(100);
        dto.setReturnMoney(10);
        dto.setRebate(0.8);
        CashContext cc = new CashContext(dto);
        double money =cc.getResult(dto);
        System.out.println(money);


    }
}
