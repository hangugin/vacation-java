package com.study._21_Static;

public class StaticMain {
    public static void main(String[] args) {
        /*
        JVM 메모리 = stack + heap + method area + ...
        method area(메서드 영역)
        - 클래스의 정보를 저장하는 메모리 영역
        - 클래스의 정보(메서드 정보 + static 변수 정보)
        - 메서드 정보들이 저장되어 있어서 객체가 메서드를 호출하면, this(객체의 주소) 를 전달해서 작동
        this(객체의 주소) 를 전달해서 작동

         */

        StaticData data1 = new StaticData(1);
        StaticData data2 = new StaticData(2);
        StaticData data3 = new StaticData(3);

        System.out.println("count1: " + data1.count);
        System.out.println("count2: " + data2.count);
        System.out.println("count3: " + data3.count);
        /*
        count는 인스턴스 변수이므로 각 객체마다 따로 존재
        각 객체가 생성될때 각자 0 -> 1 증가
         */

        System.out.println("instanceCount: " + StaticData.instanceCount); // 권장
        System.out.println("instanceCount: " + data1.instanceCount); // 비권장
        /*
        instanceCount는 static 변수 (클래스 변수)
        StaticData 클래스 전체에서 하나만 존재하며 모든 인스턴스가 공유
        생성자가 호출될때마다 1씩 증가하여 0 -> 1 -> 2 -> 3

        권장/비권장: 인스턴스변수인지 클래스변수인지 확실히 하기 위해서 클래스로 접근하는것이 권장
         */
    }
}
