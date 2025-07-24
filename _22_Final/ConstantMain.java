package com.study._22_Final;

public class ConstantMain {
    public static void main(String[] args) {
        System.out.println("게임명: " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.BATTLE_MODE);

        int playerLevel = 17;
        int tempPlayerLevel = playerLevel;

        if (++tempPlayerLevel > Constant.MAX_LEVEL) {
            System.out.println("최대 레벨을 이미 도달 하였습니다");
        } else {
            playerLevel = ++tempPlayerLevel;
            // 전위증가 -> 대입되기 전에 1 증가하고 대입
            // 후위증가 -> 대입되고 나서 1 증가
        }

        int price = 100000;
        double totalPrice;

        if (price >= Constant.DISCOUNT_THRESHOLD) {
            double discountPrice = price * Constant.DISCOUNT_RATE;
            totalPrice = price - discountPrice;
        }

        // if (user.getRole().equals("STUDENT_CLASS_A"))
        // 매직넘버, 매직스트링
        // 나중에 코드를 봤을 때 "이 숫자, 이 문자열...이 뭐지?" 라고 궁금해지면
        // 그럼 매직넘, 매직스트링이다. -> 쓰지 말자!

    }
}
