package com.study._02_Variable;

public class PersonInfo {
    public static void main(String[] args) {
        // 개인정보를 적절한 타입으로 저장
        /*
        name : 이름
        birthYear : 태어난 연도
        height : 키(소수점 한자리)
        bloodType : 혈액형
        isStudent : 학생여부
         */
        String name = "강태원";
        int birthYear = 2002;
        double height = 174.2;
        char bloodType = 'B';
        boolean isStudent = true;

        // 정보 출력
        System.out.println("=== 개인정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("태어난 연도 : " + birthYear);
        System.out.println("키 : " + height);
        System.out.println("혈액형 : " + bloodType);
        System.out.println("학생여부 : " + isStudent);
    }
}
