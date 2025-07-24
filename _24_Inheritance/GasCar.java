package com.study._24_Inheritance;

public class GasCar extends Car{
    private int fuelLevel;

    public GasCar() {
        System.out.println("GasCar 생성자 호출");
        this.fuelLevel = 100;
    }

    public GasCar(String brand) {
        super(brand);
        System.out.println("GasCar 생성자 호출");
        this.fuelLevel = 100;
    }

    // 오버라이딩(Overriding): 부모의 메서드를 재정의 하는 것.

    @Override
    public void move() {
        System.out.println("가솔린차로 이동");
    }
    /*
    메서드 오버라이딩
    메서드 영역에서는 Car.move() / GasCar.move() 별도로 존재
    오버라이딩은 덮어쓰기가 아니라 각 클래스에 정의된 독립된 메서드
    JVM이 실제 객체 타입 기준으로 메서드를 호출함 -> 캐스팅으로 연관되서 자주 출제

    규칙:
    1. 메서드 시그니처(메서드 이름, 매개변수, 리턴타입)가 부모와 완전히 동일
    2. @Override 어노테이션 -> 컴파일러가 완전히 부모와 동일한 메서드인지 검사해 줌

    메서드 오버라이딩 vs 메서드 오버로딩
    오버라이딩 -> 상속관계, 부모와 시그니처가 같은 함수를 재정의
    오버로딩 -> 같은 클래스 내에서, 시그니처가 다른 함수를 만드는 것
     */
    @Override
    public void showInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("연로: " + fuelLevel);
        System.out.println("차종: 가솔린 차");
    }

    // 가솔린 차의 고유 메소드
    public void fillGas() {
        System.out.println("만땅까지 주유합니다");
        this.fuelLevel = 100;
    }
}
