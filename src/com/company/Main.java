package com.company;

import com.company.test.Code;
import com.company.test.Test1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        String msgBody = "  11  22  Å |Å|H₂O|10⁶|NaH₂PO₄|¥|•|・|￠|”|\"|/|㘵|䲞|m³?<>";
        String msgBody = "91340100670942291C";
        //	|
        //|
        //| |Å|H₂O|10⁶|NaH₂PO₄|¥|?|•|・|￠|”|"|/|㘵|䲞|m³
//        Pattern p1 = Pattern.compile("\t|\r|\n|Å|H₂O|10⁶|NaH₂PO₄|¥|•|・|￠|”|\"|/|㘵|䲞|m³|[./?？|\\s]"); // 去除所有换行
        Pattern p1 = Pattern.compile("^[A-Z0-9]{15}$|^[A-Z0-9]{17}$|^[A-Z0-9]{18}$|^[A-Z0-9]{20}$"); // 去除所有换行
//        Pattern p2 = Pattern.compile("?"); // 去除所有换行
        Matcher m1 = p1.matcher(msgBody);
        msgBody = m1.replaceAll("");
        System.out.println(msgBody);
//        boolean matches = Pattern.matches("^[A-Z0-9]{15}$|^[A-Z0-9]{17}$|^[A-Z0-9]{18}$|^[A-Z0-9]{20}$", "000000000000000");
        // 税号正则表达式
        boolean matches = Pattern.matches("[^_IOZSVa-z\\W]{2}\\d{6}[^_IOZSVa-z\\W]{10}", "91340100670942291C");
        System.out.println(matches);
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
