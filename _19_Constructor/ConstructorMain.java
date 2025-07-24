package com.study._19_Constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        NoConstructorStudent student1 = new NoConstructorStudent();
        student1.name = "홍길동";
        student1.korean = 90;
        student1.english = 90;
        student1.math = 90;
        // 일일이 필드에 직접 접근해서 초기화 시켜 줘야 함
        Student student2 = new Student("홍길동", 90, 90, 90);
        System.out.println(student2.name);

        Student student3 = new Student("박길동");
        System.out.println(student3.name);

        System.out.println("=".repeat(50));
        Student Student4 = new Student("최길동", 100);
    }
}
