package com.study._04_String;

public class StringMethod {
    public static void main(String[] args) {
        // 문자열 관련 유틸 함수
        String str = "My name is Son";

        // 문자열 길이(문자 몇개?)확인: .length() ***
        System.out.println("문자열 길이: "+ str.length());

        // 대소문자 변환 -> 클라이언트 입력처리
        System.out.println("대문자: " + str.toUpperCase());
        System.out.println("소문자: " + str.toLowerCase());

        // 특정 문자열 포함여부 - 검색
        System.out.println("name이 포함됨? : " + str.contains("name"));
        System.out.println("age가 포함됨? : " + str.contains("age"));

        // 특정 문자열의 위치(index) 찾기 ***
        System.out.println("Son 위치: " + str.indexOf("Son"));
        System.out.println("java 위치: " + str.indexOf("java")); // 없으면 -1

        // 시작/끝 문자열 확인(접두/접미 확인)
        System.out.println("My로 시작하냐? : " + str.startsWith("My"));
        System.out.println("Son으로 끝나냐? : " + str.endsWith("Son"));

        // 문자열 교체하기
        System.out.println(str.replace("Son", "son"));

        // 문자열 추출(자르기)하기 **
        System.out.println(str.substring(7)); // index 7부터 끝까지
        System.out.println(str.substring(7, 10)); // index 7이상 10미만

        // 같이 잘 쓰이는 메서드
        int indexOfSon = str.indexOf("Son");
        System.out.println(str.substring(indexOfSon));

        // 문자열 더하기
        String s1 = "Hello";
        String s2 = "world";
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));
    }
}
