package com.study._06_If;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        /*
        1. 스캐너로 점수를 입력받는다
        2. 점수에 따라 성적 등급을 판정한다.
        3. A 또는 B 학점이면 "장학금 대상입니다" 출력
        4. A 또는 B 학점이 아니면, "장학금 대상이 아닙니다" 출력

        등급
        90점이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F
        최종출력
        점수: ~점
        등급: B
        장학금대상입니다!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 >>");
        int score = scanner.nextInt();

        String grade = "";

        if (score >= 90) {
            if (score > 100) {
                System.out.println("점수를 잘못입력하셨습니다.");
            } else {
            grade = "A";
            }
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("점수: " + score + "점");
        System.out.println("등급: " + grade);

        //grade 에 따른 장학금 대상 확인
        if (grade.equals("A")) {
            System.out.println("장학금 대상입니다");
        } else if (grade.equals("B")) {
            System.out.println("장학금 대상입니다.");
        } else {
            System.out.println("장학금 대상이 아닙니다.");
        }

    }
}
