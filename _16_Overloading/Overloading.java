package com.study._16_Overloading;

public class Overloading {
    public static void printAddNum(int a, int b) {
        System.out.println("두수의 합: " + (a + b));
    }
    // 시그니처: Overloading 클래스의 printAddNum 메서드(1: int, 2: int)

    public static void printAddNum(double a, int b) {
        System.out.println("두수의 합: " + (a + b));
    }
    // 시그니처: Overloading 클래스의 printAddNum 메서드(1: double, 2: int)

    public static void printAddNum(int a, double b) {
        System.out.println("두수의 합: " + (a + b));
    }
    // 시그니처: Overloading 클래스의 printAddNum 메서드(1: int, 2: double)

    public static void printAddNum(double a, double b) {
        System.out.println("두수의 합: " + (a + b));
    }
    // 시그니처: Overloading 클래스의 printAddNum 메서드(1: double, 2: double)

    public static void printNum(double a) {
        System.out.println("넘어온 값: " + a);
    }

    public static void printNum(int a) {
        System.out.println("넘어온 값: " + a);
    }

    public static void main(String[] args) {
        /*
            메서드 오버로딩(과적)
            같은 이름의 메서드를 여러개 선언하는 것
            매개변수(파라미터)의 타입 / 순서 / 갯수가 다르면
            같은 메서드 이름을 사용할 수 있다.

            컴파일러가 메서들르 인식하는 기준
            : 메서드 시그니처(이름 + 매개변수 타입 목록)
        */

        printNum(1);
        /*
        1. 정확히 매칭되는 시그니처를 찾는다
        - int를 넘겼으니, int를 받는 메서드를 찾는다.
        2. 없으면, 자동 형변환이 가능한 시그니처를 찾는다.
         */
    }
}
