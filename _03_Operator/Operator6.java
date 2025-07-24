package com.study._03_Operator;

public class Operator6 {
    public static void main(String[] args) {
        // 삼항연산자 -> 값을 받음

        // (조건식) ? true일때의 값 : false일때의 값
        // 조건식 결과는 항상 boolean 타입
        // true일때의 값, false일때의 값 자료형이 같아야 함

        int x = 1, y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        String sameStr = (x == y) ? "같습니다" : (x > y) ? "x가 더 커요" : "y가 더 커요"; // 중첩
        System.out.println(sameStr);
    }
}
