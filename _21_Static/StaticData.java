package com.study._21_Static;

public class StaticData {
    private int id;

    // 인스턴스(객체) 변수: 각 인스턴스 만다 별도로 존재(heap 존재)
    // 인스턴스마다 개별 값을 가지므로 공유되지 않음.
    public int count;

    // static변수(클래스 변수): StatiData 클래스에서 단 하나로만 존재(method area 존재)
    // StaticData로 부터 생성된 모든 인스턴스가 값을 공유함.
    public static int instanceCount;

    public StaticData(int id) {
        instanceCount++; // 클래스 단위 변수 -> 이 클래스에서 생성된 인스턴스의 총 수를 누적 기록
        count++; // 인스턴스 변수 -> 각 인스턴스에서만 영향을 받는다.
        this.id = id;
    }
}
