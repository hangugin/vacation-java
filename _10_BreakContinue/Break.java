package com.study._10_BreakContinue;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break(for 혹은 while의 중괄호를 한번 빠져나옴)

        // 맛집 웨이팅 50명
        // 판매 가능한 갯수 10개

        int waiting = 50;
        int max = 10;

        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장하세요");
            if (i == max) {
                System.out.println("재료 소진! 마감합니다");
                break;
            }
        }

        int nowNum = 1;
        while (nowNum <= waiting) {
            System.out.println(nowNum + "번째 손님 입장하세요");
            if(nowNum == max) {
                System.out.println("재료 소진! 마감합니다!");
                break;
            }
            nowNum++;
        }
    }
}
