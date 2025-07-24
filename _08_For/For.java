package com.study._08_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 - for
        for(변수초기화; 조건식; 증감식) {
            반복될 코드 작성
        }
         */

        // i = 0(초기식)
        // (조건식 조건검사:(true) -> 중괄호 코드블럭 실행
        // 증감식 -> 선언해둔 변수를 증감시켜줌
        // 조건식이 false가 되면 종료
        for(int i = 0; i < 10; i++) {
            // i는 for문 안에서 정의 되었기때문에 for문 안에서만 유효한 변수
            System.out.println(i + "번째 반복");
        }

        int a = 1; // for문 밖에서 정의 되었음 for문 밖에서도 유효한 변수
        for (; a < 6; a++) {
            System.out.println(a);
        }

        for (; a < 10; a++) {
            System.out.println("두번째 반복: " + a);
        }

        System.out.println("=".repeat(50));

        // 1 ~ 10까지 출력, 짝수만 출력
        // 복합대입 연산자
        // i += 2 <> i = i + 2
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("짝수: " + i);
        }
        
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("짝수: " + i);
            }
        } // 10번반복 -> 5번만 출력

        // 10 -> 1 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.println("거꾸로 출력: " + i);
        }

        // 반복분으로 1 ~ 100까지의 합을 구하기
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // for반복문으로 1~100중에 짝수만 더한값을 출력해주세요
        int evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
        }
        System.out.println(evenSum);

    }
}
