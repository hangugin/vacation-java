package com.study._31_NestedClass.anonymous;

public class Main {
    public static void main(String[] args) {
        /*
         익명 클래스:
         - 이름이 없는 클래스
         - 클래스 정의와 동시에 인스턴스 생성
         - 인터페이스, 추상클래스를 구현하여서 한번 쓰고 버려질 클래스
         - 일반 클래스 처럼 메서드영역, 힙 두군데 모두 메모리가 정상적으로 로드 됨.
         */

        // 변수타입 -> Hello
        // 객체타입 -> Hello가 아니다. -> 익명1
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("하이");
            }

            @Override
            public void bye() {
                System.out.println("바이");
            }
        };

        hello.hello();
        hello.bye();

        // 익명 클래스의 이름 확인
        // 익명1...익명2...
        System.out.println(hello.getClass().getName());

        // 추상 클래스도 익명클래스 만들 수 있다!

        // 람다: 익명클래스의 파생 문법
    }
}
