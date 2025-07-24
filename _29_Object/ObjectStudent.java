package com.study._29_Object;

import java.util.Objects;

public class ObjectStudent {
    /*
    Object 클래스 - 자바의 모든 클래스의 최상위 부모 클래스
    자바에서 모든 클래스는 명시적으로 다른 클래스를 상속하지 않으면,
    자동으로 Object 클래스를 상속받는다.
    -> Object가 가지고 있는 기본적인 메서드를 사용가능, 오버라이딩이 가능
     */

    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    toString() 메서드
    sout() -> 출력
    sout메서드 내부에서 객체가 매개인자로 들어오면
    객체의 객체.toString()을 호출해서 반환받은 값을 사용한다.

    클래스이름 + "@" + 16진수메모리주소

    toString()의 역할:
    객체의 상태(필드) 정보를 문자열로 표현하는 역할

    - 디버깅시 객체 상태 확인
    - 로깅목적
     */

    @Override
    public String toString() {
        return "ObjectStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    equals()

    동일성(메모리 주소가 같냐): 물리적으로 같은 객체인가?
    동등성(논리적으록 같냐): 논리적으로 같은 객체인가?

    Object의 구현:
    return (this == obj) // 동일성을 따진 것

    1. 메모리주소 따질때 -> == 연산자 사용
    2. 논리적으로 같은 객체인가? -> equals()를 오버라이딩해서 사용

    equals()를 구현할때 반드시 지켜야할 규약
    1. x.equals(x)는 항상 true여아한다.
    2. x.equals(y)가 true면 y.equals(x)도 true여야 한다.
    3. x.equals(y)가 true고, y.equals(z)가 true면, x.equals(z)도 true다
    4. 객체상태가 변경되지 않는한 여러번 호출해도 결과가 동일해야한다. 필드를 넣을때 상태가 불변한것만 고려
    5. x.equasl(null)은 항상 false를 반환해라
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ObjectStudent that = (ObjectStudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    // 컬렉션 프레임워크때 설명(나중에)
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
