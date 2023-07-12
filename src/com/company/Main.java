package com.company;

import com.company.test.Code;
import com.company.test.MyEntity;
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
        String s = "PFJFU1BPTlNFX0NPTU1PTl9GUEtKIGNsYXNzPSJSRVNQT05TRV9DT01NT05fRlBLSiI+DQoJPERESD4xNjM3OTAxMTU5NjMyNjcxPC9EREg+DQoJPEZQUVFMU0g+MjAyMTExMjYxMTM3NDI4NTgxNDI8L0ZQUVFMU0g+DQoJPEpRQkg+NjYxMTAyNTc2NjA3PC9KUUJIPg0KCTxGUF9ETT4wMzQxNTIxMDAxMTE8L0ZQX0RNPg0KCTxGUF9ITT4wNDI3MzcxNzwvRlBfSE0+DQoJPEtQUlE+MjAyMTExMjYxMjMzNTg8L0tQUlE+DQoJPEZQX01XPjgrNzk5Njc3NjkmbHQ7Jmd0OzQ1LSo2NCZndDs4KzQ1ODU0MyZndDszMjU4Jmd0OzgrLS8rMDkrLzMxOTIvNzgzLTEqKyZsdDsrLzI3NjQqLTM3MDk5Jmx0OzI0NSZndDsvNDUvKisqMzg3MC0qMS81OCZndDs4Ky0vKzA5Ky8zMTkyLSZsdDs4NzwvRlBfTVc+DQoJPEpZTT42OTc0NjE3Njk5MTkxODQwODQ1MTwvSllNPg0KCTxFV00+UWszQ0F3QUFBQUFBQUQ0QUFBQW9BQUFBU3dBQUFFc0FBQUFCQUFFQUFBQUFBSVFEQUFBQUFBQUFBQUFBQUFBQUFBQUNBQUFBQUFBQS8vLy8vLy8vLy8vLy8vLy8vLy9nQUFBQUF6Lzg4elB3TS84Z0FBQUFBei84OHpQd00vOGdBQUEvOC9NUEREejh6L0FnQUFBLzgvTVBERHo4ei9BZ0FBQXdNL0F3QUR3dy96OGdBQUF3TS9Bd0FEd3cvejhnQUFBd016OFBNL3d6OFBNZ0FBQXdNejhQTS93ejhQTWdBQUF3TXpEQS84UDhBQXpnQUFBd016REEvOFA4QUF6Z0FBQS84dzhEdy9QUFB6OGdBQUEvOHc4RHcvUFBQejhnQUFBQUF3TUEvQUFETXdBZ0FBQUFBd01BL0FBRE13QWdBQUQvL3cvOFBQOHdQelBnQUFELy93LzhQUDh3UHpQZ0FBREFNUHpETS96QUFEQWdBQURBTVB6RE0vekFBREFnQUFETXpNL00vekR6QUREZ0FBRE16TS9NL3pEekFERGdBQUQ4QVAvL01BL0F3dzhnQUFEOEFQLy9NQS9Bd3c4Z0FBRFAvd016UEEvOHpBemdBQURQL3dNelBBLzh6QXpnQUFEUEFQd0FBTXd3dy84Z0FBRFBBUHdBQU13d3cvOGdBQUQvek0vTURBTXpNL0RnQUFEL3pNL01EQU16TS9EZ0FBRDhNQXd3dy9BOEF6d2dBQUQ4TUF3d3cvQThBendnQUFEUER6RDhQQUF3RHpEZ0FBRFBEekQ4UEFBd0R6RGdBQUFEdy9Qd3d6UC84ejhnQUFBRHcvUHd3elAvOHo4Z0FBQU1QQS8vOC9QUHd6OGdBQUFNUEEvLzgvUFB3ejhnQUFBQUF3UE04endBQU1BZ0FBQUFBd1BNOHp3QUFNQWdBQUF6RC96L0F6endQOFBnQUFBekQvei9Benp3UDhQZ0FBRFBBUERBRHd3QUFQRGdBQURQQVBEQUR3d0FBUERnQUFEd3p3ek13RHp6QXpBZ0FBRHd6d3pNd0R6ekF6QWdBQURBd01Qd0RBUEFQd01nQUFEQXdNUHdEQVBBUHdNZ0FBRE1EUFA4enpBTXpBRGdBQURNRFBQOHp6QU16QURnQUFBQU04QS9NRER3dy93Z0FBQUFNOEEvTUREd3cvd2dBQUFERHdNQXcvenp3ek1nQUFBRER3TUF3L3p6d3pNZ0FBQU04UEFQdzh6dzhEQWdBQUFNOFBBUHc4enc4REFnQUFBTS8vRFAvekE4RHdQZ0FBQU0vL0RQL3pBOER3UGdBQUE4QURETU13Lzh6ekFnQUFBOEFERE1Ndy84enpBZ0FBRC8vL01QL013RC8vL2dBQUQvLy9NUC9Nd0QvLy9nQUFBQUF6TXpNek16TUFBZ0FBQUFBek16TXpNek1BQWdBQUEvOC93QXc4ei9NLzhnQUFBLzgvd0F3OHovTS84Z0FBQXdNd0RQekRNUDh3TWdBQUF3TXdEUHpETVA4d01nQUFBd004d01BTVBEOHdNZ0FBQXdNOHdNQU1QRDh3TWdBQUF3TXp3L013d0FNd01nQUFBd016dy9Nd3dBTXdNZ0FBQS84d0Q4QXdNRDgvOGdBQUEvOHdEOEF3TUQ4LzhnQUFBQUF6L3pBTUFQTUFBZ0FBQUFBei96QU1BUE1BQWdBQUE9PC9FV00+DQoJPFBERl9VUkw+aHR0cDovL2ZpbGVzLmFoZHpmcC5jb206OTAwMC9maWxlc091dC9mZGZzLzUwMmJiNDZlNmQ3MTRhMGY5OTFjNjEyZjM2MDZlNTQ1PC9QREZfVVJMPg0KPC9SRVNQT05TRV9DT01NT05fRlBLSj4=";
        s = s.replaceAll("_a", "/").replaceAll("_b", "\\+").replaceAll("_c", "=");
        System.out.println(s);
        String s1 = new String(Base64.getDecoder().decode(s));
        System.out.println(s1);


        /**
         PFJFU1BPTlNFX0NPTU1PTl9GUEtKIGNsYXNzPSJSRVNQT05TRV9DT01NT05fRlBLSiI+DQoJPERESD4xNjM3OTAxMTU5NjMyNjcxPC9EREg+DQoJPEZQUVFMU0g+MjAyMTExMjYxMTM3NDI4NTgxNDI8L0ZQUVFMU0g+DQoJPEpRQkg+NjYxMTAyNTc2NjA3PC9KUUJIPg0KCTxGUF9ETT4wMzQxNTIxMDAxMTE8L0ZQX0RNPg0KCTxGUF9ITT4wNDI3MzcxNzwvRlBfSE0+DQoJPEtQUlE+MjAyMTExMjYxMjMzNTg8L0tQUlE+DQoJPEZQX01XPjgrNzk5Njc3NjkmbHQ7Jmd0OzQ1LSo2NCZndDs4KzQ1ODU0MyZndDszMjU4Jmd0OzgrLS8rMDkrLzMxOTIvNzgzLTEqKyZsdDsrLzI3NjQqLTM3MDk5Jmx0OzI0NSZndDsvNDUvKisqMzg3MC0qMS81OCZndDs4Ky0vKzA5Ky8zMTkyLSZsdDs4NzwvRlBfTVc+DQoJPEpZTT42OTc0NjE3Njk5MTkxODQwODQ1MTwvSllNPg0KCTxFV00+UWszQ0F3QUFBQUFBQUQ0QUFBQW9BQUFBU3dBQUFFc0FBQUFCQUFFQUFBQUFBSVFEQUFBQUFBQUFBQUFBQUFBQUFBQUNBQUFBQUFBQS8vLy8vLy8vLy8vLy8vLy8vLy9nQUFBQUF6Lzg4elB3TS84Z0FBQUFBei84OHpQd00vOGdBQUEvOC9NUEREejh6L0FnQUFBLzgvTVBERHo4ei9BZ0FBQXdNL0F3QUR3dy96OGdBQUF3TS9Bd0FEd3cvejhnQUFBd016OFBNL3d6OFBNZ0FBQXdNejhQTS93ejhQTWdBQUF3TXpEQS84UDhBQXpnQUFBd016REEvOFA4QUF6Z0FBQS84dzhEdy9QUFB6OGdBQUEvOHc4RHcvUFBQejhnQUFBQUF3TUEvQUFETXdBZ0FBQUFBd01BL0FBRE13QWdBQUQvL3cvOFBQOHdQelBnQUFELy93LzhQUDh3UHpQZ0FBREFNUHpETS96QUFEQWdBQURBTVB6RE0vekFBREFnQUFETXpNL00vekR6QUREZ0FBRE16TS9NL3pEekFERGdBQUQ4QVAvL01BL0F3dzhnQUFEOEFQLy9NQS9Bd3c4Z0FBRFAvd016UEEvOHpBemdBQURQL3dNelBBLzh6QXpnQUFEUEFQd0FBTXd3dy84Z0FBRFBBUHdBQU13d3cvOGdBQUQvek0vTURBTXpNL0RnQUFEL3pNL01EQU16TS9EZ0FBRDhNQXd3dy9BOEF6d2dBQUQ4TUF3d3cvQThBendnQUFEUER6RDhQQUF3RHpEZ0FBRFBEekQ4UEFBd0R6RGdBQUFEdy9Qd3d6UC84ejhnQUFBRHcvUHd3elAvOHo4Z0FBQU1QQS8vOC9QUHd6OGdBQUFNUEEvLzgvUFB3ejhnQUFBQUF3UE04endBQU1BZ0FBQUFBd1BNOHp3QUFNQWdBQUF6RC96L0F6endQOFBnQUFBekQvei9Benp3UDhQZ0FBRFBBUERBRHd3QUFQRGdBQURQQVBEQUR3d0FBUERnQUFEd3p3ek13RHp6QXpBZ0FBRHd6d3pNd0R6ekF6QWdBQURBd01Qd0RBUEFQd01nQUFEQXdNUHdEQVBBUHdNZ0FBRE1EUFA4enpBTXpBRGdBQURNRFBQOHp6QU16QURnQUFBQU04QS9NRER3dy93Z0FBQUFNOEEvTUREd3cvd2dBQUFERHdNQXcvenp3ek1nQUFBRER3TUF3L3p6d3pNZ0FBQU04UEFQdzh6dzhEQWdBQUFNOFBBUHc4enc4REFnQUFBTS8vRFAvekE4RHdQZ0FBQU0vL0RQL3pBOER3UGdBQUE4QURETU13Lzh6ekFnQUFBOEFERE1Ndy84enpBZ0FBRC8vL01QL013RC8vL2dBQUQvLy9NUC9Nd0QvLy9nQUFBQUF6TXpNek16TUFBZ0FBQUFBek16TXpNek1BQWdBQUEvOC93QXc4ei9NLzhnQUFBLzgvd0F3OHovTS84Z0FBQXdNd0RQekRNUDh3TWdBQUF3TXdEUHpETVA4d01nQUFBd004d01BTVBEOHdNZ0FBQXdNOHdNQU1QRDh3TWdBQUF3TXp3L013d0FNd01nQUFBd016dy9Nd3dBTXdNZ0FBQS84d0Q4QXdNRDgvOGdBQUEvOHdEOEF3TUQ4LzhnQUFBQUF6L3pBTUFQTUFBZ0FBQUFBei96QU1BUE1BQWdBQUE9PC9FV00+DQoJPFBERl9VUkw+aHR0cDovL2ZpbGVzLmFoZHpmcC5jb206OTAwMC9maWxlc091dC9mZGZzLzUwMmJiNDZlNmQ3MTRhMGY5OTFjNjEyZjM2MDZlNTQ1PC9QREZfVVJMPg0KPC9SRVNQT05TRV9DT01NT05fRlBLSj4=
         <RESPONSE_COMMON_FPKJ class="RESPONSE_COMMON_FPKJ">
         <DDH>1637901159632671</DDH>
         <FPQQLSH>20211126113742858142</FPQQLSH>
         <JQBH>661102576607</JQBH>
         <FP_DM>034152100111</FP_DM>
         <FP_HM>04273717</FP_HM>
         <KPRQ>20211126123358</KPRQ>
         <FP_MW>8+79967769&lt;&gt;45-*64&gt;8+458543&gt;3258&gt;8+-/+09+/3192/783-1*+&lt;+/2764*-37099&lt;245&gt;/45/*+*3870-*1/58&gt;8+-/+09+/3192-&lt;87</FP_MW>
         <JYM>69746176991918408451</JYM>
         <EWM>Qk3CAwAAAAAAAD4AAAAoAAAASwAAAEsAAAABAAEAAAAAAIQDAAAAAAAAAAAAAAAAAAACAAAAAAAA///////////////////gAAAAAz/88zPwM/8gAAAAAz/88zPwM/8gAAA/8/MPDDz8z/AgAAA/8/MPDDz8z/AgAAAwM/AwADww/z8gAAAwM/AwADww/z8gAAAwMz8PM/wz8PMgAAAwMz8PM/wz8PMgAAAwMzDA/8P8AAzgAAAwMzDA/8P8AAzgAAA/8w8Dw/PPPz8gAAA/8w8Dw/PPPz8gAAAAAwMA/AADMwAgAAAAAwMA/AADMwAgAAD//w/8PP8wPzPgAAD//w/8PP8wPzPgAADAMPzDM/zAADAgAADAMPzDM/zAADAgAADMzM/M/zDzADDgAADMzM/M/zDzADDgAAD8AP//MA/Aww8gAAD8AP//MA/Aww8gAADP/wMzPA/8zAzgAADP/wMzPA/8zAzgAADPAPwAAMwww/8gAADPAPwAAMwww/8gAAD/zM/MDAMzM/DgAAD/zM/MDAMzM/DgAAD8MAwww/A8AzwgAAD8MAwww/A8AzwgAADPDzD8PAAwDzDgAADPDzD8PAAwDzDgAAADw/PwwzP/8z8gAAADw/PwwzP/8z8gAAAMPA//8/PPwz8gAAAMPA//8/PPwz8gAAAAAwPM8zwAAMAgAAAAAwPM8zwAAMAgAAAzD/z/AzzwP8PgAAAzD/z/AzzwP8PgAADPAPDADwwAAPDgAADPAPDADwwAAPDgAADwzwzMwDzzAzAgAADwzwzMwDzzAzAgAADAwMPwDAPAPwMgAADAwMPwDAPAPwMgAADMDPP8zzAMzADgAADMDPP8zzAMzADgAAAAM8A/MDDww/wgAAAAM8A/MDDww/wgAAADDwMAw/zzwzMgAAADDwMAw/zzwzMgAAAM8PAPw8zw8DAgAAAM8PAPw8zw8DAgAAAM//DP/zA8DwPgAAAM//DP/zA8DwPgAAA8ADDMMw/8zzAgAAA8ADDMMw/8zzAgAAD///MP/MwD///gAAD///MP/MwD///gAAAAAzMzMzMzMAAgAAAAAzMzMzMzMAAgAAA/8/wAw8z/M/8gAAA/8/wAw8z/M/8gAAAwMwDPzDMP8wMgAAAwMwDPzDMP8wMgAAAwM8wMAMPD8wMgAAAwM8wMAMPD8wMgAAAwMzw/MwwAMwMgAAAwMzw/MwwAMwMgAAA/8wD8AwMD8/8gAAA/8wD8AwMD8/8gAAAAAz/zAMAPMAAgAAAAAz/zAMAPMAAgAAA=</EWM>
         <PDF_URL>http://files.ahdzfp.com:9000/filesOut/fdfs/502bb46e6d714a0f991c612f3606e545</PDF_URL>
         </RESPONSE_COMMON_FPKJ>
         */

    }



    public void test2222() {
        String s = "/+=";
        s = s.replaceAll("/", "_a").replaceAll("\\+", "_b").replaceAll("=", "_c");
        System.out.println(s);
        s = s.replaceAll("_a", "/").replaceAll("_b", "\\+").replaceAll("_c", "=");
        System.out.println(s);
    }








    public void test111() {
        System.out.println(new Date(4102286399L * 1000L));
        long i = 70*365*24*60*60L;
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
    }1111
}
