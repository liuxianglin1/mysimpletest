package com.company;

import com.company.enums.BpmBusinessTypeEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(LocalDateTime.now());
        //\u000d\u0054\u0068\u0072\u0065\u0061\u0064\u002e\u0073\u006c\u0065\u0065\u0070\u0028\u0032\u0030\u0030\u0030\u0029\u003b
        System.out.println(LocalDateTime.now());
    }

    private void test01() {
        // 金额 + 税额
        double priceAndTax = 3960;
        //税额
        double taxRate = 0.09;
        double tax = priceAndTax / (1 + taxRate) * taxRate;
        System.out.println("税额tax ==========" + tax);
        double tax1 = BigDecimal.valueOf(tax).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("税额tax1 ==========" + tax1);
        // 金额
        double price = priceAndTax -tax1;
        System.out.println("金额price ==========" + price);
    }

    private void test02() {
        // 金额 + 税额
        BigDecimal priceAndTax = new BigDecimal("3960");
        //税额
        BigDecimal taxRate = new BigDecimal("0.09");
        BigDecimal tax1 = priceAndTax.multiply(taxRate).divide(taxRate.add(new BigDecimal("1")), 2, RoundingMode.HALF_UP);
        System.out.println("税额tax1 ==========" + tax1);
        // 金额
        BigDecimal price = priceAndTax.subtract(tax1);
        System.out.println("金额price ==========" + price);
    }



}
