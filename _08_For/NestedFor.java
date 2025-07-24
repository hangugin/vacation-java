package com.study._08_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.print(day + "일 살았음 ");
            }
            System.out.println(week + "주 끝!");
        }

    }
}
