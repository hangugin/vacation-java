package com.study._06_If;

public class If {
    public static void main(String[] args) {
        /*
        if (조건 / 논리 연산) {
            // 조건/논리 연산 결과가 true일때 실행되는 코드

        }
         */

        int height = 130;

        if(height >= 120) {
            System.out.println("탑승 가능");
        }

        boolean isAdult = false;
        if (height >= 120 && !isAdult){
            System.out.println("탑승 가능");
        }
    }
}
