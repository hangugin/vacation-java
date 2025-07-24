package com.study._28_OOP3.refactor;

public class PaymentProcessor {
    /*
    역할: 결제방법을 받아서 결제 시켜주는 중매 역할
    - PaymentMethod라는 인터페이스에만 의존
     */

    public boolean processPayment(PaymentMethod paymentMethod, int amount) {
        System.out.println("--결제 시작--");

        if(paymentMethod == null) {
            System.out.println("유효한 결제수단이 아닙니다");
            return false;
        }

        // 현재: 그냥 콘솔로그 / db에 결제내역을 저장하는 코드를 원래는 써야함
        System.out.println("결제수단: " + paymentMethod.getPaymentName());
        System.out.println("결제금액: " + amount + "원");

        // 다형성이 구현됨!
        boolean isSuccess = paymentMethod.pay(amount);

        if(isSuccess) {
            System.out.println("결제가 성공적으로 완료 되었습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

        System.out.println("--결제 종료--");
        return isSuccess;
    }

}
