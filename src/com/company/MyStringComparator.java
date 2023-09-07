package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author liuxianglin
 * @datetime 2023/8/24
 * @description
 */
public class MyStringComparator implements Comparator<String> {

    private List<String> sortOrder;

    public MyStringComparator(List<String> sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(String s1, String s2) {
        int index1 = sortOrder.indexOf(s1);
        int index2 = sortOrder.indexOf(s2);
        // 根据排序顺序的索引值进行比较
        return Integer.compare(index1, index2);
    }

    public static void main(String[] args) {
        String[] srtArray = {"tyhgld_001", "tyhptd_001", "ccd_001"};
        //指定排序的字符串列表
        List<String> sortOrder = Arrays.asList("tyhgld_001", "ccd_001", "tyhptd_001");
        Arrays.sort(srtArray, new MyStringComparator(sortOrder));

        for (String str: srtArray) {
            System.out.println(str);
        }
        System.out.println("123");
    }
}
