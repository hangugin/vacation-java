package com.study._22_Final;

public class FinalMain {
    public static void main(String[] args) {
        // final: 반드시 "한번"만 "초기화" 되어야 함!

        final int data1; // 선언
//        System.out.println(data1); 초기화 전엔 컴파일러가 에러를 뱉음
        data1 = 10; // 초기화
//        data1 = 20; // 이미 한번 초기화 되었음

        FinalStudent st1 = new FinalStudent("김자바", 2025001, 20);
        st1.setAge(21);
        final FinalStudent st2 = new FinalStudent("이자바", 2025002, 20);
//        st2 = new FinalStudent("qkrwkqk", 20205003, 20); 컴파일 에러
        st2.setAge(21);

        // 결론: final은 stack에 있는 변수가 저장하고 있는 값(원시값, 참조형 주소)
                // 변경하지 못하게 막는 기능
    }
}
