package com.study._33_Factory;

public class StudentDto {
    /*
    DTO(data transfer object)
    - 역할: 데이터를 "운반"하는 역할.
    - 단순한 데이터 객체, 로직이 없음
     */

    private String name;
    private int grade;

    public StudentDto(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
