package com.study._25_Casting;

import com.study._24_Inheritance.Car;
import com.study._24_Inheritance.ElectricCar;
import com.study._24_Inheritance.GasCar;

public class CastingMain {
    public static void main(String[] args) {
        /*
        캐스팅이란?
        - 타입을 변경하는 것
        - 업캐스팅: 자식 -> 부모 타입으로 변경
        - 다운캐스팅: 부모 -> 자식 타입으로 변경


                    컴파일시점       런타임시점
        코드작성 ---> 컴파일 ---> 실행 ---> 종료
        자바의 시점
        1. 컴파일 시점: 실제 컴파일러가 컴파일을 실행하는 시점
        2. 런타임 시점: 프로그램이 실행되고 종료되는 사이 시점

        heap
        [brand | batteryLevel] : 자식객체 메모리
        -> 업캐스팅 batteryLevel를 안읽는다! (가려진다) - 컴파일러 시점
        -> 런타임시점에서는 메모리를 나눠 읽지 않는다.

        method area
        -> 해당 객체의 타입기준으로 호출! (new로 생성한 객체)
        -> 런타임때는 메모리가 구분되지 않기 때문에
        -> 실제 메모리에 올라간(new로 생성된) 객체에 따라서 호출 된다.
         */

        // 자동업캐스팅
        ElectricCar tesla = new ElectricCar("테슬라");
        Car cartesla = (Car) tesla; // 업캐스팅
        Car car1 = new ElectricCar("테슬라2"); // 자동 업캐스팅

        // heap에는 부모/자식 정보가 다 올라감
        // Car(부모)의 영역으로만 제한하겠다.(컴파일러 시점)
        // car1.charge() Car타입에는 없기 때문(컴파일러 시점)
        // 메서드 호출시 해당 객체의 타입기준으로 호출(런타임 시점)
        ElectricCar newTesla = (ElectricCar) car1; // 다운캐스팅
        newTesla.charge();

        // 일시적 다운캐스팅
        ((ElectricCar) car1).charge();
        // 일시적으로 호출시에만 다운캐스팅이 되었다가
        // 호출이 끝나면 다시 되돌아간다.

        Car car2 = new GasCar("현대");
        System.out.println("------");
        car2.move(); // 오버라이드 된 메서드 호출
        // 변수타입 Car <<
        // Car에 정의된 move()가 호출되어야 할 것 같지만
        // 런타임시점에서는 메모리 구분없이, new로 생성된 객체만 고려하기 때문에
        // GasCar의 move()가 호출된다.
        // 동적바인딩: 실제 new로 생성된 객체 타입을 기준으로 메서드가 호출되는 것

        // 다운캐스팅 주의 점
//        ElectricCar wrongCar = (ElectricCar) car2;
        // 런타임 에러가 발생!

        // instanceof 연산자
        /*
        1. 객체가 특정 타입인지 확인해주는 연산자
        2. 실제 객체 타입을 검사해서 true/false를 반환
        3. 상속관계도 고려: 자식객체는 부모타입으로 검사해도true
        4. 인터페이스도 고려: 이식받은 객체는 인터페이스타입으로 검사해도true
         */

        Car[] cars = {
                new ElectricCar("테슬라"),
                new GasCar("제네시스")
        };

        for (Car car : cars) {
            car.move(); // 다형성(공통기능)

            if(car instanceof ElectricCar) {
                ElectricCar eCar = (ElectricCar) car; // 안전한 다운캐스팅
                eCar.charge();
            } else if (car instanceof GasCar) {
                GasCar gCar = (GasCar) car;
                gCar.fillGas();
            }
            // 왼쪽 객체가 오른쪽 타입에 대입이 가능한가?
        }

        Car EV6 = new ElectricCar("기아");
        System.out.println("ev6는 전기차 타입인가?" + (EV6 instanceof ElectricCar));
        System.out.println("ev6는 가스차 타입인가?" + (EV6 instanceof GasCar));


    }
}
