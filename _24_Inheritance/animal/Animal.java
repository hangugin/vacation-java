package com.study._24_Inheritance.animal;

// 부모 클래스
public class Animal {
    protected String name;
    protected int age;

    public Animal() {
        this.name = "이름없음";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void getOld() {
        System.out.println(name + "이 한살 나이를 먹습니다.");
        age++;
    }
    
    public void eat() {
        System.out.println("동물이 음식을 먹습니다.");
    }
    
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
    }
    
}
