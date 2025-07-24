package com.study._24_Inheritance.animal;

public class Cat extends Animal{
    private String color;

    public Cat() {
        super();
        this.color = "회색";
    }

    public Cat(String color, String name, int age) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("고양이가 사료를 먹습니다");
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 털색: " + color);
    }

    public void meow() {
        System.out.println(name + "가 야옹이라고 말합니다");
    }
}
