package com.study._09_While;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {

        /*
        1. while문을 사용하여 매 반복마다 스캐너를 통해 1~100 정수를 입력받는다
        2. Random을 통해 생성한 1~100 정수를 스케너로 받은 data와 비교한다
        3. 비교결과 작으면 "up"출력, 크면 "down"출력
        4. 같으면 "정답입니다!" 출력하고 while 반복문 탈출
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(1, 100);
        int guess = 0;
        while (guess != answer) {
            System.out.println("정수를 입력하세요 >>");
            guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("정답입니다!");
            } else if (guess > answer) {
                System.out.println("down");
            } else {
                System.out.println("up");
            }
        }
    }
}
