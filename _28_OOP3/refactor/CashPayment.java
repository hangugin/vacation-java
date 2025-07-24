package com.study._28_OOP3.refactor;

public class CashPayment implements PaymentMethod{
    @Override
    public boolean pay(int amount) {
        System.out.println("--- 현금결제처리 ---");

        if(amount < 0) {
            System.out.println("금액은 음수일 수 없습니다.");
            return false;
        }
        System.out.println("현금영수증 발행"); // 국세청 api 연결코드
        System.out.println(amount + "원 현금결제 완료");
        return true;
    }

    @Override
    public String getPaymentName() {
        return "현금결제";
    }
}
