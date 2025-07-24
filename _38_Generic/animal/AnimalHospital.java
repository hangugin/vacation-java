package com.study._38_Generic.animal;

public class AnimalHospital<T extends Animal> {
    /*
    <T extends Animal>: 타입 매개변수 상한 경계
    - T는 Animal 타입이거나, Animal을 상속받는 타입이어야 한다.
    - Animal의 메서드들을 사용할 수 있다.(다형성)

    - 컴파일 시점 / 런타임 시점
    - 컴파일 시점 -> 컴파일러 기준 생각
    - 런타임 시점 -> JVM 기준 생각
    업캐스팅/다운캐스팅 -> 런타임(JVM은 메모리만 고려-> new로 생성한 객체)
    변수타입 -> 컴파일시점(변수타입만 고려)
    Object o = new String("str");

     */
    private T animal;

    // T 타입의 동물들만 등록 가능
    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getBigger(T animal1, T animal2) {
        return animal1.getSize() > animal2.getSize() ? animal1 : animal2;
    }

    public T getAnimal() {
        return animal;
    }

    public void checkUp() {
        System.out.println("동물이름: " +  animal.getName());
        System.out.println("동물크기: " + animal.getSize());
        System.out.println("동물소리:");
        animal.sound();
    }
}
