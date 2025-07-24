package com.study._26_Abstract;

public abstract class GameCharacter {
    /*
    추상 클래스: 추상메서드를 하나 이상 포함하는 클래스
    - 객체 생성이 불가능
    추상 메서드:
    메서드의 시그니처만 작성하고, 구체적인 구현은 없는 메서드
    상속받는 클래스는 이 추상메서드를 반드시 구현해야 함(강제)
     */

    protected String name;
    protected int HP;
    protected int attackDamage;

    public GameCharacter(String name, int HP, int attackDamage) {
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }

    // 일반메서드 - 상속받는 클래스가 모두 공용으로 사용가능
    public void showStatus() {
        System.out.println(name + ": " + HP);
    }

    public void receiveDamage(int damage) {
        HP -= damage;
        if(HP <= 0) {
            HP = 0;
            System.out.println(name + "이 쓰러졌습니다.");
        }
    }

    // 추상메서드
    // 시그니처만 정의 됨. 메서드의 바디({})는 상속받은 클래스에서 구현
    // 상속받게 되면 강제로 구현해야 함
    public abstract void attack(GameCharacter target);

    public String getName(){
        return name;
    }
}
