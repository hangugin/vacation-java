package com.study._37_Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이메일을 입력하세요 >>");
        String email = scanner.nextLine();

        /*
        1. 커스텀 예외를 정의해 주세요
        InvalidEmailException 예외 정의 - RuntiomeException 상속

        // 검증을 해주세요
        1. null 검사
        2. 빈 문자열 검사 "" or "   "
        3. "@" 있는지 검사(contains())
        - 검사시 검증이 안될경우 InvalidEmailException을 던져주세요
        - 정상이면, "유효한 이메일입니다" 출력
        - finally 까지 작성! scanner 처리
         */
        try {
            // 1. null 검사
            if (email == null) {
                throw new InvaildEmailException("이메일이 null 입니다.");
            }

            // 2. 빈 문자열 검사
            if (email.trim().isEmpty()) {
                throw new InvaildEmailException("이메일은 빈문자열 일 수 없습니다.");
            }

            if (!email.contains("@")) {
                throw new InvaildEmailException("이메일은 @가 포함되어야 합니다.");
            }

        } catch(InvaildEmailException e) {
            System.out.println("오류: " + e.getMessage());
        } finally {
            scanner.close();

        }
        System.out.println("프로그램 종료");



    }
}
