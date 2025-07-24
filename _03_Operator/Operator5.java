package com.study._03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        // (복합)대입연산자
        int a = 5;
        
        // 직관적
        a = a + 3; // 8
        
        // 축약 방법
        a += 2; // a = a + 2 -> 10
        a -= 1; // a = a - 1 -> 9
        a *= 2; // a = a * 2 -> 18
        a /= 3; // a = a / 3 -> 6
        a %= 4; // a = a % 4 -> 2
        
        // 시험에 많이 나오는 연산자 우선순위
        /*
        1. 괄호()
        2. 단항연산자(++, --, !)
        3. 산술연산자(*, /, % 먼저, 그다음 +, -)
        4. 비교연산자(<, >, >=, <=)
        5. 등식연산자(==, !=)
        6. 논리연산자(&&, ||)
        7. 대입연산자(=, +=, -=...) - 꼴찌
        우선 순위 동률시, 왼쪽부터 오른쪽으로 진행
         */

        int num1 = 5;
        int num2 = 3;
        boolean result = num1 > num2 && num1 + num2 < 10;
        // 실행순서: num1 + num2(산술)
        // num1 > num2(비교)
        // 산술결과 < 10(비교)
        // 등식결과
    }
}
