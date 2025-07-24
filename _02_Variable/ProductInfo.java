package com.study._02_Variable;

public class ProductInfo {
    public static void main(String[] args) {
        /*
        상품 정보 변수로 선언해서 출력해주세요
        - 출력 예시
        책 이름: 자바 프로그래밍 책
        저자: 김자바
        출판년도: 2020
        원가: 30000
        재고여부: true
         */
        String bookName = "자바 프로그래밍 책";
        String author = "김자바";
        int year = 2020;
        int price = 30000;
        boolean hasStock = true;

        System.out.println("책 이름 : " + bookName);
        System.out.println("저자: " + author);
        System.out.println("출판년도: " + year);
        System.out.println("원가: " + price);
        System.out.println("재고여부: " + hasStock);
    }
}
