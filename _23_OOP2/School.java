package com.study._23_OOP2;

// entity - database의 table 기준으로 생성된 자바 객체
// entity - 실제 사물 / 관계를 가지는 객체
public class School {

    private String name;
    private Student[] students; // 학생들이 저장 될 배열
    // 1:N 관계 = 학교:학생
    private int studentCount;
    private static final int MAX_STUDENTS = 10; // 최대 정원

    public School(String name) {
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("학교 정원이 꽉 참. 더 이상 등록이 불가능합니다.");
            return;
        }

        // 배열의 빈 자리에 학생 추가
        students[studentCount] = student;
        // 학생 수 증가를 통해 다음 빈자리 위치(index) 저장
        studentCount++;
        // 학교가 -> 학생을 등록 완료
        // 학생이 -> 학교를 등록 아직안함

//        student.setSchool(this);
        // School은 단순히 학생 목록만 관리 하도록
        // 객체지향적 관점에서 학생의 상태는 School 입장에서는 알바가 아니다(책임권한이 없다)
        // 학생과 학교 연결은 또 다른 객체가 수행
        // 객체지향의 설계 원칙중 하나 (5가지 SOLID)
        // SRP:single responsibility principle(단일 책임 원리)
        // 책임: 개발자의 기준
    }

    public String getName() {
        return name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // 특정 인덱스의 학생객체를 반환하는 메서드
    // 배열에 직접 접근해서 가져가지 말고, 메서드로 접근해서 가져가게 설계
    public Student getStudent(int index) {
        if(index >= 0 && index < studentCount) {
            return students[index];
        }
        return null; // 잘못된 인덱스면 null 반환
    }



}
