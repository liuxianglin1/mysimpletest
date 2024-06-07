package com.company.enums;

/**
 * @author liuxianglin
 * @datetime 2024/6/5
 * @description
 */
public enum  BpmBusinessTypeEnum {
    CONTRACT("个人合同"),
    CONTRACT_CHECKOUT("退租"),
    COMPANY_CONTRACT("企业合同"),
    COMPANY_RENEWAL("企业子合同续租"),
    COMPANY_CONTRACT_CHECKOUT("企业子退租"),
    COMPANY_CONTRACT_BATCH_CHECKOUT("企业批量退租"),
    RENT_ORDER("账单审批"),
    COUPON("优惠券审批"),
    OWNER_CONTRACT("业主合同"),
    BALANCE_WITHDRAWAL("余额提现"),
    PERSONAL_WALLET_WITHDRAWAL("个人钱包提现"),
    COMPANY_WALLET_WITHDRAWAL("企业钱包提现"),
    PAYMENT_BY_THE_OWNER("业主账单打款"),
    HOUSE_OWNER_RENTING_OUT("业主退租"),
    HOUSE_OWNER_RENEWAL("业主合同续租"),
    CHANGE_CONTRACT_ROOM("租赁换租");

    private final String desc;

    private BpmBusinessTypeEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
