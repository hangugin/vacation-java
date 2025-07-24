package com.study._07_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {
        /*
        요일마다 할인율이 달라진다
        scanner를 통해 요일(dayOfWeek)을 입력받습니다.
        switch문을 사용하여 요일마다 다른 할인율을 적용합니다
        월 - 10%
        화/수/목 - 5%
        금 - 15%
        토/일 - 20%
        최종출력
        오늘: ~요일
        정가: 10000원
        최종가격: ~원
         */

        int basePrice = 10000;
        double discountRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력하세요 >>");
        String dayOfWeek = scanner.nextLine();

        dayOfWeek = dayOfWeek.endsWith("요일") ? dayOfWeek : dayOfWeek + "요일";

        switch (dayOfWeek) {
            case "월요일":
                discountRate = 0.1;
                break;
            case "화요일":
            case "수요일":
            case "목요일":
                discountRate = 0.05;
                break;
            case "금요일":
                discountRate = 0.15;
                break;
            case "토요일":
            case "일요일":
                discountRate = 0.2;
                break;
            default:
                discountRate = 0;
                System.out.println("올바른 요일을 입력하세요!");
        }
        double finalPrice = basePrice * (1 - discountRate);

        System.out.println("오늘: " + dayOfWeek);
        System.out.println("정가: " + basePrice + "원");
        System.out.println("최종가격: " + finalPrice + "원");


    }
}
