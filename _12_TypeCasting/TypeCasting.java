package com.study._12_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 = 데이터 타입을 다른 타입으로 변경하는 것
        // 큰 -> 작은 : data가 넘칠 수 있다(데이터 유실가능성)
        // 작은 -> 큰 : 데이터 유실 가능성이 없음 -> 자동 형변호나

        // 작은범위 -> 큰범위(자동형변환)
        int intValue = 10;
        long longValue; //
        double doubleValue;

        longValue = intValue;
        doubleValue = intValue;
        System.out.println("long 변환: " + longValue);
        System.out.println("double 변환: " + doubleValue);

        // 큰범위 -> 작은범위
        doubleValue = 1.5;
        // 자동 형변환 불가능

        intValue = (int) doubleValue; // 명시적 형변환
        // 명시적으로 형변환시, 데이터 유실 조심
        System.out.println("소숫점 사라짐: " + intValue);

        // 자바 연산 형변환 규칙
        // 1. 같은 타입연산 -> 결과: 같은 타입
        // 2. 다른 타입연산 -> 결과: 더 큰 범위 타입을 자동 형변환 됨

        intValue = 1;
        doubleValue = 1.5;
        System.out.println(intValue + doubleValue);

    }
}
