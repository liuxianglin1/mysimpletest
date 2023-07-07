package com.company;

public class Main1 {
    public static void main(String[] args) {

        Person person = new Student();
    }
}

 abstract class Person {
    protected final String name;
    protected int age;

    public Person() {
        this.name = "111";
    }

    public abstract void run();


}

class Student extends Person {

    protected int score;


    @Override
    public String toString() {
        return "Student:score" + score;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return this.score == student.score;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.score;
    }


    @Override
    public void run() {

    }
}

class SubStudent extends Student {


}
