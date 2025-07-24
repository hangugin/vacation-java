package com.study._09_While;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        while (조건식) {
            // 조건이 참인 동안 반복될 코드
        }
        // 조건식 결과가 false가 되면 반복 종료
         */

        // for문 적합할때 - 횟수가 명확
        // while문 적합할때 - 횟수가 불명확, 조건 중심

        int count = 0;

        while(count < 3) {
            count++;
            System.out.println("현재 count: " + count);
        }

        // 스캐너 "객체" "생성"
        Scanner scanner = new Scanner(System.in);
        // 랜덤 "객체" "생성"
        Random random = new Random();

        int num = random.nextInt(1, 10); // 1이상 10미만 중 랜덤 정수
        int inputNum = 0;

        while (num != inputNum) {
            System.out.println("입력 >>");
            inputNum = scanner.nextInt();

            if (inputNum == num) {
                System.out.println("정답입니다! " + num);
            } else {
                System.out.println("땡! 다시 입력하세요");
            }
        }
    }
}
