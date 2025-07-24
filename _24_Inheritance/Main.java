package com.study._24_Inheritance;

public class Main {
    // 상속이란: 클래스의 필드/메서드를 물려 받는 것.
    // 물려주는 클래스: 부모클래스, 물림받는 클래스: 자식클래스
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("테슬라");
        tesla.move();
        tesla.openDoor();
        tesla.moveWithInfo(); // 부모의 move() 호출
        tesla.showDetailInfo(); // 부모의 showInfo() 호출

        GasCar gasCar = new GasCar("현대");
        gasCar.move(); // 오버라이딩 되어 자식의 메소드 사용


    }
}
