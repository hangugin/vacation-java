package com.study._10_BreakContinue;

public class Continue {
    public static void main(String[] args) {

        int waiting = 50; // 대기 인원
        int max = 10; // 판매 가능 갯수
        int sold = 0; // 현재 판매량
        int noShow = 6; // 노쇼 번호

        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장하세요~");

            if (i == noShow) {
                System.out.println(i + "번째 손님 노쇼요...");
                continue; // 다음반복으로 스킵
            }

            sold++; // 노쇼가 아니면 판매량 1증가

            if (sold == max) { // 실제 판매량이 재고와 같아지면 break
                System.out.println("재료소진");
                break;
            }
        }
    }
}
