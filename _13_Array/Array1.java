package com.study._13_Array;

public class Array1 {
    public static void main(String[] args) {
        /*
        배열이란?
        - 같은 자료형의 여러 데이터를 한번에 관리 할 수 있는 타입 / 저장 공간
        - 연속된 메모리에 저장하기 때문에 탐색시 속도에서 유리하다.
        - 각 공간마다 고유한번호(인덱스)가 있어서 정확히 찾아갈 수 있다.
         */

        // int[] -> int형 배열 타입 선언
        // new int[5] -> 실제 5칸의 메모리 공간 생성
        // Array또한 new로 생성하기때문에 참조형 타입이다.
        int[] studentScore = new int[5];
        studentScore[0] = 90; // 0번방에 90 저장
        studentScore[1] = 80;
        studentScore[2] = 70;
        studentScore[3] = 60;
        studentScore[4] = 50;

        // 배열의 또다른 초기화 방법
        int[] score = new int[]{90, 80, 70, 60, 50};
        // 좀 더 간단하게
        int[] score2 = {90, 80, 70, 60, 50}; // 이걸 가장 많이 사용

        System.out.println("첫번째 학생 점수: " + score2[0]);
        System.out.println("마지막 학생 점수: " + score2[score2.length - 1]);

        // .length -> 배열의 크기(갯수)를 반환
        System.out.println("score2의 길이: " + score2.length);
    }
}
