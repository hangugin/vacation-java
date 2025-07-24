package com.study._21_Static.user;

public class User {

    private String name; // 유저(회원)의 이름
    private String personalNumber; // 주민번호

    public User(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    /*
    static 메서드 특징
    - 인스턴스 상태(this.으로 참조되는 필드, 메서드)와 무관
    - 객체 생성없이 바로 호출 가능
    => 주로 유틸성 메서드로만 쓰이게 된다.
    만들어 볼 것
    홍길동 -> 홍*동(마스킹) : String name을 파라미터로 받아서 처리
    주민번호 -> 뒷자리를 마스킹 020202-******* : String per~ 받아서 처리
    User객체를 받아서 -> 이름과 주민번호 모드 masking된 user로 반환
     */

    public static String getMaskingName(String name) {
        return name.substring(0, 1) + "*" + name.substring(2);
    }

    public static String getMaskingPersonalNumber(String personalNumber) {
        // "991010-1234567"
        int dashIndex = personalNumber.indexOf("-");
        // "991010-*******"
        return personalNumber.substring(0, dashIndex + 1) + "*".repeat(7);
    }

    public static void applyMaskingToUser(User user) {
        String maskedName = getMaskingName(user.getName());
        String maskedPersonalNumber = getMaskingPersonalNumber(user.getPersonalNumber());
        user.setName(maskedName);
        user.setPersonalNumber(maskedPersonalNumber);
    }
    
    // 설계원칙상 새로운 객체를 반호나 해주는게 더 좋은 설계
    // 순수함수(static): 함수의 입력과 출력은 아예 별개의 값이어야 한다.
    // 이유: 값이 오염되지 않기 위함
    public static User makeMaskingUser(User user) {
        String maskedName = getMaskingName(user.getName());
        String maskedPersonalNumber = getMaskingPersonalNumber(user.getPersonalNumber());
        return new User(maskedName, maskedPersonalNumber);
    }
}
