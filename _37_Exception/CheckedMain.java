package com.study._37_Exception;

public class CheckedMain {
    static void checkAge(int age) throws MyCheckedException {

    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyCheckedException e) {
            System.out.println("예외처리: " + e.getMessage());
        }
        // 정상적인 값일지라도, try - catch가 강제된다.
        // checkAge(25);
        /*
        자주 나오는 체크 예외
        IOException : 파일, 네트워크에서 입출력 실패
        FileNotFoundException: 존재하지 않는 파일 찾을 때
        SQLException: 데이터베이스에서 작업이 실패
        - 잘못된 쿼리전송, database의 영속성(동기화)이 깨졌을때
         */
    }
}
