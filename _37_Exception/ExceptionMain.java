package com.study._37_Exception;

public class ExceptionMain {
    static void method1() {
        System.out.println("method1에서 method2 호출");
        method2();
    }

    static void method2() {
        System.out.println("method2에서 예외 발생!");
        throw new RuntimeException("method2에서 만든 예외");
    }

    public static void main(String[] args) {
        /*
        예외(에러)처리의 목적
        1. 프로그램 비정상 종료를 방지
        2. 오류 상황에 대한 적절 대응(오류 메세지 제공)
        3. 정상 흐름과 예외 흐름 분리
         */
        /*
        예외도 결국 객체다!
        예외 계층
        Throwable(최상위 클래스)
            ㄴ Error (시스템 레벨 오류, 복구 불가)
            ㄴ Exception (애플리케이션 레벨 예외)
                ㄴ Checked Exception
                ㄴ Unchecked Exception(Runtime Exception)

        문법 키워드
        - 예외 발생(생성): throw 예외 클래스 이름
        - 예외 처리(소멸): catch (예외 클래스 이름)
        - 예외 전파: throws
         */
        try {
            throw new Exception("예외 메세지");
            /*
            class Exception
            private String message
            생성자(String message)
             */

            // 예외객체 생성
            // JVM이 메서드 내부에서 try-catch 코드를 탐색
            // 호출 스택을 거슬러 따라가면서 탐색하다
            // 없으면, JVM이 예외를 출력하고 프로그램을 종료시킨다
        } catch(Exception e) { // 내가 처리할 클래스이름 인스턴스 이름
            System.out.println(e.getMessage());
        }

        //예외 전파
        try {
            method1();
            System.out.println("예외 발생하니까 이 코드는 실행 x");
        } catch (RuntimeException e) { // try 안에서 발생한 예외객체만 잡는다.
            System.out.println(e.getMessage());
        } finally {
            // 예외 발생 여부랑 상관업싱 항상 실행되는 영역
            // 자원 정리코드(파일 닫기, 객체 회수, DB 연결 종료)
            System.out.println("예외처리 여부랑 상관없이 실행");
        }
        /*
        stack
        메서드 마다 스택 프레임을 만들어 줌
        stack(main)
        stack(method1)
        stack(method2)
        main -> method1 -> method2(에러발생)! 호출
        mehtod2 -> method1 -> main 순으로 try-catch를 찾음
        세 군데 중 한곳에서 책임지고 try-catch로 에러 객체를 잡아서 처리해 줘야 한다!
         */

    }
}
