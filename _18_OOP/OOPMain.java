package com.study._18_OOP;

public class OOPMain {
    public static void main(String[] args) {
        /*
        절차 지향 프로그래밍 <> 객체 지향 프로그래밍 (x)
        - 절차지향
            메뉴얼 순서대로 진행(자동차 예시)
            시동 -> 기어 -> 엑셀
            실행 순서 중심, "어떻게?"

        - 객체지향
            자동차에세 "출발하세요"라고 명령한다.
            (내부에 "어떻게" 에대한 것은 실행코드(main) 에는 없음)
            객체간 상호작용 중심, "누가?, 무엇이?"
         */

        int speed = 0;
        boolean engineOn = false; // 시동 여부

        engineOn = true;
        System.out.println("자동차 시동을 켭니다");

        speed += 10;
        System.out.println("자동차 속도:" + speed);

        speed += 10;
        System.out.println("자동차 속도:" + speed);

        speed -= 10;
        System.out.println("자동차 속도:" + speed);

        // 상태확인
        if (engineOn) {
            System.out.println("자동차 시동이 걸려있습니다.");
            System.out.println("현재속도: " + speed);
        } else {
            System.out.println("자동차 시동이 꺼져있습니다.");
        }

        engineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다");
    }
}
