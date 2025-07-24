package com.study._27_Interface;

public class Main {
    public static void main(String[] args) {
        /*
        인터페이스: 자바에서 구현할 수 있는 최상위 추상 레벨의 .class파일
        1. 필드가 존재하지 않는다. -> 상태가 존재하지 않는다
        (다만, 상수는 선언이 가능하다)
        2. 모든 메서드가 추상메서드로만 정의
        = 메서드 시그니처만 정의 함
        => "~~한 기능을 가지고 있다"라는 명세만 정의
        3. 객체생성이 불가능, 생성자 정의도 x
            -> 다중상속이 가능하다
            // 기존에는 다중상속시 문제가 발생
            // class A String a; class B String a;
            // 어떤 부모의 필드를 물려받을지 명확하지 않음

        "구현체 ~ 추상체" 구분
        클래스:  완전한 구현체
        추상클래스: 구현체 ~ 추상체(중간지대
        인터페이스: 추상체(주로 쓰임)

        추상클래스가 그럼에도 쓰이는 이유
        : 공통상태가 필요한 경우가 분명히 존재하기 때문
         */

        Dog dog = new Dog();
        Duck duck = new Duck();

        Animal[] animals = {dog, duck};
        for (Animal animal : animals) {
            animal.sound(); // 각각 같은 sound()메서드지만, 다른 동작
        }

        AnimalManager manager = new AnimalManager();
        manager.testSwimming(duck);
        manager.testSwimming(dog);

        // 자바에서 메서드 호출 -> 런타임에서 일어남
        // 메서드를 고르는 기준이 동적으로 결정된다.
        // Dog클래스 - Animal, Swimmable
        // 이 두가지 정보 Method Area에 이식받은 정보가 기록되어 있음
        // Animal파라미터로 받았을 지라도 Dog -> Animal로 취급되고 있는상태(캐스팅)
        // Animal의 메서드가 호출된게 아니라, Dog의 오버라이딩된 메서드가 호출 됨.
        // 실제 객체타입(new로 생성된)의 메서드를 호출하기 때문
    }
}
