package com.study._27_Interface;

public class Dog implements Animal, Swimmable{
    // 인터페이스는 implements로 이식 받는다.

    @Override
    public void sound() {
        System.out.println("멍멍!");
    }

    @Override
    public void move() {
        System.out.println("강아지가 활발히 움직입니다.");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 헤엄칩니다.");
    }
}
