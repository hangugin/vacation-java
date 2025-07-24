package com.study._02_Variable;

public class DataType {
    public static void main(String[] args) {
        /*
        컴퓨터는 모든 데이터 0,1로 저장(2진법)
        1bit = 2진수 1자리 -> 2개의 데이터 표현 가능
        2bit -> 4개의 데이터 표현 가능
        8bit = 1byte -> 2^8 -> 256개 데이터 표현 가능
        32bit = 4byte -> 2^32 -> 42억개의 데이터 표현 가능
         */

        // 정수타입(숫자)
        byte smallNum = 127; // 1byte -> 256: -128 ~ +127
        short mediumNum = 32000; // 2byte
        int normalNum = 200000000; // 4byte -> 21억
        long bigNum = 3_000_000_000L; // 8byte
        // 맨 앞 1bit는 부호(+/-)에 사용
        // int의 경우: 31bit 숫자, 1bit 부호

        // 실수타입(숫자)
        float smallPrecision = 3.1415F; //4byte, 소수점 7자리
        double highPrecision = 3.1415292; //8byte, 소수점 15자리

        // 문자타입(character)
        char char1 = 'A';
        char char2 = 65 + 1; // 아스키코드 -> 'B' : 시험에 잘나온다
        System.out.println(char1);
        System.out.println(char2);

        // 문자열(문자들의 집합)
        String str = "안녕하세요";
        String name = "홍길동";

        // 논리형(true, false)
        boolean isEmpty = true;
        boolean isAdult = true;
        boolean hasError = false;
        boolean canDrive = true;
    }
}
