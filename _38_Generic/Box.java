package com.study._38_Generic;

public class Box<T> {
    /*
    제네릭 클래스
    - <T> : 타입 매개변수 선언(클래스 뒤에 이어서 적어줌)
    - T: 클래스 내부에서 실제 타입처럼 사용
     */

    // data: 모든 데이터를 담을 수 있는 변수
    private T data;
    // 담을 수 있는건 ok, 사용할 때
    // 일일이 다운캐스팅을 해줘야하고,
    // 안전하게 쓰려면 instanceof 연산자를 일일이 써줘야 함.
    // 컴파일 시점에 오류를 잡을 수 없음.

    public Box(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
