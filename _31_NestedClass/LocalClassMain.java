package com.study._31_NestedClass;

public class LocalClassMain {
    public static void main(String[] args) {
        // 지역 클래스
        /*
        - 메서드 내부에서 정의된 클래스
        - 해당 메서드 내부에서만 생성, 사용 가능
        - 바깥 클래스 멤버에 접근 가능
         */
    }

    public static void printTotal(int a, int b) {

        // 지역 클래스
        class Calculator {
            int add(int x, int y) {
                return x + y;
            }
        }

        // 지역클래스는 이 메서드 내부에서만 쓸 수 있다.
        Calculator calc = new Calculator();
        System.out.println("합계: " + calc.add(a, b));

    }

    /*
    왜 쓸까? 이제 안씀
    자바에서는 메서드가 클래스 없이 단독으로 존재할 수 없음(너무 OOP스러운 언어)
    메서드 안에서 메서드를 정의해서 쓰고 싶다!(1.1~1.2)
    지역클래스라는 임시천막같은 클래스를 만들어서 어떻게든 써보려고 만들어낸 문법

    // 자바 8부터 "람다" 출현 -> 메서드 안에서 메서드를 구현 할 수 있게 됨
    -> 사실상 지역클래스는 안쓰는 문법이 됨
    deprecated

     */
}
