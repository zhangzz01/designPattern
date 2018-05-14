/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.strategy;

/**
 * @Title CashContext
 * @Description：
 * @Author: ZZZ
 */

public class CashContext {
    private CashStrategy cashStrategy = null;
//
//    public CashContext(CashStrategy cashStrategy) {
//        this.cashStrategy = cashStrategy;
//    }
//    CashDto cd=null;

    public  CashContext(CashDto dto) {
        String type = dto.getType();
        switch (type) {
            case "normal":
                CashNormal cashNormal = new CashNormal(dto);
                cashStrategy=cashNormal;
                break;
            case "return":
                CashReturn cashReturn = new CashReturn(dto);
                cashStrategy=cashReturn;

                break;
            case "rebate":
                CashRebate cashRebate = new CashRebate(dto);
                cashStrategy=cashRebate;
                break;
            default:
                System.out.println("default");
        }
//        return cashStrategy.CashInterface(dto);
    }
    public double getResult(CashDto dto){
        return cashStrategy.CashInterface(dto);
    }
}
