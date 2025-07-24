package com.study._15_Method;

public class Return {

    // 리턴값이 존재한다면, void대신 리턴되는 data의 자료형을 명시 한다
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static String addNim(String name) {
        String result = name + "님";
        return result;
    }

    public static String getAdult(int age) {
        if (age >= 20) {
            return "성인";
        } else {
            return "미성년자";
        }

        // System.out.println("실행되지 않습니다"); 도달할 수 없음
    }

    public static void main(String[] args) {
        int addResult = add(10, 20);
        // addResult에는 add(10, 20)의 호출결과인 return값이 대입 됨
        System.out.println(addResult);

        // return이 있는 함수의 경우,
        // 리턴되는 data가 값이라면 값, 객체라면 객체로 다를 수 있다.
        System.out.println(add(10, 20));
        int addResult2 = add(10, add(10, 20));
        System.out.println(addResult2);

        // 리턴되는 data가 문자열 객체이기때문에, 문자열의 메서드를 바로 호출 할 수 있다.
        System.out.println(addNim("홍길동").equals("홍길동"));

        /*
            메서드에서 return을 만나면 벌어지는 일
            1. 메서드 즉시 종료(탈출)
            2. 호출한 곳으로 값 전달(return 값)
            3. 메모리 정리
         */

    }
}
