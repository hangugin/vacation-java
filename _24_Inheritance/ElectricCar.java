package com.study._24_Inheritance;

public class ElectricCar extends Car{
    /*
    상속은 extends 키워드로 받는다.
    자식클래스는 부모의 모든 public / protected로 선언된 필드를 사용할 수 있다.
    move(), openDoor()... 자동으로 사용이 가능

    Heap 메모리 (필드값들이 로딩)
    자식객체 생성시
    객체 -> [부모필드 정보 | 자식필드 정보] 같이 생성됨
    // 1. 실제로는 구분되어 있지 않습니다. -> JVM이 구분해서 읽을 뿐
    // 2. 부모필드의 private도 메모리에 올라간다.(접근이 안됨)

    Method Area(클래스 정보 로딩)
    메모리가 클래스마다 구분
    프로그램 실행시
    -- 부모 클래스 --
    부모 클래스에 정의 된 메서드 정보(시그니처)
    기타 부모클래스에 대한 정보...
    -- 자식 클래스 --
    자식 클래스 정의 된 메서드 정보(시그니처)
    기타 자식클래스에 대한 정보...
    부모 클래스가 누군지 write
     */

    private int batteryLevel;

    // [brand | batteryLevel]
    // super() -> brand initialize
    // batteryLevel initialize
    public ElectricCar() {
        super(); // 부모의 기본 생성자를 호출 (생략 가능: 없으면 자동으로 호출됨)
        System.out.println("전기Car 생성자 호출!");
        this.batteryLevel = 100;
    }

    public ElectricCar(String brand) {
        super(brand); // 생략시 기본생성자 호출(super()) 호출
        System.out.println("전기Car 생성자 호출!");
        this.batteryLevel = 100;
    }

    // 자식에게만 있는 메서드
    public void moveWithInfo() {
        // 부모의 기본 move() + 추가정보
        super.move(); // 부모의 메서드를 super.를 통해 참조하여 호출
        System.out.println("현재 배터리 잔량: " + batteryLevel);
    }

    /*
    this => 현재 heap메모리에 있는 개체 자신의 주소
    super. => 부모의 메서드 / 필드 호출
    엄밀히 말하면 super.은 객체 참조가 아닙니다.
    [brand | batteryLevel]
    super.필드 => heap영역에서 부모 영역만 탐색해서 읽어라
    super.메서드() => 메서드영역에서 자식클래스 말고, 부모클래스 기준으로 찾아서 호출해라
    super.필드 = ++a;
    this.필드 = ++a;
     */

    public void showDetailInfo() {
        super.showInfo(); // 부모의 메서드 호출
        System.out.println("배터리 잔량: " + batteryLevel);
        System.out.println("차종: 전기차");
    }

    // 전기차 고유의 메소드
    public void charge() {
        System.out.println("완충상태까지 충전합니다.");
        this.batteryLevel = 100;
    }
}
