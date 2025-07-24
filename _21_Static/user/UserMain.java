package com.study._21_Static.user;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("김철수", "991010-1234567");

        System.out.println("user의 이름: " + user.getName());
        System.out.println("user의 주민번호: " + user.getPersonalNumber());

        User.applyMaskingToUser(user);

        System.out.println("user의 이름: " + user.getName());
        System.out.println("user의 주민번호: " + user.getPersonalNumber());

        /*
        public static void main(String[] args)
            public: 누구나 접근이 가능하도록 -> JVM이 호출해 줘야 하니까
            static: 객체 생성없이 호출가능해야함 -> JVM이 프로ㅓ그램 시작에 호출 해야하니까
            void: main의 역할은 실행 그 자체

            String[] args: 자바 프로그램 외부로부터 전달 받은 데이터를 담아둔 매개변수
         */

        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
