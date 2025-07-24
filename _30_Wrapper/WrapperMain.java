package com.study._30_Wrapper;

public class WrapperMain {
    public static void main(String[] args) {
        /*
        원시자료형(int, double, boolean...) 한계점이 존재
        객체가 아니므로,
        1. 메서드를 가질 수 없다.
        num1 = 80;
        num1.compareTo(100) ..불가능
        마치 객체처럼 자신의 상태를 기반으로 메서드를 사용하면 유용하지만,
        원시형은 객체가 아니기때문에 불가하다.
        int compareTo(num1, num2) {
            if(num1 > num2) {
                return1
            }
        }

        2. null값을 가질 수 없다.
        int 자료형을 초기화 하지 않으면 기본값으로 0으로 초기화
        int[] = {1,10,5,0,0}
        index가 3,4자리에 존재하는 0은 과연 기본값으로 초기화를 한건지
        의도적으로 0이란 값을 불러온건지 구분할 수 없다.
        -> 성능 이슈가 있을 수 있지 않느냐?: 동시에 10억번을 조회해도 1.5초 내외

        학생의 점수를 관리
        int score;
        score가 0이면, 기본값으로 초기화가 된건지, 진짜 0점인건지 판단 불가능
         */

        /*
        int -> Integer class
        long -> Long class
        원시자료형 -> 래핑클래스 변환
        : 박싱(Boxing)이라고 한다.
         */

        Integer boxedScore1 = Integer.valueOf(80); // int -> Integer
        Integer boxedScore2 = Integer.valueOf("90"); // String -> Integer
        Long boxedLong = Long.valueOf(100L);
        Double boxedDouble = Double.valueOf(95.5);
        Boolean boxedBoolean = Boolean.valueOf(true);

        // 언박싱: 래퍼클래스 -> 원시자료형
        int unBoxedInt = boxedScore1.intValue();
        long unBoxedLong = boxedLong.longValue();
        double unBoxedDouble = boxedDouble.doubleValue();
        boolean unBoxedBoolean = boxedBoolean.booleanValue();

        // 오토 박싱
        // 컴파일러가 알아서 Integer.value(65)를 추가
        Integer autoBoxing = 95;

        // 오토 언박싱
        // 컴파일러가 알아서 aoutoBoxing.intValue()를 추가
        int autoUnBoxing = autoBoxing;

        // 연산에서도 오토 박싱/언박싱이 일어난다!
        Integer num1 = 10; // 오토박싱
        Integer num2 = 20;

        // student1 + student2 객체끼리 사칙연산 불가능!
        System.out.println(num1 + num2);

        // 래퍼 클래스이기 때문에
        // == 연산자를 쓸 수 없다
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;

        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("a.equals(c): " + a.equals(b)); // false
        System.out.println("a == b: " + (a == b));

        /*
        Integer 클래스는 캐싱을 한다!
        -128 ~ 127: 총 256개의 객체를 미리 내부적으로 만들어 놓는다.
        미리 만들어 놓은 객체를 반환해서 줌
        (나도 이렇게 설계 할 수 있을까?)
        Scanner도 사용시마다 new로 생성하는게 아니라,
        하나를 만들어서 계속 돌려쓰기가 가능하게 설계
         */

        // 래퍼 클래스의 주요 메서드
        Integer num = 42;

        // 1. 문자열 반환
        String str1 = num.toString();
        String str2 = Integer.toString(100);

        // 2. 문자열에서 숫자로 변환
        int parsed1 = Integer.parseInt("123");
        Integer parsed2 = Integer.valueOf("456");

        // 3. 비교메서드
        int result = num.compareTo(50);
        // 객체보다 값이 크면 1, 작으면 -1, 동등하면 0 리턴

        // 4. 유틸리티 메서드
        int max = Integer.max(10, 20); // 두 값비교하여 큰 값 리턴
        int min = Integer.min(10, 20); // 두 값비교하여 작은 값 리턴

    }
}
