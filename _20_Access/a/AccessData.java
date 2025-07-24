package com.study._20_Access.a;

public class AccessData {

    /*
    접근제한자 : 접근(.)을 외부로부터 제한하는 제어자
    접근제한자의 종류
    1. public
    - 가장 개방적, 어디서든 접근/직접참조(".") 가능
    - 외부에 완전히 공개되는 자료에 사용

    2. protected
    - 같은 패키지 내부 && 상속 관계 일떄만 접근 가능 - 나중에
    - 상속구조에서 일부만 공개되는 자료에 사용

    3. default
    - 접근 제한자를 정의하지 않으면 접근제한자의 기본값이 default
    - 같은 패키지 내부에서만 접근 가능
    - 패키지 단위로 묶인 내부 구현끼리는 공유

    4. private
    - 가장 제한적, 자기 자신 클래스 내부에서만 접근(.) 가능하다
    - 외부에서 완전히 접근하지 못하도록 숨기기 위해

    접근제한자를 사용하는 이유
    - 데이터를 안전하게 보호: 외부에서 참조해서 오염되지 않게 하기 위함
     */

    // 필드
    public int publicField; // 모든 곳에서 접근
    int defaultField; // 같은 패키지만 접근
    private int privateField; // 클래스 내부에서만 접근

    // 메서드
    public void publicMethod() {
        System.out.println("퍼블릭 메서드 호출!");
    }

    void defaultMethod() {
        System.out.println("디폴트 메소드 호출!");
    }

    private void privatemethod() {
        System.out.println("프라이빗 메소드 호출!");
    }

    public void innerAccess(int number) {
        privatemethod(); // private이지만 같은 클래스 내부라서 호출 가능
        privateField = number;
        System.out.println("프라이빗 필드 값: " + privateField);
    }
}
