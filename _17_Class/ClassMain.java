package com.study._17_Class;

public class ClassMain {
    public static void main(String[] args) {
        /*
        클래스 -> 새로운 참조 자료형을 정의 한 것
        학생점수 클래스로 관리한다고 생각

        (학생이름, 국어점수, 영어점수, 수학점수) -> 한 셋트
        데이터 셋트를 정의 해 주는것이 클래스
         */

        Student student1; // Student 타입의 student1 변수 선언 -> stack에 student1 생성
        student1 = new Student();
        // Student클래스 객체를 생성 -> heap에 빈 메모리 공간(객체) 생성
        // student1에 대입 -> heap의 메모리 주소값을 복사해서 대입

        student1.name = "홍길동";
        student1.korean = 90;
        student1.english = 90;
        student1.math = 90;
        // heap에 생성된 빈 객체 내부 필드에 값들이 대입 됨
        // student1.name < 의미?
        // "student1의 name 이 저장하고 있는 값"
        // arr[1] -> arr의 1 index에 접근 -> 저장하고 있는 값을 확인

        /*
        stack (main)
        student : null -> 0x1000

        heap
        0x1000 : Student 객체 정보
        0x1010 : 0x2000(홍길동 문자자료형 heap 주소)
        0x1014 : korean = 90
        0x1018 : english = 90
        0x101C : math = 90

        0x2000 : 홍길동 문자열 객체 arr[]
        0x2004 : "홍"
        0x2008 : "길"
        0x200C : "동"
        */

        System.out.println("이름: " + student1.name);
        System.out.println("국어: " + student1.korean);
        System.out.println("영어: " + student1.english);
        System.out.println("수학: " + student1.math);

        Student student2 = new Student(); // 선언 및 생성 동시에

        /*
        null 이란?
        참조형 변수가 아무런 객체도 연결되지 않은 상태(주소값이 없는 상태)
        stack에서 0x0010같은 주소값이 할당 되어 있어야 하는데,
        아직 할당되지 않았거나, 의도적으로 연결이 끊어진 경우
        현재 가르키는 주소가 없다는 의미로 null이라 표현
        -> 가장 많이 만나게 될 에러: "nullPointException"
         */

        System.out.println(student2.name); // 참조자료형 -> 기본값: null
        System.out.println(student2.math); // 원시자료형 -> 기본값: int, double: 0

        /*
        결론 : 객체랑 인스턴스는 같은 말이다.
        관점1
        객체: 클래스로 부터 만들어진 데이터 메모리 실체(물리적 실체)
        인스턴스: 객체가 특정 클래스의 소속임을 명확히 해주는 용어
        student1은 Student 클래스의 인스턴스다

        관점2
        객체: 논리적 설계에서 쓰이는 개념
        인스턴스: 실제 프로그램 구동시에 생성되는 실체

        student1, student2는 객체다.(o)
        student1, student2는 인스턴스다.(o)
        student1, student2는 Student 클래스의 인스턴스다.(o)
        student1, student2는 Student 클래스로 만들어진 객체다.(o)

        Student는 객체다(x) -> Student는 클래스이다(o)
         */

        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2023;

        Car car2 = new Car();
        car2.brand = "현대";
        car2.model = "아반뗴";
        car2.year = 2022;

        Car car3 = new Car();
        car3.brand = "테슬라";
        car3.model = "모델S";
        car3.year = 2024;
        Car[] cars = {car1, car2, car3}; // 배열로 관리

        for (Car car : cars) {
            System.out.println(car.brand + "-" + car.model + "-" + car.year);
        }

        // 클래스 -> 개발자가 직접 정의하는 커스텀 참조자료형이다!

    }
}
