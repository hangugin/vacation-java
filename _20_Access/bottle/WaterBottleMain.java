package com.study._20_Access.bottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        /*
        1. WaterBottle 클래스 생성
        private int currentWater (현재 물의 양)
        public 생성자: WaterBottle(int currentWater) -> 초기 물의 양 초기화
        (currentWater의 범위가 0~1000이 되도록)

        2. 메소드 구현 (모든 메소드 public 구현)
        - void fill(int amount)
            - 0보다 큰 양만 허용, currentWater의 총량이 1000ml넘지 못하게
            - 유효하면, currentWater에 amount 더해주시고, ~물을 채웠습니다 출력
            - 조건 위배가 될 경우, 경고 메세지 출력
        - void drink(int amount)
            - 0보다 큰 양만 허용, 현재 물의 양보다 많은 양을 마실 수 없음
            - 유효하면, currentWater에 amount 빼주시고, ~물을 마셨습니다 출력
            - 조건 위배가 될 경우, 경고 메세지 출력
        - int getCurrentWater()
            - 현재 물의 양 리턴
         */
        WaterBottle waterBottle = new WaterBottle(500);
        waterBottle.drink(500);
        waterBottle.fill(600);
        System.out.println(waterBottle.getCurrentWater());
    }
}
