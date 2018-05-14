/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.strategy;

/**
 * @Title Strategy
 * @Description：
 * @Author: ZZZ
 */

public interface CashStrategy {
    /**
     * @param
     * @return void
     * @description
     * @author zhengzheng.zhang@hand-china.com
     */
    public double CashInterface(CashDto dto);
}

class CashNormal implements CashStrategy {

    private CashDto cashDto;
    public CashNormal(CashDto dto){
        this.cashDto=dto;
    }
    @Override
    public double CashInterface(CashDto dto) {
        System.out.println("实现正常收费");
        return dto.getTotalMoney();
    }
}

class CashReturn implements CashStrategy {
    private CashDto cashDto;
    public CashReturn(CashDto dto){
        this.cashDto=dto;
    }

    @Override
    public double CashInterface(CashDto dto) {
        System.out.println("实现满减收费");
        double money = dto.getTotalMoney()-(Math.floor(dto.getTotalMoney()/dto.getFullMoney())*dto.getReturnMoney());
        return money;
    }
}

class CashRebate implements CashStrategy {

    private CashDto cashDto;
    public CashRebate(CashDto dto){
        this.cashDto=dto;
    }
    @Override
    public double CashInterface(CashDto dto) {
        System.out.println("实现打折收费");
        return dto.getTotalMoney() * dto.getRebate();
    }
}