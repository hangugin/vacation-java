package com.study._07_Switch;

public class Switch2 {
    public static void main(String[] args) {
        // 자바 14부터 지원하는 switch

        // 기존 switch문의 문제점
        // break를 일일이 선언, 불필요한 코드라인이 많다.
        String grade = "VVIP";

        int coupon = switch (grade) {
            case "NORMAL" -> 1000;
            case "VIP" -> 2000;
            case "VVIP" -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰: "+ coupon + "원");

    }
}
