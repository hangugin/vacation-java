package com.study._04_String;

public class Escape {
    public static void main(String[] args) {
        // 이스케이프 문자
        // \n: 줄바꿈(new line) - 엔터키
        // \t: 공백 4개 - 탭키
        // \": 쌍따옴표 출력
        // \': 홑따옴표 출력
        // \\: 백슬래시 출력

        // 여러줄 출력
        System.out.println("집에");
        System.out.println("가고");
        System.out.println("싶어요");

        System.out.println("집에\n가고\n싶어요");

        // 파일경로 출력
        System.out.println("C:\\ProgramFiles\\Java");

    }
}
