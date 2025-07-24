package com.study._04_String;

public class Email {
    public static void main(String[] args) {
        String email = "student@naver.com";

        /*
        1. @(At) 위치(index) 찾기
        2. id만 추출해서 출력
        3. 도메인(naver, google...)이 naver인지 검사(true 아니면 false)
        4. 도메인만 추출해서 출력 - @뒷부분 추출 변수 -> 변수 -> "." 기준으로 가공
         */

        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        System.out.println(username);
        boolean isNaver = email.contains("naver");
        System.out.println(isNaver);
        String domainName1 = email.substring(atIndex+1);
        int atDot = domainName1.indexOf(".");
        String domainName2 = domainName1.substring(0, atDot);
        System.out.println(domainName2);
    }
}
