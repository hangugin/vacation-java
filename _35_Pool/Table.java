package com.study._35_Pool;

public class Table {
    /*
    음식점에 테이블 5개
    손님이 오면 빈 테이블에 배정, 나가면 다시 회수
     */
    private int id; // 테이블 자리
    private boolean inUse; // 현재 사용여부

    public Table(int id) {
        this.id = id;
    }

    public void serve(String customerName) {
        System.out.println("손님 " + customerName + "에게"
        + id + "번 테이블을 제공합니다."
        );
        inUse = true;
    }

    public void clear() {
        System.out.println(id + "번 테이블이 비었습니다.");
        inUse = false;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return inUse;
    }
}
