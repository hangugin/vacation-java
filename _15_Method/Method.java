package com.study._15_Method;

public class Method {
    /*
    변수 -> 데이터를 저장하는 상자
    메서드(함수) -> 코드를 저장하는 상자

    1. 코드 중복 제거를 할 수 있다.(재사용)
    2. 유지보수가 편하다(메서드만 관리하면 되니까)
    3. 메서드는 작명이가능 -> 가독성이 좋아진다

    자주 헷갈리는 것) 함수 정의 / 함수 호출을 구분하자
     */

    // 자바는 함수안에 함수 선언이 안됩니다.
    // OOP(object oriented progaming) vs FP(functional programing)
    // OOP에 치중되어있다 -> class 위주다.
    // FP에 치중되어있다 -> 메서드(함수) 위주다.

    // public(접근제한자) : 다른 클래스에서도 호출이 가능하다(나중에)
    // static(객체 생성없이 호출이 가능하다) (나중에)
    // void -> 리턴이 없다
    // [접근제한자] [static유무] [리턴타입] [함수이름]() {}
    public static void greeting(){
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
    } // 메서드 정의

    public static void main(String[] args) {
        System.out.println("함수 호출 전");
        greeting();
        System.out.println("함수 호출 후");
    }
}
