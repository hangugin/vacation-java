package com.study._23_OOP2;

public class Student {

    private String name;
    private int grade;
    private School school; // N:1 관계

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // setter를 통해서 학교와 학생을 연결
    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    // 객체간 상호작용: 참조를 통해 상호작용
    public School getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
        String schoolName = school != null ? school.getName() : "없음";
        System.out.println("학교: " + schoolName);
    }
}
