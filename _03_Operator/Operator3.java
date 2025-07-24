package com.study._03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        // 비교연산자 -> 결과가 boolean 대입: true 아니면 false
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);

        // a > 0 and a < 10
        System.out.println(a > b);
        System.out.println(a >= b);

        System.out.println(a < b);
        System.out.println(a <= b);

        // 결과를 변수에 저장 가능하다
        boolean result = a != b;
        System.out.println("비교결과: " + result);

        // 문자열의 값비교
        // 문자열의 값비교는 == 대신 .equals() 사용!
        String name1 = "손흥민";
        String name2 = "손흥민";
        String name3 = new String("손흥민");

        // 잘못된 방법 (잘 작동할 때도있지만, 위험하다)
        System.out.println("이름비교: " + (name1 == name2)); // 캐싱
        System.out.println("이름비교: " + (name1 == name3));

        /*
        - 자료형 분류
        1. 원시형: int, double, long, float...
        2. 참조형: String, Array, 여러 객체

        - JVM(코드 실행 주체) 메모리(ram) 간략 소개
        Stack + Heap
        Stack -> 원시자료 데이터(10, 'A', 3.14)
        Heap -> 참조자료 데이터("손흥민", "hello")
                garbage collector -> 메모리 할당/제거 자동화
         */

        // 올바른 방법
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println("손흥민".equals(name1));
    }
}
