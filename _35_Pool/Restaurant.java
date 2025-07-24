package com.study._35_Pool;

public class Restaurant {
    private Table[] tables;

    // 1. 미리 여분의 객체를 생성
    public Restaurant(int size) {
        tables = new Table[size];
        for (int i = 0; i < size; i++) {
            tables[i] = new Table(i + 1);
        }
    }

    // 손님이 들어올 때 사용가능한 테이블을 찾아 제공(2. 대여)
    public Table enter(String customerName) {
        for (int i = 0; i < tables.length; i++) {
            if(tables[i].isAvailable()) {
                tables[i].serve(customerName);
                return tables[i]; // 미리 생성됬던 객체 리턴
            }
        }
        System.out.println("현재 자리가 없습니다..");
        return null;
    }

    // 손님이 나갈 때 테이블 비움(3. 반납)
    public void leave(Table table) {
        table.clear();
    }
}
