package com.study._12_TypeCasting;

public class Overflow {
    public static void main(String[] args) {

        // int 범위 : 약 0 ~ 21억

        long maxIntValue = 2_147_483_647L; // int 최댓값
        long overIntValue = 2_147_483_647L; // int 최댓값 + 1

        int intValue1 = (int) maxIntValue;
        System.out.println(intValue1);
        
        //오버플로우
        int intValue2 = (int) overIntValue;
        System.out.println(intValue2);
        
        // 명시적으로 형변환시 주의해야한다.
        // 아무리 출발하는 서비스가 작더라도, long 고려하자

    }
}
