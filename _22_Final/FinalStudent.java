package com.study._22_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // 생성자를 통해 반드시 초기화(final 필드)
    public FinalStudent(String name, int age, int studentId) {
        this.age = age;
        this.name = name;
        this.studentId = studentId;
    }

    // final 파라미터: 외부에서 받은 값을 변경하지 않겠다
    public void printSchool(final String schoolName) {
//        schoolName = "자바대학교"; 컴파일 에러
        System.out.println("대학교 이름: " + schoolName);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // setter도 final 필드에 대해서는 정의할 수 없다
//    public void setName(String name) {
//        this.name = name;
//    }
    public void printInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

}
