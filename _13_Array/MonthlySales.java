package com.study._13_Array;

public class MonthlySales {
    public static void main(String[] args) {
        // 월별 매출
        int[] monthlySales = {
                1200, 1350, 1100, 1500, 1800, 2100,
                2300, 2200, 1900, 1600, 1400, 1650
        };
        String[] months = {
                "1월", "12월", "3월", "4월", "5월", "6월",
                "7월", "8월", "9월", "10월", "11월", "12월"
        };

        // 1. 최고 매출금액 찾기 / 해당 월 찾기
        int maxSales = monthlySales[0]; //초기화
        int maxIndex = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxSales) {
                maxSales = monthlySales[i];
                maxIndex = i; // 인덱스 업데이트
            }
        }
        System.out.println("최고매출: " + maxSales + "만원 해당 월: " + months[maxIndex]);

        // 2. 최저매출 해당 월 찾기
        int minSales = monthlySales[0]; //초기화
        int minIndex = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < minSales) {
                minSales = monthlySales[i];
                minIndex = i; // 인덱스 업데이트
            }
        }
        System.out.println("최저매출: " + minSales + "만원 해당 월: " + months[minIndex]);

        // 3. 향상 for 문으로 연평균 매출 계산
        int totalSum = 0;
        for (int sales : monthlySales) {
            totalSum += sales;
        }
        double average = totalSum / monthlySales.length;
        System.out.println("연평균 매출: " + average + "만원");


    }
}
