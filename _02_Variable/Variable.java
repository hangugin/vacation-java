package com.study._02_Variable;

public class Variable {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        // 변수쓰는 이유
        // "hello" -> "world!" 변경 -> 노가다

        // 변수 선언하는법
        String greeting; // 변수 선언(빈 박스 만들기)
        greeting = "hello"; // 변수 초기화(박스에 데이터 넣기)
        System.out.println(greeting); // 변수에 저장된 데이터 꺼내 쓰기
        greeting = "world!"; // 변수 재 할당(데이터 바꾸기)
        System.out.println(greeting);

        String academyName = "korea IT"; // 한번에 변수 선언 및 초기화
        String city, name; // 여러 변수 한번에 선언
        city = "부산"; // 각각 초기화
        name = "홍길동";

        String dogHello = "멍멍", catHello = "야옹"; // 한번에 여러변수 선언 및 초기화

        /*
        명명법
            1. 필수규칙
                int 1num; // 숫자로 시작하는 작명불가
                int my num; // 공백 불가
                int int // 자바 예약어 사용불가
                예약어(public, class, static, void, int, if....)
            2. 관례
                파스칼 표기법 => LastName => 모든 단어의 시작이 대문자 => 클래스명, 파일명
                카멜 표기법 => LastName => 첫단어의 시작은 소문자, 나머지 단어 시작은 대문자 => 변수명

                패키지(폴더) : 모두 소문자 (추후 배움)
                상수명: 모두 대문자 (추후 배움)
            3. 매너
                의미가 명확한 변수명을 사용하자(길어도 상관없음)
                ex) numberOfItemsCurrentlyInShoppingCart : 현재쇼핑카트에 담긴 물품갯수
                bad ex) a, b, c
                학습중에는 상관없다.
         */
    }
}
