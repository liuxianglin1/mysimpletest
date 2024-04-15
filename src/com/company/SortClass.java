package com.company;

import javax.print.Doc;

/**
 * @author liuxianglin
 * @datetime 2024/3/28
 * @description
 */

public class SortClass {

    private Double value1;

    private Double value2;

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public SortClass(Double value1, Double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
