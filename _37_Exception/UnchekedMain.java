package com.study._37_Exception;

public class UnchekedMain {

    static int devide(int a, int b) {
        if (b == 0) {
            throw new MyUnCheckedException("0으로 나눌 수 없습니다");
        }

        return a / b;
    }

    static void method1() {
        devide(5, 0); // 예외 발생한다면, 자동 전파
    }

    public static void main(String[] args) {
        try {
            devide(10, 0);
        } catch (MyUnCheckedException e) {
            System.out.println();
        }

        try {
            method1();
        } catch (MyUnCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    자주 접하는 언체크 예외들
    1. NullPointerException: null객체를 .으로 참조할 때
    2. ArithmeticException: 0으로 나누려 할때 / 수학적 오류
    3. ArrayIndexOutOfBoundsException
    4. IllegalArgumentException: 잘못된 인자를 메서드에 전달
    5. NumberFormatException: 숫자 형식 변환 실패
     */

    String str = null;
    int strLen = str.length();
}
