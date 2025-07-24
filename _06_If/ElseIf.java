package com.study._06_If;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        /*
        if ~ else if * n ~ else
        하나의 조건이 만족되면, 나머지 조건들은 검사 안함
        오직 하나의 코드블럭만 실행
         */

        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성

        System.out.println("나이를 입력하세요 >");
        int age = scanner.nextInt();

        if (age <= 7) {
            if (age < 0){
                System.out.println("나이가 음수일 수 없습니다");
            } else {
                System.out.println("미취학 아동");
            }
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
