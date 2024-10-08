package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        String input = "91340100MA2RLAL27R2024069";
        // 获取从第一位到倒数第8位的子字符串
        String result = input.substring(0, input.length() - 7);

        String result1 = input.substring(input.length() - 7, input.length() - 1);
        System.out.println(result);
        System.out.println(result1);
    }

    /**
     * 在给定的时间字符串中的连字符前后添加换行符。
     *
     * @param time 时间字符串，例如 "7:30-19:00"
     * @return 添加了换行符后的时间字符串
     */
    public static String addNewlinesAroundDash(String time) {
        // 确保输入不为空或null
        if (time == null || time.isEmpty()) {
            return time;
        }

        // 使用正则表达式替换连字符为换行符包围的连字符
        return time.replaceAll("(\\-)", "\n$1\n");
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

    private void test03() throws InterruptedException {
        System.out.println(LocalDateTime.now());
        //\u000d\u0054\u0068\u0072\u0065\u0061\u0064\u002e\u0073\u006c\u0065\u0065\u0070\u0028\u0032\u0030\u0030\u0030\u0029\u003b
        System.out.println(LocalDateTime.now());
    }

    //(100-1)/100

    private static void testMath() {
        System.out.println(BigDecimal.valueOf(100).subtract(BigDecimal.valueOf(1)).longValue());
        System.out.println(BigDecimal.valueOf(100).subtract(BigDecimal.valueOf(1)).divide(BigDecimal.valueOf(100)));
        System.out.println(BigDecimal.valueOf(100).subtract(BigDecimal.valueOf(1)).divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(100)));


        String yearMonth = "2024-01";
        // 解析输入字符串为LocalDate
        LocalDate date = LocalDate.parse(yearMonth + "-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        date.getMonth();
    }



}
