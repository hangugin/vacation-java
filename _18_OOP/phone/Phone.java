package com.study._18_OOP.phone;

public class Phone {
    int battery;
    boolean powerStatus;

    void turnOn() {
        if (battery >= 10) {
            powerStatus = true;
            System.out.println("전원이 켜졌습니다.");
        } else  {
            System.out.println("배터리 부족");
        }
    }

    void turnOff() {
        powerStatus = false;
        System.out.println("전원이 꺼졌습니다.");
    }

    void call() {
        if (powerStatus && battery >= 5) {
            System.out.println("통화 걸기");
            battery -= 5;
        } else if (!powerStatus) {
            System.out.println("전원을 먼저 켜주세요");
        } else {
            System.out.println("배터리가 부족합니다");
        }
    }

    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("배터리 충전완료 잔량: " + battery);
    }

    void printStatus() {
        if (powerStatus) {
            System.out.println("전원상태: ON");
        } else {
            System.out.println("전원상태: OFF");
        }
        System.out.println("배터리 잔량: " + battery);
    }

}
