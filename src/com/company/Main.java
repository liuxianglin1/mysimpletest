package com.company;

import com.company.test.Code;
import com.company.test.Test1;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

    }

    public void stringPattern() {
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
     * ????????31???????
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

    public static class Student {
        private String name;
        private Integer age;

        public Student() {}
        public Student(String name, Integer age)  {
            this.name = name;
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
        public Integer age() {
            return this.age;
        }

    }

    public void streamDistinct() {
        List<Student> students = new ArrayList<Student>() {{
            add(new Student("张三", 1));
            add(new Student("李四", 2));
            add(new Student("王五", 3));
            add(new Student("张三", 1));
            add(new Student("李四", 3));
            add(new Student("王五1", 3));
        }};
    }
}
