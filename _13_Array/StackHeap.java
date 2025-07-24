package com.study._13_Array;

public class StackHeap {
    public static void main(String[] args) {
        // JVM 메모리(ram)
        // stack + heap + (....)
        // stack : 작지만, 한번에 빠르게 접근가능
        // 원시자료형 값저장, 참조자료형(new로 선언되는 것들)의 메모리주소(heap의) 저장
        // heap : 용량이 크지만, 비교적 느리게 접근, 데이터가 매우 분산
        // JVM이 알아서 메모리 관리/정리(garbage collector)
        // 참조자료형 값/주소

        // 원시자료형 변수들
        int age = 25; // stack에 저장
        double height = 173.5; // stack에 저장
        boolean  isStudent = true; // stack에 저장

        // 현재 stack 상태:
        /*
        ---main 의 stack---
        isStudent : true
        height : 173.5
        age : 25
        ---heap의 영역---
        비어있음
         */

        int[] scores = {85, 90, 70};
        // 현재 stack 상태:
        /*
        ---main 의 stack---
        scores : 0x1000
        isStudent : true
        height : 173.5
        age : 25
        ---heap의 영역---
        0x1000: array에 대한 정보(길이..)
        0x1004: 85
        0x1008: 90
        0x1012: 70
         */

        String name = "홍길동"; //heap에 문자열 생성
        // 현재 stack 상태:
        /*
        ---main 의 stack---
        name : 0x2000
        scores : 0x1000
        isStudent : true
        height : 173.5
        age : 25
        ---heap의 영역---
        0x1000: array에 대한 정보(길이..)
        0x1004: 85
        0x1008: 90
        0x1012: 70
        0x2000: 0x3000
        0x3000: byte[] array에 대한 정보
        0x3001: "홍"(utf-8로 encoding된 16진수)
        0x3002: "길"(utf-8로 encoding된 16진수)
        0x3001: "동"(utf-8로 encoding된 16진수)
         */
    }
}
