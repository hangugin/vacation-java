package com.study._24_Inheritance;

// Car 부모클래스로는 어떤게 정의 될 수 있을까
// Vehicle - Car, Plane, Train
public class Car {
    // 부모클래스(기초 설계도 역할)
    // 모든 차가 공통으로 가져야 하는 필드/메서드를 정의 - 추상화

    protected String brand; // protected - 자식만 접근 가능
    private int year;

    public Car() {
        System.out.println("Car 생성자 호출 됨");
        this.brand = "기본브랜드";
    }

    public Car(String brand) {
        System.out.println("Car 생성자 호출 됨");
        this.brand = brand;
    }

    // 자동차라면 할 수 있는 기능(메서드)
    public void move() {
        System.out.println("차가 이동합니다.");
    }

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }

    public void showInfo() {
        System.out.println("브랜드: " + brand);
    }

}
