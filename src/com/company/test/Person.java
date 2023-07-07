package com.company.test;


public class Person {

    protected String name;

    protected String password;

}

class Student extends Person {
    public String hello() {
        return this.name + this.password;
    }
}

class SubStudent extends Student {

    @Override
    public String hello() {
        return this.name + this.password;
    }


    public String hello(String a) {
        return this.name + this.password;
    }
}
