package com.study._33_Factory;

public class Student {
    private String name;
    private int grade;
    private static final Student[] cache =
            new Student[] {
                new Student("홍길동", 1),
                new Student("김철수", 2),
                new Student("이영희", 3)
    };

    /*
    아래의 패턴은 GoF에서 말하는 디자인패턴이 아님!
    - 생성자를 대신하는 정적 메서드 기법 소개
    - 자바에서 기본스펙으로 제공하는 여러 클래스가 이러한 패턴을 따르고 있음
    */

    private Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // 1. of() : 단순하게 생성할 때
    // Student.of("홍길동", 1)
    public static Student of(String name, int grade) {
        return new Student(name, grade);
    }

    // 2. valueOf(): 이름과 학년이 같은 학생이면, 캐싱하는 것 처럼 동일 객체 반환
    public static Student valueOf(String name, int grade) {
        for (Student s : cache) {
            if(s.name.equals(name) && s.grade == grade) {
                return s;
            }
        }
        return new Student(name, grade);
    }

    // 3. newInstance() : 항상 새로운 객체를 반환
    public static Student newInstance(String name, int grade) {
        return new Student(name, grade);
    }

    // 4. from(): 다른 클래스타입에서 변환하여 생성
    public static Student fromStudentDto(StudentDto dto) {
        return new Student(dto.getName(), dto.getGrade());
    }

    // 5. copyOf(): 기존 객체 복사
    // deepCopyOf(): 기존 객체 깊은 복사
    // shallowCopyof(): 기존 객체 얕은 복사
    public static Student copyOf(Student other) {
        return new Student(other.name, other.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
