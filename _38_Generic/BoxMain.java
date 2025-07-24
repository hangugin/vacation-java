package com.study._38_Generic;

import java.lang.reflect.Method;

public class BoxMain {
    public static void main(String[] args) {
        /*
        제네릭이란?
        - 클래스나 메서드에서 사용한 자료형(타입)을 미리 선언하지 않고,
          사용할 때 결정하는 기능(코드로 작성할 때)
        - <T>, <K, V> 등의 타입 매개변수를 사용
        - 타입도 변수화 해서, 컴파일러가 해석하게 끔 만들어 줌

        용어 정리
        - 타입 매개변수(타입 파라미터): <T>의 T를 의미함
        - 타입 인자: <String> String이 타입인자
         */

        // String 타입 Box로 결정
        Box<String> stringBox = new Box<>("문자열 입니다");
        String str = stringBox.getData();
        System.out.println(str);
        /*
        제네릭 -> 결국 Object로 컴파일 됨
        컴파일러가 알아서 타입검사/ 업캐스팅/ 다운캐스팅 해줌.
        => Runtime에는 결국 Object 취급
         */
        // Object를 상속받는 클래스여만 지정가능
        // -> 원시자료형은 제네릭선언이 불가능
        Box<Integer> intBox = new Box<>(50);
        Integer num = intBox.getData();
        System.out.println(num); // 다운캐스팅 불필요!
        
        /*
        - Object를 사용할 경우
        - 런타임에 데이터 타입이 결정되는 경우
        - 외부로부터 데이터를 받을 때
        
        - 제네릭을 사용할경우:
        - 런타임에 데이터 타입이 지정되는 경우를 제외한 모든 경우
        - 컴파일시점에 타입 지정 -> 형변환 x(타입안정)
        - 잘못된 타입 사용시, 컴파일 오류 발생 ->(타입안정)
         */
        
        /*
        method area > 클래스에 대한 정보가 존재
        클래스 정보를 wrapping한 클래스가 존재한다.
         */
        
        // Class Class가 존재함
        Class strClass = "문자열".getClass();
        System.out.println(strClass.getName());
        for (Method m : strClass.getMethods()) {
            System.out.println(m.getName());
        } // 문자열 클래스의 메서드 이름들을 확인 할 수 있다.
        // 롬복의 원리: 클래스 클래스를 이용해서
        // 컴파일러에게 method area의 정보를 조작
    }
}
