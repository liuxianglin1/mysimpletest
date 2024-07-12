package com.company;

import com.company.enums.BpmBusinessTypeEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        System.out.println(BpmBusinessTypeEnum.PAYMENT_BY_THE_OWNER.name());
        LocalDate date1 = LocalDate.of(2024, 6, 17);
        LocalDate date2 = LocalDate.of(2025, 7, 25);

        System.out.println(date1.getMonth() ==  date2.getMonth());
    }



}
