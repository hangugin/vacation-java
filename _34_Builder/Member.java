package com.study._34_Builder;

public class Member {
    /*
    빌더패턴
    필드가 최소 6~8가 넘어갈 경우
    1. 생성자 오버로딩을 많이 해줘야 함.
    2. 내가 원하는 필드만 초기화하려면 오버로딩 해줘야 함
    3. 필드가 많아서 시그니처가 겹치는 경우가 많음
    4. 매개변수 순서가 많이 헷갈림
     */
    private String name;
    private int age;
    private String email;

    public Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // 정적 메서드로 Builder 인스턴스 반환
    public static  Builder builder() {
        return new Builder();
    }

    public static class Builder { // 바깥 클래스의 setter 역할하는 클래스
        // 바깥 클래스 필드를 똑같이 가진다
        private String name;
        private int age;
        private String email;

        // 자기 자신 객체를 반환 => 메서드 체이닝
        // Builder.name("홍길동")
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // Builder.name("홍길동").age(20)
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        // Builder.name("홍길동").age(20).email("java@naver.com")
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        //외부 클래스 타입을 반환
        public Member build() {
            return new Member(this);
        }
    }
}
