package com.study._26_Abstract;

public class Acher extends GameCharacter {
    /*
    1. 체력 100, 공격력 25
    2. 기본공격: 관통화살을 시전합니다 출력!

    main에서 테스트 코드
    warrior랑 1vs1 테스트코드 작성
    -> showStatus()로 HP상태 확인
     */

    public Acher(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + "가 " + target.getName() + "에게 관통화살을 시전합니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + " 데미지를 받았습니다.");
    }
}
