package com.study._14_MultiArray;

public class MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 전체 탐색
        for(int i = 0; i < seats.length; i++) { // 큰 서랍 순회
            for(int j = 0; j < seats[i].length; j++) { // 내부 서랍 순회
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("=".repeat(50));

        // 항상된 for문
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

    }
}
