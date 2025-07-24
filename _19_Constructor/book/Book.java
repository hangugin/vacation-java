package com.study._19_Constructor.book;

public class Book {
    /*
    1. Book 클래스
        - title: String
        - author: String
        - price: int
    2. 생성자 3개를 정의해 주세요
        - 기본생성자: 모든 필드를 기본값 초기화
        - 제목과 저자만 초기화하는 생성자
        - 제목, 저자, 가격 모두 초기화하는 생성자
    3. displayInfo() 메서드 정의: 출력용, 리턴:void
        - "제목": ~ , 저자: ~, 가격: ~원"
     */

    String title;
    String author;
    int price;

    public Book() {
        // 코드가 없어도 됨.
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("제목: " + this.title);
        System.out.println("저자: " + this.author);
        System.out.println("가격: " + this.price);

    }
}
