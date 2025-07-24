package com.study._18_OOP;

public class OOPMain2 {
    public static void main(String[] args) {
        Car car = new Car();

        // 진짜 자동차가 주행하는 것처럼 코드가 작성 됨
        car.engineStart();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printStatus();
        car.engineStop();

        /*
        객체 : 속성(데이터, 필드) + 기능(메서드)로 추상화
        // 자동차 객체
            // 속성: 속도, 시동상태
            // 기능: 시동걸기, 가속하기, 브레이크

        1. 캡슐화
            // 데이터(필드)와 기능(메서드)을 하나의 객체로 묶은 것
            // Car 클래스 -> speed, engineStart()
            // 은닉이 된다.(실행코드에서는 내부동작을 알 수 없다)
        2. 추상화
            // 공통점을 추려내서 코드로 작성
        3. 상속 (나중에)
            // 게임캐릭터
            // 기본캐릭터(상위) -> 전직캐릭터1(전사), 전직캐릭터2(도적)
        4. 다형성 (나중에)
            // 같은 메서드지만, 동작이 다르다.
            // 기본캐릭터.attack() -> 주먹을 내지른다
            // 전사.attack() -> 양손검을 휘두른다.
            // 마법사.attack() -> 마법으로 공격한다.
            // 같은 attack메서드지만 다른 동작을 한다.

         */
    }
}
