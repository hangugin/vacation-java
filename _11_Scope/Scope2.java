package com.study._11_Scope;

public class Scope2 {
    public static void main(String[] args) {
        int outer = 1; // 바깥변수 // main 중괄호 안에서 생존

        if (true) {
            int inner = 2; // 안쪽변수
            System.out.println(outer); //outer는 안쪽에 접근가능

            if (true) {
                int deeper = 3;
                // 모든 바깥쪽 변수들은 접근이 가능하다
                System.out.println(outer);
                System.out.println(inner);
            } // deeper 사용불가
        } // inner 사용불가
    } // outer 사용불가
}
