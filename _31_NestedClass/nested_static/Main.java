package com.study._31_NestedClass.nested_static;

public class Main {
    public static void main(String[] args) {

        // 정적 중첩 클래스는 바깥 인스턴스 없이도 단독으로 생성 가능
        // Result 클래스는 Response 인스턴스 없이도 생성 가능

        Response.Result result1 = new Response.Result("데이터 조회 성공", 200);
        Response.Result result2 = new Response.Result("권한 없음", 403);

        // 정적 메서드 활용

        Response.Result successResult = Response.Result.createSuccess();
        Response.Result errorResult = Response.Result.createError();

        successResult.printResult();
        errorResult.printResult();



    }
}
