package com.study._27_Interface;

public interface Animal {

    // 모든 메서드가 자동으로 public abstract가 붙는다.
    // -> 추상 메서드만 정의가 가능하다.

    // 기존 상속의 경우: is - a 관계 electricCar is a Car
    // 인터페이스의 경우: can - do 관계 Dog can do Animal
    void sound();
    void move();
}
