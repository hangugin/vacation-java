package com.study._36_Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Enum으로 부터 상속받은 메서드
        // values(): 모든 Enum 인스턴스들을 반환(배열)
        Grade[] values = Grade.values();
        System.out.println("values: " + Arrays.toString(values));

        // String -> Enum
        Grade gold = Grade.valueOf("GOLD");
        System.out.println(gold == Grade.GOLD);

        // Enum -> String
        String nameOfGold = Grade.GOLD.name();
        System.out.println(nameOfGold);

        // 미리 선언해둔 상수인스턴스 말고, Enum으로 변환할 경우
        // DB에서 가져온 데이터(String) -> Enum 변환
        /*
        public class User {
            private "String" grade;
        }

        Grade userGrade = Grade.valueOf(user.getGrade());
        // 여기서 user.getGrade()값이 Enum에 없는 인스턴스 이름이라면, 에러 발생!
         */
    }
}
