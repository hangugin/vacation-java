package com.study._05_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {

        // Scanner 객체 생성 (지금은 외우거나 복사 붙여넣기로 사용)
        Scanner scanner = new Scanner(System.in);
        String something = "something";

        /*
        scanner.nextLine() // 문자열(한 줄 전체, 공백포함, 엔터키까지 읽음)
        scanner.nextInt() // 정수를 입력받음(엔터키를 입력받지 못함)
         */

        System.out.println("문자열을 입력하세요 >>");
        String inputStr = scanner.nextLine();
        System.out.println(inputStr);

        System.out.println("정수를 입력하세요 >>");
        int inputValue = scanner.nextInt();
        System.out.println("입력한 정수값: " + inputValue);

        int age;
        String name;
        System.out.println("나이를 입력하세요 >>");
        age = scanner.nextInt();
        scanner.nextLine(); // 엔터키 처리용
        // nextInt가 엔터키를 읽지 못하기 때문에 입력한 엔터키가 남아있음
        // 그후에 오는 nextLine이 남아있는 엔터키를 읽고 바로 종룡
        System.out.println("이름을 입력하세요 >>");
        name = scanner.nextLine();

        System.out.println("나이: " + age + "이름: " + name);

        scanner.close(); // 스캐너 종료(메모리에서 내림)
    }
}
