package com.study._23_OOP2;

public class Main {
    public static void main(String[] args) {
        // 객체생성
        Student s1 = new Student("홍길동", 1);
        Student s2 = new Student("김길동", 1);
        Student s3 = new Student("박길동", 1);

        School school = new School("자바 학교");
        Service service = new Service();

        // 서비스를 통해 인스턴스간 관계 설정
        service.register(s1, school);
        service.register(s2, school);
        service.register(s3, school);

        s1.printInfo();
        service.printAllStudents(school);
    }
}
