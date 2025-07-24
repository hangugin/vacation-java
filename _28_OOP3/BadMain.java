package com.study._28_OOP3;

public class BadMain {
    // 다형성: 같은 메서드 / 다른 동작
    // 인터페이스, 추상클래스를 이식, 상속받으면 -> 강제로 다형성이 구성된다.
    // 추상체를 의존하게끔 설계한다. -> 결합도를 낮추는 설계가 가능해진다.

    public static void processPayment(String paymentType, int amount) {
        if(paymentType.equals("CARD")) {
            System.out.println("카드 결제 처리중..");
            System.out.println(amount + "원 카드 결제 완료");
        } else if (paymentType.equals("KAKAO_PAY")) {
            System.out.println("카카오페이 결제 처리중..");
            // api코드
            System.out.println("카카오 서버 연결");
            System.out.println(amount + "원 카카오페이 결제 완료");
        }
    }
    // 객체지향 + 추상체 설계 -> 한번 해놓으면 편하다
    // 정의해야할 인터페이스도 많음, 생각해야할 코드들이 많음
    // 소규모로 개발을 한다? -> 굳이..
    // 트레이드오프: 장단을 보고 장점을 취할지, 단점을보고 장점을 포기할지
    public static void main(String[] args) {
        processPayment("CARD", 20000);
    }
}
