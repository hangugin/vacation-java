package com.study._38_Generic.wildcard;

import com.study._38_Generic.Box;

public class TypeErasureMain {
    public static void main(String[] args) {
        /*
        타입 이레이져
        -> 컴파일 완료시, 제네릭 타입 정보가 제거되는 특성
        - 런타임시 Object로 변함
         */

        Box<String> stringBox = new Box<>("문자열");
        Box<Integer> integerBox = new Box<>(100);

        // stringBox.setData(1234); // 컴파일 에러(컴파일 시점)

        System.out.println(stringBox.getClass().getSimpleName());
        System.out.println(integerBox.getClass().getSimpleName());
        System.out.println(stringBox.getClass() == integerBox.getClass());

        // 런타임에 제네릭타입 데이터가 Object로 전환 되는가?
        try {
            System.out.println(stringBox.getClass()
                    .getDeclaredField("data").getType());
            System.out.println(integerBox.getClass()
                    .getDeclaredField("data").getType());
        } catch (NoSuchFieldException e) {

        }

        /*
        Box<String> -> Box
        Box<Integer> -> Box
        T -> Object

        : 제네릭 정보는 컴파일 시점에만 존재, 컴파일러에게 정보를 전달하기 위해 정의 하는 것
         */

    }
}
