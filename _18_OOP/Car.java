package com.study._18_OOP;

// CarStatus
// Car가 CarStatus를 필드변수로 가지고 있어야함

public class Car {
    int speed;
    boolean engineOn;
    // boolean -> 초기화를 안해주면 기본값이 false
    // int -> 초기화 안하면 0
    // double -> 초기화 안하면 0.0
    // 참조자료형 -> 초기화 안하면 null

    void engineStart() {
        engineOn = true;
        System.out.println("자동차 시동을 켭니다");
    }

    void engineStop() {
        engineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다");
    }

    void accelerate() {
        if (engineOn) {
            speed += 10;
            System.out.println("자동차 속도: " + speed + "km/h");
        }
    }

    void brake() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) {
                speed = 0;
            }
            System.out.println("자동차 속도: " + speed + "km/h");
        } else {
            System.out.println("이미 정지 상태입니다");
        }
    }

    void printStatus() {
        System.out.println("자동차 상태 확인");
        if (engineOn) {
            System.out.println("시동 ON, 속도: " + speed + "km/h");
        } else {
            System.out.println("시동 OFF");
        }
    }

}
