package com.study._26_Abstract;

public class Warrior extends GameCharacter{
    public Warrior(String name) {
        super(name, 120, 25);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + "가 " + target.getName() + "에게 무식하게 때립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + " 데미지를 받았습니다.");
    }

    // 파라미터로 구체적인 클래스를 받는게 아니고,
    // 추상체를 파라미터로 전달 받음
    // -> 설계시, 구체적인 클래스에 무관하게 설계가 가능
    // 다른직업들을 모른다. -> 구체적인 클래스에 의존하지 않는다.
}
