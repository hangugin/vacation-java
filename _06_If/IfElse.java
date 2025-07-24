package com.study._06_If;

public class IfElse {
    public static void main(String[] args) {
        int height = 120;

        // else는 위의 조건이 모두 거짓이면 실행되는 코드 블럭
        // 나머지 경우의 수에 대해서 실행되는 코드 블럭
        // if ~ else에서 반드시 하나의 코드 블럭만 실행 된다.

        if (height >= 120) {
            System.out.println("탑승 가능");
        } else { // 단독 사용 x
            System.out.println("탑승 불가능");
        }

    }
}
