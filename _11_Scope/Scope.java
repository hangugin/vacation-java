package com.study._11_Scope;

public class Scope {
    public static void main(String[] args) {
        // 스코프 = 변수의 생존 범위
        // 스코프를 벗어나면 변수는 더이상 존재하지 않는다.

        int m = 10; // m 변수는 생존이 시작 - main의 중괄호 안쪽에서 모두 생존

        if(true) {
            int x = 20; // x 변수 생존시작 - if문 블록 안에서만 생존
            System.out.println("m = " + m); // 외부변수 m 접근가능
            System.out.println("x = " + x);
        } // x 생존 종료 - x 사라짐

        for (int i = 0; i < 2; i++) { // i 변수는 for문 안에서만 생존
            System.out.println("i = " + i);
        } // i 생존 종료 - i 사라짐

        for (int i = 0; i < 2; i++) { // 새로운 변수 i(위의 i와 다른 i)
            System.out.println("i = " + i);
        } // i 생존 종료 - i 사라짐

    }
    // m은 생존 종료
}
