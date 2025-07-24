package com.study._28_OOP3.refactor;

public interface PaymentMethod {
    /*
    이식받을 클래스들에게 강제로 구현하게 할 메서드들을 선언
     */
    // 결제 성공시 true, 아니면 false
    // null체크, 입력값 검증 제우ㅚ
    boolean pay(int amount);

    // getter 강제 : 결제수단 이름을 꼭 반환하도록 강제
    String getPaymentName();

}
