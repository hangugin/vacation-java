package com.study._36_Enum;

public enum Grade {
    // 인스턴스 이름이지만, 생성자 역할을 한다.
    BASIC(10), // BASIC이름의 상수 인스턴스 생성자, 필드
    GOLD(20), // GOLD 이름의 상수 인스턴스 생성자, 필드
    DIAMOND(30); // DIAMOND 이름의 상수 인스턴스 생성자, 필드

    private int discountRate;

    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    /*
    enum은 class이다!
    Enum class를 상속받은 클래스.
    -> Enum에서 미리 만들어 놓은 메서드 사용 가능
    public static final Grade BASIC = new Grade(10);
    // 컴파일러가 알아서 컴파일시점에 코드를 변환해 준다.

    enum 권장 시점:
    - 상수들끼리 연관이 많을 떄, 집합화 할 수 있을 떄
    - 컴파일 시점에 모든 값을 알 수 있을 때
    - ex) 요일, 등급, 색상 -> 미리 정의된 상태값들이 존재할 때!
     */
}
