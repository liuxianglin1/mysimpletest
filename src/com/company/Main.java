package com.company;

import com.company.test.Code;
import com.company.test.Test1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //价税合计 fen
        Integer priceAndTaxCent = 300;
        //税率
        double taxRate = 0.03;
        double taxCentD = priceAndTaxCent / (1 + taxRate) * taxRate;
        Integer taxCent = new BigDecimal(taxCentD).setScale(1, RoundingMode.HALF_UP).intValue();
        double a = 0.04;
        double b = 0.03;
        double c = a - b;
        double diff = 1e-6f;
        System.out.println(c);
        System.out.println(c < diff);
        System.out.println(c < a);
        System.out.println(c < b);
    }


    /**
     * 获取传入时间的结束时间
     * @param date
     * @return date
     */
    public static Date getEndTimeOfCurrentTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 获取传入时间的第31天前的开始时间
     * @param date
     * @return date
     */
    public static Date getStartTimeOfFirstThirtyOneDaysOfCurrentTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -31);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
