package com.study._09_While;

public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
            // 실행되는 코드
        } while (조건식);

        // 최소 한번은 실행되는 while 반복문(결과론적 설명)

        // while: (조건확인 -> 실행) x n
        // do-while: (실행 -> 조건확인) x n

         */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
