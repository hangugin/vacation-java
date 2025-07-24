package com.study._26_Abstract;

public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 80, 40);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + "가 " + target.getName() + "에게 파이어볼을 날립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + " 데미지를 받았습니다.");
    }
}
