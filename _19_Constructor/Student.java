package com.study._19_Constructor;

public class Student {
    String name;
    int korean;
    int english;
    int math;

    int getTotalScore() {
        return korean + english + math;
    }

    // new로 객체를 만들때 호출되는 메서드가 생성자
    /*
    1. 클래스 이름과 동일해야 한다.
    2. 반환 타입이 없다(void도 쓰지 않음)
    3. 객체 생성시(new 연산) 자동으로 호출
     */
    public Student(String name, int korean, int english, int math) {
        System.out.println("생성자 호출 됨!");
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;

        /*
        this - 객체의 주소
        this는 현재 객체 자신을 가르키는 주소값이다.
        student1.name = "홍길동";
        this.name = "홍길동";

        stack(main)
        student1: 0x0010

        JVM 메모리: stack + heap + method area +....

        - 메서드들은 클래스별로 분류되서 메서드영역에 저장되어있다.
        하나의 클래스에서 생성된 모든 객체는 메서드영역에 한번 기록되어있는 매서드를 돌려쓴다.
        이때 호출한 객체의 주체가 누구인지 구분하기 위해 this를 같이 전달
        각기 다른 객체의 상태일지라도, 같은 메서드를 돌려 쓸 수 있는것.

        method area
        Student---
        getTotalScore : 메서드 시그니처가 기록되어 있음
        ---------
        car---
        engineStart : 메서드 시그니처가 기록되어 있음
        ---------

        student1 -> 주소값을 가지고 메서드영역의 getTotalScore에 전달
        student2 -> 주소값을 가지고 메서드영역의 getTotalScore에 전달
         */
    }

    // 생성자도 오버로딩이 가능 함.
    public Student(String name) {
        System.out.println("이름만 초기화하는 생성자 호출!");
        this.name = name;
    }

    // 이름과 국어 점수만 초기화하는 생성자
    public Student(String name, int korean) {
        this(name, korean, 0, 0);
        // this() != this 아예 상관이 없다. 인도!= 인도네시아
        // 같은 이름의 생성자(오버로딩 된) 호출
        // 제약사항: 생성자의 가장 첫 줄에 적어 줘야 한다.

        System.out.println("이름, 국어점수 생성자 호출!!");
    }

}
