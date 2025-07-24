package com.study._10_BreakContinue;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // 간단 ATM
        Scanner scanner = new Scanner(System.in);
        int balance = 50000;

        while (true) {
            //메뉴 출력
            System.out.println("=== ATM ===");
            System.out.println("1. 잔액확인");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");
            System.out.println("메뉴를 선택하세요(1~4) >>");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;

                case 2:
                    System.out.println("입금할 금액 입력 >>");
                    int money = scanner.nextInt();
                    if (money > 0) {
                        balance += money;
                        System.out.println(money + "원 입금완료");
                    } else {
                        System.out.println("올바른 금액을 입력하세요");
                    }
                    break;

                case 3:
                    System.out.println("출금할 금액 입력 >>");
                    int outputMoney = scanner.nextInt();
                    if (outputMoney > 0 && balance >= outputMoney) {
                        balance -= outputMoney;
                        System.out.println(outputMoney + "원 출금완료");
                    } else if (outputMoney > 0 && balance < outputMoney) {
                        System.out.println("잔액 부족");
                    } else {
                        System.out.println("올바른 금액을 입력하세요");
                    }
                    break;

                case 4:
                    System.out.println("시스템 종료");
                    scanner.close();
                    return; // break(while 탈출용) 대신 작성
            }
        }
    }
}
