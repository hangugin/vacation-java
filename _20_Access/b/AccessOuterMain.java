package com.study._20_Access.b;

import com.study._20_Access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public
        accessData.publicField = 1;
        accessData.publicMethod();

        // default - b 패키지 내부이기 때문에 접근 불가
        // accessData.defaultField = 2;
        // accessData.defaultMethod();

        // private - 당연히 접근 불가능

        accessData.innerAccess(3);
    }
}
