package com.study._28_OOP3;

import com.study._28_OOP3.refactor.*;

import java.util.Scanner;

public class Main {

    // 결제수단(PaymentMethod의 구현체)들을 상황에 따라
    // 새로 생성해서 리턴해주는 메서드
    public static final String CARD_PAYMENT = "CARD";
    public static final String CASH_PAYMENT = "CASH";
    public static final String NAVER_PAYMENT = "NAVER";

    private static PaymentMethod getPaymentMethod(String choice){
        // CARD -> return new CardPayment();
        // KAKAO -> return new KakaoPayment();

        switch (choice.toUpperCase()) {
            case CARD_PAYMENT:
                return new CardPayment("123456788", "김철수");
            case CASH_PAYMENT:
                return new CashPayment();
            case NAVER_PAYMENT:
                return new NaverPayment("edward0317@naver.com");
        }

        return null;
    }

    public static void main(String[] args) {
        // 외부로부터 입력받는 data들을 전달받는 곳(controller)
        // scanner -> "CASH" -> 메서드를 통해 결제수단구현체를 리턴
        Scanner scanner = new Scanner(System.in);
        System.out.print("어떤 방법으로 결제하시겠습니까? >>");
        String choice = scanner.nextLine();

        PaymentMethod clientPayment = getPaymentMethod(choice);

        // 리턴받은 결제수단 구현체를 PaymentProcessor로 넘긴다.(+ 금액까지)
        PaymentProcessor processor = new PaymentProcessor();

        System.out.print("결제금액을 입력하세요 >>");
        int amount = scanner.nextInt();

        boolean isSuccess = processor.processPayment(clientPayment, amount);

        if(isSuccess) {
            System.out.println("결제 완료. 이용해주셔서 감사합니다");
        } else {
            System.out.println("결제 실패");
        }


    }
}
