package com.study._27_Interface;

public interface Swimmable {
    void swim();
    /*
    SOLID 에서 I에 해당하는 원칙
    Interface Segregation Principle(인터페이스 분리 원칙)
    - 구현체는 자신이 사용하지 않는 메서드에 의존하면 안된다.
    Animal에 swim, fly를 정의해버리면, Dog클래스도 fly를 강제구현해야 함
    필요한 기능끼리 적절히 분리해서 여러 인터페이스로 나눈 뒤,
    다중상속으로 적절히 조합해서 사용해라!

    solid 원칙을 반드시 지켜야 하는가?
    상황마다 다릅니다.
     */
}
