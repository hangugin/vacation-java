package com.study._15_Method;

public class BMI {
    /*
    메서드를 구현해 주세요
    1. calcBMI(double height, double weight): BMI 계산(return double)
    2. getBMIStatus(double bmi): BMI상태를 리턴(String 반환)
    3. printHealthInfo(String name, double height, double weight)
        :리턴 없음(void), calcBMI, getBMIStatus를 호출해서 값을 얻어주세요
        이름, 키, 몸무게, BMI수치, BMI상태를 모두 출력

    BMI 계산
    bmi = 몸무게(kg) / (키(m) * 키(m))
    18.5 미만 -> 저체중/ 18.5~24.9 -> 정상/ 25.0~29.9 -> 과체중
    /30.0 이상 -> 비만
     */
    public static double calcBMI(double height, double weight) {
        double meterHeight = height / 100;
        return (weight / (meterHeight * meterHeight));
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi < 25) {
            return "정상";
        } else if (bmi < 30) {
            return "과체중";
        } else {
            return "비만";
        }
    }
    
    // 함수안에서 함수를 호출
    // 외부로부터 전달 받은 값만(파라미터)만 사용하는 함수 -> 순수함수
    // 순수함수끼리의 값 체이닝 -> Functional Programing

    public static void printHealthInfo(String name, double height, double weight, double bmi, String status) {
        System.out.println("이름: " + name);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
        //double bmi = calcBMI(height, weight);
        //String status = getBMIStatus(bmi);

        System.out.printf("BMI수치: %.2f\n", bmi);
        System.out.println("BMI상태: " + status);
    }
    
    // FP의 방식 -> 값이 오염되지 않게 설계
    public static void main(String[] args) {
        printHealthInfo(
                "홍길동",
                175.0,
                70.0,
                calcBMI(175.0, 70.0),
                getBMIStatus(calcBMI(175.0, 70.0)));
    }
}
