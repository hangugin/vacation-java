package com.study._21_Static;

public class StaticMethod {
    private int instanceValue;
    private static int staticValue;

    public static void staticMethod() {
        staticValue++;
        // instanceValue++; 컴파일 에러!
        // instanceMethod(); 컴파일 에러!
    }

    public void instanceMethod() {
        staticValue++;
        instanceValue++;
    }

    /*
    method area -> 클래스가 로딩(프로그램 실행시)될때 메모리에 올라간다
    static 변수와 static 메서드들은 프로그램이 시작되면 이미 메모리에 존재

    instance 변수
    객체가 생성될때(new 연산자 실행 시점) heap 메모리에 올라간다.
    -> 즉, 객체가 없으면 메모리에 존재하지 않는다.

    instance 메서드
    클래스 로딩시 method area에 로딩 됨.
    메서드 호출시 호출한 객체의 주소를 this로 전달해야함
    this를 필요로 한다. -> 객체가 생성되기 전에 this 값이 없어요
    단순히 정보가 메모리에 있다는 것만으로는 호출이 불가능 하다.
     */
}
