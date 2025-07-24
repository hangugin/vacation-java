package com.study._29_Object;

public class Main {
    public static void main(String[] args) {
        ObjectStudent student = new ObjectStudent("홍길동", 20);
        System.out.println(student);
        // 매개변수로 Object를 받는다
        // 자바에 존재하는 모든 객체들을 다 매개변수로 받을 수 있게 됨
        // 메서드 내부에서 ininstance 연산자를 사용해서 내가 원하는 객체만 작동시킬수 있어요
        // 권장되는 설계가 아닙니다!
        // 객체를 만든 이유가 사라짐. -> 권장되지 않는다.


    }
}
