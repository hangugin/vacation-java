package com.study._07_Switch;

import java.util.Scanner;

public class Popcorn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구매하실 팝콘 사이즈를 입력하세요(S,M,L,XL) >>");
        String size = scanner.nextLine();
        int basePrice = 3000;
        int finalPrice;

        // 사이즈별 가격 결정
        switch (size.toUpperCase()) {
            case "S":
                finalPrice = basePrice;
                break;
            case "M":
                finalPrice = basePrice + 1000;
                break;
            case "L":
                finalPrice = basePrice + 2000;
                break;
            case "XL":
                finalPrice = basePrice + 3000;
                break;
            default:
                System.out.println("가장 작은 사이즈로 처리");
                size = "S";
                finalPrice = basePrice;
        }
        System.out.println("사이즈: " + size.toUpperCase());
        System.out.println("가격: " + finalPrice + "원");
    }
}
