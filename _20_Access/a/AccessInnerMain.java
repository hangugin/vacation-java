package com.study._20_Access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // pulic - 접근가능 / 직접참조
        accessData.publicField = 1;
        accessData.publicMethod();

        // default - 같은 a 패키지만 있기 때문에 접근가능 / 직접참조
        accessData.defaultField =2;
        accessData.defaultMethod();

        // private - AccessInnerMain class이기 때문에 다른 클래스 이므로 접근 불가능
        // accessData.privateField = 3; 컴파일 에러
        // accessData.privateMethod(); 컴파일 에러

        accessData.innerAccess(3);
        // private 필드, 메소드: 같은 클래스 내의 public 메소드에 의해 다뤄진다
    }
}
