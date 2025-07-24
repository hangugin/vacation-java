package com.study._15_Method;

public class Parameter {
    // [접근제한자] [static유무] [리턴타입] [함수이름](매개변수1, 매개변수2...) {}
    // 매개변수 혹은 parameter라고 부른다
    // parameter를 통해 함수 안으로 값(참조형data까지) 전달이 가능하다
    public static void greeting(String username) {
        System.out.println("안녕하세요 " + username + "님");
    }

    // 두수의 합을 합하여서 그 값을 출력하는 함수
    public static void printAddValue(int num1, int num2) {
        System.out.println("두수의 합: " + (num1 + num2));
    }

    public static void main(String[] args) {
        String name = "홍길동";
        greeting(name);
        printAddValue(10, 20);
        int a = 10, b = 20;
        printAddValue(a, b);
    } // name 사라짐
}
