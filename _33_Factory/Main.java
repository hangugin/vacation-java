package com.study._33_Factory;

public class Main {
    public static void main(String[] args) {
        Student s1 = Student.of("김철수", 2);
        System.out.println(s1);

        Student s2 = Student.valueOf("홍길동", 1);
        Student s3 = Student.valueOf("홍길동", 1);
        System.out.println("s2 == s3: " + (s2 == s3));

        StudentDto dto = new StudentDto("박영수", 3);
        // from다른클래스, to다른클래스타입, parse다른클래스타입
        Student s4 = Student.fromStudentDto(dto);

        // 값만 복사한 다른 객체생성
        Student s5 = Student.copyOf(s2);
        // 값 확인
        System.out.println(s5);
        System.out.println("s1 == s5: " + (s1 == s5));
    }
}
