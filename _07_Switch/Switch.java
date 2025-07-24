package com.study._07_Switch;

public class Switch {
    public static void main(String[] args) {
        int ranking = 2;

        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2){
            System.out.println("반액 장학금");
        } else if (ranking == 3){
            System.out.println("소정의 상품");
        } else {
            System.out.println("수고하셨습니다");
        }

        switch (ranking) { // 코드라인 이동
            case 1: // ranking == 1 경우
                System.out.println("전액 장학금");
                break; // break -> switch문(중괄호) 탈출
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("소정의 상품");
                break;
            default:
                System.out.println("수고하셨습니다");
        }

        switch (ranking) { // 코드라인 이동
            case 1: // ranking == 1 경우
                System.out.println("전액 장학금");
                break; // break -> switch문(중괄호) 탈출
            case 2: // if문 조건과 다르게 논리연산 불가능
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("수고하셨습니다");
        }

        int month = 7;
        /*
        봄: 3,4,5
        여름: 6,7,8
        가을: 9,10,11
        겨울: 12,1,2
         */
        switch (month) {
            case 3:
            case 4:
            case 5:
                // 봄에 처리해야할 코드 작성
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                // 여름에 처리해야할 코드 작성
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                // 가을에 처리해야할 코드 작성
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                //겨울에 처리해야할 코드 작성
                System.out.println("겨울입니다.");
                break;
            default:
                System.out.println("유효한 값이 아닙니다.");

        }
    }
}
