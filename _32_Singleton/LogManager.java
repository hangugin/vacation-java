package com.study._32_Singleton;

public class LogManager {
    /*
    디자인패턴 : Singleton, Builder
    패턴: Factory
    -> 객체를 조작하는 방법(패턴)

    // 싱글톤
    : 단 하나의 인스턴스만 생성하여 공유하도록 하는 패턴
    객체를 여러번 만들지 않고(new x) 한번만 만들고 재사용

    1. 필드로 private static instance;
    2. 생성자가 private 접근제어자로 막혀 있어야 한다.
    3. public static getInstance() 메서드로 객체를 만들고, 반환한다.
     */

    // 인스턴스를 담아둘 static 필드(전역에서 공유)
    private static LogManager instance;

    private LogManager() {} // 생성자를 private로 막아서 외부에서 new 금지

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager(); // 생성해서 넣어 준다.
        } // if문에 걸린다면 최초 호출
        return instance; // 그 다음 호출부턴, 이전에 생성했던 instance를 그대로 반환
    }

    public void log(String msg) {
        System.out.println("log: " + msg);
    }

    // 참고: 스프링 프레임워크에서는 객체를 싱글톤으로 관리 함.
    // 요청을 받을때마다, new로 메모리에 새로운 객체를 띄운다.
    // 주로 기능적인 서비스, 레파지토리 클래스들을 하나의 객체로 만들어서 돌려 쓰게 됨.
    // -> 그걸 템플릿화 한게 스프링 프레임워크!

}
