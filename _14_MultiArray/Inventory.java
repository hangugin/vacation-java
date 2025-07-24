package com.study._14_MultiArray;

public class Inventory {
    public static void main(String[] args) {
        // 상품 이름들
        String[] productNames = {"사과", "바나나", "오렌지", "포도"};

        // id, 재고, 가격
        int[][] inventory = {
                {0, 50, 1000},
                {1, 30, 1500},
                {2, 25, 2000},
                {3, 40, 3000}
        };

        /*
        1. 재고출력 : 이름, 재고갯수, 개당가격
        2. 총 재고 가치 계산 -> 총 재고 가치: ~원 출력
        3. "바나나"로 "바나나"상품의 상세정보를 출력해주세요
            (재고 / 가격)
        -------
        4. 재고가 35개 이하인 상품이름과 그 상품의 재고갯수를 출력해주세요
         */

        for (int i = 0; i < inventory.length; i++) {
            int id = inventory[i][0];
            int count = inventory[i][1];
            int cost = inventory[i][2];
            String name = productNames[id];
            System.out.println(name + "    " + count + "개    " + cost + "원");
        }
        System.out.println();

        int totalCost = 0;
        for (int[] tory : inventory) {
            int count = tory[1];
            int cost = tory[2];
            totalCost += count * cost;
        }
        System.out.println("총 재고가치: " + totalCost + "원");
        System.out.println();

        String targetName = "바나나";
        int targetId = -1; //

        for(int i = 0; i < productNames.length; i++){
            if(productNames[i].equals(targetName)){
                targetId = i;
                break;
            }
        }

        for (int[] item : inventory) {
            if(item[0] == targetId){
                System.out.println(targetName);
                System.out.println("(" + item[1] + "개/" + item[2] + "원)");
                break;
            }
        }
        System.out.println();

        // 재고가 35개 이하인 제품 이름과 그 상품의 재고갯수
        for (int[] item : inventory) {
            if(item[1] <= 35){
                int id = item[0];
                String name = productNames[id];
                int count = item[1];
                System.out.println("상품이름: " + name);
                System.out.println("재고개수: " + count);
            }
        }

    }
}
