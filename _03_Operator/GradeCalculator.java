package com.study._03_Operator;

public class GradeCalculator {
    public static void main(String[] args) {
        // 학점계산기
        // 학생점수
        int mathScore = 85;
        int englishScore = 92;
        int scienceScore = 78;
        /*
        요구사항
        1. 총점과 평균을 계산하여 출력
        2. 평균점수기준으로
        90점 이상 -> A
        80 ~ 89 -> B
        70 ~ 79 -> C
        70 미만 -> D

        ==최종출력==
        총점: ~점
        평균: ~점
        A학점 해당: true 아니면 false
        B학점 해당: true 아니면 false
        C학점 해당: true 아니면 false
        D학점 해당: true 아니면 false
        */

        int totalScore = mathScore + englishScore + scienceScore;
        double averageScore = totalScore / 3.0;

        boolean isGradeA = averageScore >= 90;
        boolean isGradeB = averageScore >= 80 && averageScore < 90;
        boolean isGradeC = averageScore >= 70 && averageScore < 80;
        boolean isGradeD = averageScore < 70;

        System.out.println("==최종출력==");
        System.out.println("총점: "+ totalScore + "점");
        System.out.println("평균: "+ averageScore + "점");
        System.out.println("A학점 해당: "+ isGradeA);
        System.out.println("B학점 해당: "+ isGradeB);
        System.out.println("C학점 해당: "+ isGradeC);
        System.out.println("D학점 해당: "+ isGradeD);
    }
}
