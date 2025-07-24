package com.study._38_Generic.wildcard;

import com.study._38_Generic.Box;
import com.study._38_Generic.animal.Animal;
import com.study._38_Generic.animal.AnimalHospital;

public class WildCardMain {
    /*
    와일드 카드
    - 제네릭 타입에서 구체적인 타입대신 '?'를 사용하는 문법
    - 타입을 유연하고 범용성을 높인다(다형성) -> 주로 메서드 매개변수에서 사용 됨

    종류
    <?> : 어떤타입이든 허용하겠다. 다만 읽기만 가능하다. (비제한 와일드카드)
    <? extends T> : T의 하위 타입만 허용하겠다. 읽기만 가능하다. (상한 경계 와일드카드)
    <? super T> : T의 상위 타입만 허용하겠다. 쓰기 전용 (하한 경계 와일드카드)
    -> 메모리적으로 허용이 된다 / 안된다 기준이 아니라
    -> 컴파일러 기준으로 생각

    컴파일러에게 업캐스팅/다운캐스팅/다형성구현 모두 일임하기 위한 문법
     */

    // <?> : 비제한 와일드카드타입 매개변수 메서드
    public static void printAnyBox(Box<?> box) {
        box.getData(); // 읽기 가능 -> Object.getData();
        // box.setData("dfdfdf"); // 컴파일 오류
    }

    // <? extends T>: 상한경계 와일드카드타입 매개변수 메서드
    public static void checkWildCard(AnimalHospital<? extends Animal> hospital) {
        hospital.checkUp(); // 읽기는 가능(컴파일 에러 x)
        // hospital.setAnimal(new Dog("강아지", 5));
        // 실제 hospital의 타입이 Dog인지, Cat인지 보장할 수 없다. -> 컴파일 에러
    }

    // <? super T>: 하한경계 와일드카드타입 매개변수 메서드
    // Animal 또는 그 하위타입(Cat, Dog)을 Box<Object> 혹은 Box<Animal>에 안전하게 넣을 수 있다.
    public static void addAnimalToBox(Box<? super Animal> box, Animal animal) {
        box.setData(animal); // 쓰기가 가능
        Object o = box.getData(); // 읽기는 Object로만 가능하다
    }

    public static void main(String[] args) {

    }
}
