package com.company;

import com.company.entity.Person;
import com.company.eventlistener.PersonPropertyListener;
import com.company.test.Code;
import com.company.test.MyEntity;
import com.company.test.Test1;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static String formatLocation(String location) {
        // 将字符串中的空格替换为&
        String formattedLocation = location.replace(" ", "&");
        // 在省和市之间以及市和区/县之间插入&
        formattedLocation = formattedLocation.replace("省", "省&").replace("市", "市&");
        return formattedLocation;
    }

    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
        Person p = new Person(65);
        //添加监听器
        p.addPropertyChangeListener(new PersonPropertyListener());
        p.setWeight(64);
        p.setWeight(65);
        p.setWeight(66);
    }


    public static Integer dealWithNumber(Integer a) {

        a++;
        System.out.println("dealWithNumber==========" + a);
        return a;
    }

    public static void dealWithMapA(Map<String, Long> mapA) {

        Long count = mapA.get("count");
        count++;
        mapA.put("count", count);
        System.out.println("dealWithMapA==========" + count);
    }


    public static boolean checkRegexPassword1(String password) {
//        String decode = new String(Base64.getDecoder().decode(password));
//        String regEx1 = "^(?![@$!%*?&^#()])(?![\\d]+$)(?![a-z]+$)(?![A-Z]+$)(?![\\W_]+$)[\\da-zA-z\\W_]{8,20}$";
//        Pattern p1 = Pattern.compile(regEx1);
//        Matcher m1 = p1.matcher(decode);
//        if (!m1.matches()) {
//            return false;
//        }
        return true;

    }


    public static String generateKey(Map<String, String> values) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(values.toString().getBytes("UTF-8"));
            return String.format("%032x", new BigInteger(1, bytes));
        } catch (NoSuchAlgorithmException nsae) {
            throw new IllegalStateException("MD5 algorithm not available.  Fatal (should be in the JDK).", nsae);
        } catch (UnsupportedEncodingException uee) {
            throw new IllegalStateException("UTF-8 encoding not available.  Fatal (should be in the JDK).", uee);
        }
    }


    public void test2222() {
        String s = "/+=";
        s = s.replaceAll("/", "_a").replaceAll("\\+", "_b").replaceAll("=", "_c");
        System.out.println(s);
        s = s.replaceAll("_a", "/").replaceAll("_b", "\\+").replaceAll("_c", "=");
        System.out.println(s);
        System.out.println(222);
    }


    public void test111() {
        System.out.println(new Date(4102286399L * 1000L));
        long i = 70 * 365 * 24 * 60 * 60L;
        System.out.println(i);
        String str = null;
        MyEntity myEntity = new MyEntity("张三", 1);
        System.out.println("91" + str + "111");
        System.out.println("91" + myEntity.toString() + "111");
    }

    public void stringPattern() throws UnsupportedEncodingException {
        //        String msgBody = "  11  22  ? |?|H?O|10?|NaH?PO?|?|?|?|?|?|\"|/|?|?|m??<>";
        String msgBody = "91340100670942291C";
        //	|
        //|
        //| |?|H?O|10?|NaH?PO?|?|?|?|?|?|?|"|/|?|?|m?
//        Pattern p1 = Pattern.compile("\t|\r|\n|?|H?O|10?|NaH?PO?|?|?|?|?|?|\"|/|?|?|m?|[./??|\\s]"); // ??????
        Pattern p1 = Pattern.compile("^[A-Z0-9]{15}$|^[A-Z0-9]{17}$|^[A-Z0-9]{18}$|^[A-Z0-9]{20}$"); // ??????
//        Pattern p2 = Pattern.compile("?"); // ??????
        Matcher m1 = p1.matcher(msgBody);
        msgBody = m1.replaceAll("");
        System.out.println(msgBody);
//        boolean matches = Pattern.matches("^[A-Z0-9]{15}$|^[A-Z0-9]{17}$|^[A-Z0-9]{18}$|^[A-Z0-9]{20}$", "000000000000000");
        // ???????  [^_IOZSVa-z\W]{2}\d{6}[^_IOZSVa-z\W]{10}
        boolean matches = Pattern.matches("[^_IOZSVa-z\\W]{2}\\d{6}[^_IOZSVa-z\\W]{10}", "91340100670942291C");
        System.out.println(matches);


        String s1 = "交通银行股份有限公司北京石景山支行?110060872018010003732";
        byte[] bytes = s1.getBytes("GBK");
        String gbk = new String(bytes, "GBK");

        String s2 = "交通银行股份有限公司北京石景山支行 110060872018010003732";
//        Pattern p2 = Pattern.compile(" "); // ??????
        Pattern p2 = Pattern.compile("U+00A0"); // ??????
        Matcher m2 = p2.matcher(s2);
        s2 = m2.replaceAll("");
        System.out.println(s2);

        String s3 = " ";
        byte[] bytes1 = s3.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes1);
    }


    /**
     * 获取传入时间的结束时间
     *
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
}


