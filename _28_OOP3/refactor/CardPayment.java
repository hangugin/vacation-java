package com.study._28_OOP3.refactor;

public class CardPayment implements PaymentMethod{
    private String cardNumber;
    private String cardName;

    public CardPayment(String cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("--- 카드결제 실행 ---");
        System.out.println("cardNumber = " + cardNumber);
        System.out.println("cardName = " + cardName);
        System.out.println("은행 승인 요청중...");

        if(amount < 0) {
            System.out.println("금액은 음수일수 없습니다");
            return false;
        }

        System.out.println(amount + "원 카드결제 완료");
        return true;
    }

    @Override
    public String getPaymentName() {
        return "신용카드";
    }
}
