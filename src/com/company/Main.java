package com.company;

import com.company.test.Code;
import com.company.test.Test1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String format = String.format("%03d", 0);
        System.out.println(format);
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
