package com.study._13_Array;

import java.util.Arrays;

public class StudentScores {
    public static void main(String[] args) {
        /*
        요구사항
        1. 모든 학생 점수의 총합(totalSum)을 구하여 출력하세요
        2. 전체 점수의 평균(average)를 구하여 출력하세요
        3. 평균 이상인 학생 수(overAvgCount)를 구하여 출력하세요
        4. 최고 점수(maxScore)를 찾아 출력하세요
        ---
        5. 상위 20%의 점수를 출력해 주세요
         */

        //학생 점수 배열
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 82, 89, 91};

        int totalSum = 0;
        for(int i = 0; i < scores.length; i++){
            totalSum += scores[i];
        }
        System.out.println("모든 학생 점수의 총합: " + totalSum);

        double average = (double) totalSum / scores.length;
        System.out.println("전체 점수의 평균: " + average);

        int overAvgCount = 0;
        for (int score : scores){
            if (average <= score){
                overAvgCount++;
            }
        }
        System.out.println("평균 이상인 학생 수: " + overAvgCount);

        int maxScore = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("최고 점수: " + maxScore);

        int topTwo = 2;
        Arrays.sort(scores);
        for (int i = scores.length - topTwo; i < scores.length; i++){
            System.out.println(scores[i]);
        }

    }
}
