package com.study._18_OOP.phone;

public class PhoneMain {
    public static void main(String[] args) {
        /*
        1. Phone클래스를 완성해주세요
        - 필드
            battery (int): 배터리 잔량
            powerStatus (boolean): 전원 상태(true -> 켜짐/ false -> 꺼짐)

        - 기능
            - turnOn(): 전원켜기 (배터리가 10 이상일때만)
            - turnOff(): 전원끄기
            - call(): 전화걸기(전원이 꺼져있고, 배터리가 5이상일때만, 통화시 배터리 5소모)
            - charge(): 충전하기(배터리 20충전, 배터리 최대 100)
            - printStatus(): 상태확인(전원 상태, 배터리 잔량 출력)

        2. PhoneMain에 테스트 작성 (2~6 모두 메서드로 동작)
            1. 객체 생성
            2. 배터리 부족상태에서 전원 켜기
            3. 충전 2번 전원 켜기
            4. 전원 걸기
            5. 상태 확인
            6. 전원 끄기
         */
        Phone phone = new Phone();
        phone.turnOn();
        phone.charge();
        phone.charge();
        phone.turnOn();
        phone.call();
        phone.printStatus();
        phone.turnOff();
    }
}
