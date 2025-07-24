package com.study._20_Access.bottle;

public class WaterBottle {
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
    private int currentWater;

    public WaterBottle(int currentWater) {
        if (currentWater > 1000) {
            currentWater = 1000;
        } else if (currentWater < 0) {
            currentWater = 0;
        }
        this.currentWater = currentWater;
    }

    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println(amount + "ml물을 채웠습니다.");
            System.out.println(getCurrentWater()+"ml");
        } else {
            System.out.println("경고!");
        }
    }

    public void drink(int amount) {
        if (amount > 0 && currentWater >= amount) {
            currentWater -= amount;
            System.out.println(amount + "ml물을 마셨습니다.");
            System.out.println(getCurrentWater()+"ml");
        } else {
            System.out.println("경고!");
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }

    // getter, setter
    // 국룰: 필드변수 -> private로 항상 선언
    // getter -> private필드값을 가져오는 public 메서드
    // 네이밍 국룰: get + 필드이름
    // setter -> private필드값을 변경해주는 public 메서드
    // 네이밍 국룰: set + 필드이름

    // getter, setter, 생성자 -> boiler plate 코드
    // 아무것도없는 기본생성자 + 전체필드 초기화 생성자
}
