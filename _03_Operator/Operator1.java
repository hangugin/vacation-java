package com.study._03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자는 계산을 수행하는 기호
        3 + 4 -> +가 연산자, 3과 4를 피연산자
        a - b -> -가 연산자, a와 b가 피연산자

        종류
        산술연산자: 사칙연산(+,-,*,/,%)
        비교연산자: 같냐, 크냐, 작냐(==,!=,<,<=,>,>=)
        증감연산자: 1씩 증가하거나, 감소하거나(++, --)
        논리연산자: 논리값(true, false)끼리 연산(!:not, &&:and, ||:or)
        대입연산자: 값저장(=,+=,-=,*=,/=,%=)
         */

        // 변수 초기화
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a+b = " + sum);

        // 문자열 덧셈
        // 문자열 + 문자열
        String str1 = "hello " + "world";
        System.out.println(str1);

        // 문자열 + 숫자 -> 결과: 문자열
        int one = 1;
        int two = 2;
        System.out.println("one + two = " + one + two);
        System.out.println("one + two = " + (one + two));

        // 뺄셈
        int diff = a - b;
        System.out.println("diff: " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("multi: " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("div: " + div);

        // 나머지
        int remain = a % b;
        System.out.println("remain: " + remain); // 1
        // 배수판별, a가 짝수냐? -> a % 2 == 0 / a % 2 != 0
        // 3의 배수냐? -> a % 3 == 0
        // 10시 + 30시간 -> 10 + (30%24) : 16시
        // 한페이지에 20개 게시물, 총게시물: 171개
        // 171/20 -> 8
        // 171 % 20 == 0 : 8페이지
        // 171 % 20 != 0 : 9페이지
    }
}
