package com.study._35_Pool;

public class Main {
    public static void main(String[] args) {
        /*
        풀(pool) 패턴
        - 객체를 미리 만들어 놓고, 필요할때 꺼내쓰고 반납하는 방식
        - 성능향상을 목적으로 한다
        ex) Integer클래스 -128~127 까지 256개 객체를 미리 만들어 놓음
        ex) 자바의 데이터베이스 연결(jdbc) - connection pool

        도입 시기:
        - 객체 생성 비용이 클 때
        - 동시에 사용할 수 있는 객체 수가 제한될 때
         */

        Restaurant restaurant = new Restaurant(5);

        // 손님입장
        restaurant.enter("홍길동1");
        restaurant.enter("홍길동2");
        Table t3 = restaurant.enter("홍길동3");
        restaurant.enter("홍길동4");
        restaurant.enter("홍길동5");

        restaurant.enter("홍길동6");
        // 대기열 구현(queue 자료구조)

        // 손님 한명 나감
        restaurant.leave(t3);

        // 대기중이던 홍길동 6번 다시 입장
        Table t6 = restaurant.enter("홍길동6");

        System.out.println("t3 == t6: " + (t3 == t6));

    }
}
