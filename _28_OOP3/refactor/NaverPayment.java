package com.study._28_OOP3.refactor;

public class NaverPayment implements PaymentMethod{
    private String email;

    public NaverPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("--- 네이버페이 실행 ---");
        System.out.println("email = " + email);
        System.out.println("네이버페이 승인 요청중");

        if(amount < 0){
            System.out.println("금액은 음수일 수 없습니다.");
            return false;
        }
        System.out.println(amount + "원 네이버페이 결제 완료");

        return true;
    }

    @Override
    public String getPaymentName() {
        return "네이버페이";
    }
}
