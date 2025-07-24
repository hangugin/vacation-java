package com.study._03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 증감연산자
        // 전위연산, 후위연산

        int a = 1;
        // 전위 증가: 먼저 증가하고 대입
        int b = ++a; // a를 먼저 2로 증가시키고, 2를 b에 대입
        System.out.println("b: " + b);

        a = 1;
        // 후위 증가: 먼저 대입하고 증가
        b = a++;
        System.out.println("b: " + b);

        // 단독사용(대입없이 혼자 코드 한줄 차지할경우)에는 둘다 결과 동일
        ++a;
        a++;
    }
}
