package com.study._26_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 인스턴스 생성이 불가능하다.
//        GameCharacter character = new GameCharacter();
        // 추상체(추상클래스, 인터페이스) / 구현체(추상메서드들을 구현한 클래스)
        Warrior warrior = new Warrior("타락파워전사");
        Mage mage = new Mage("썬콜법사");


        // 공통메서드
        warrior.showStatus();
        mage.showStatus();

        // 1대1 pvp
        // 같은 attack 메서드지만, 다른 동작 => 다형성
        // 추상클래스는 다형성을 강제하도록 설계되어 있다.
        // Warr
        warrior.attack(mage);
        mage.attack(warrior);

        /*
        객체지향 설계 원칙(SOLID)
        1. S:SRP - 단일책임원칙
        - 하나의 클래스는 하나의 책임만 가진다.
        2. O:OCP(Open CLosed Principle): 개방폐쇄원칙
        - 확장에는 열려있고, 수정에는 닫혀 있어야 한다.
        => 새로운 기능이 추가될때는, 기존코드는 간선받지 않아야 한다.
         */
        /*
        main에서 테스트 코드
        warrior랑 1vs1 테스트코드 작성
        -> showStatus()로 HP상태 확인
        */
        Warrior warrior2 = new Warrior("짜짱전사");
        Acher acher = new Acher("강력궁수");

        warrior2.attack(acher);
        acher.attack(warrior2);

        warrior2.showStatus();
        acher.showStatus();
    }
}
