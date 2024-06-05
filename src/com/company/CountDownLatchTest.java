package com.company;

import java.math.BigDecimal;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("3.2");

        BigDecimal result = num1.subtract(num2);

        System.out.println("Subtraction result: " + result);
    }



}
