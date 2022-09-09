package com.company.test;

import com.company.Test2;

public class Test1 extends Test2 {
    public void getOuterParam1() {

    }

    public Test3 getTest3() {
        Test3 test3 = new Test3();
        return test3;
    }

    public class Test3 {
        public void getInnerParam2() {

        }
    }

}
