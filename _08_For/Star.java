package com.study._08_For;

public class Star {
    public static void main(String[] args) {
        // 네모별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 별 직각삼각형 찍기
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
