package com.study._34_Builder;

public class Main {
    public static void main(String[] args) {
        /*
        빌더패턴
        필드가 최소 6~8가 넘어갈 경우
        1. 생성자 오버로딩을 많이 해줘야 함.
        2. 내가 원하는 필드만 초기화하려면 오버로딩 해줘야 함
        3. 필드가 많아서 시그니처가 겹치는 경우가 많음
        4. 매개변수 순서가 많이 헷갈림
        */
        Member member = new Member.Builder()
                .age(20)
                .email("java@naver.com")
                .name("자바맨")
                .build();

        MemberLombok memberLombok = MemberLombok.builder()
                .name("롬복맨")
                .email("lombok@gmail.com")
                .age(25)
                .build();

    }
}
