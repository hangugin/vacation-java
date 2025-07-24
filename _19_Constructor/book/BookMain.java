package com.study._19_Constructor.book;

public class BookMain {
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
    BookMain에서
    기본생성자, 제목/저자 생성자, 전체초기화생성자를 각각 호출
    필드 초기화 값은 자유롭게 작성해주세요
    3개의 객체 생성 -> 각각 displayInfo()를 호출
     */
    public static void main(String[] args) {
        Book book1 = new Book("미래를 보다", "홍길동", 20000);
        book1.displayInfo();
        System.out.println();

        Book book2 = new Book("hi java", "홍길동", 30000);
        book2.displayInfo();
        System.out.println();

        Book book3 = new Book("수학의 정석", "홍길동", 20000);
        book3.displayInfo();
        System.out.println();
    }
}
