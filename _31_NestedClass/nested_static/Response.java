package com.study._31_NestedClass.nested_static;

public class Response {
    // 서버 입장에서 응답 데이터를 반환할때
    // 일정한 양식으로 반환하고 할때 사용하는 클래스
    private static String systemVersion = "1.0";
    private boolean success;
    private Object data;
    private Result result;

    /*
    중첩 클래스 - Result

    API 응답의 결과 정보만 담는 클래스
    static으로 선언을 했기 때문에
    외부 클래스보다 생성 시점이 더 빠르다.
    -> 1. Response 인스턴스 생성 없이도 단독으로 사용이 가능하다.
       2. 바깥 클래스의 인스턴스 변수에는 접근이 불가능하다.

    => 사실상 두개의 서로다른 클래스를 정의하는 것과 다름이 없어진다

    언제 사용해야 할까?
    - 논리적으로 응집되어서 하나의 java파일로 관리하고 싶을 때
    - 정적 중첩클래스 -> 생명주기가 서로 다를 때

    - 바깥클래스가 유틸리티 클래스(**)가 필요한데, 생명주기가 다를때
     */

    public static class Result {
        private String message;
        private int code;

        public Result(String message, int code) {
            this.message = message;
            this.code = code;
        }

        public void printResult() {
            System.out.println(this);
            // 바깥 클래스의 private필드에 접근 가능
            // 바깥 클래스의 static필드라서 접근이 가능했다.
            System.out.println("시스템 버전: " + systemVersion);

            // success : 바깥 클래스의 인스턴스 필드는 접근불가
        }

        @Override
        public String toString() {
            return "Result{" +
                    "message='" + message + '\'' +
                    ", code=" + code +
                    '}';
        }

        // 자주 쓰는 객체를 미리 정의해서 반환
        public static Result createSuccess() {
            return new Result("성공", 200);
        }

        public static Result createError() {
            return new Result("오류", 500);
        }

        public String getMessage() {
            return message;
        }

        public int getCode() {
            return code;
        }
    }

    public Response(boolean success, Object data, Result result) {
        this.success = success;
        this.data = data;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }

    public Result getResult() {
        return result;
    }

    public void printResponse() {
        System.out.println("성공: " + success);
        System.out.println("데이터: " + data);
        System.out.println("결과: " + result);
    }
}
