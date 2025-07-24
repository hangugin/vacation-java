package com.study._27_Interface;

public class AnimalManager {

    /*
    인터페이스 타입으로 매개변수를 받는다.
    결합도: 클래스간의 의존 정도(척도)

    결합도가 낮다 -> 구체적인 클래스에 의존(구현체) -> 유연하지 못하다.
    결합도가 높다 -> 인터페이스 / 추상체에 의존 -> 유연하다.

    의존한다:
    1. 필드로 선언된 경우
    2. 정의된 메서드의 파라미터에 선언된 경우

    [구현체] -> [추상체] <- [구현체]
    SOLID
    DIP(Dependency Inversion Principle) : 의존성 역전 원칙
    - 추상체는 구체적인 것에 의존하면 안된다.
    - 구체적인 것이 추상체에 의존해야 한다.

    장점
    1. 유연한 설계
        - 확장이 쉽다.(새로운 동물이 추가되도, AnimalManger는 추가코드 x)
        - 변경이 안정적.(Dog의 내부 구현이 바뀌어도, AnimalManger는 변경코드 x)

    2. 테스트가 용이(가짜객체를 만들기 쉽다)
     */

    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void testFlying(Flyable flyable) {
        flyable.fly(); // fly() 오버라이딩 된 메서드가 호출 -> 강제로 다형성이 구현
    }

    public void testSwimming(Swimmable swimmable) {
        swimmable.swim();
    }
}
