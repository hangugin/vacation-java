package com.study._15_Method;

public class StudentScore {
    /*
    1. 국/영/수 전체 점수합을 리턴하는 메서드
    2. 평균점수 리턴하는 메서드
    3. 평균점수 기반으로 학점리턴 메서드
    4. 학생 정보를 받아서, 최종 출력해주는 메서드
     */
    
    public static int calcTotal(int kor, int eng, int math) {
        return kor + eng + math;
    }
    
    public static double calcAverage(int totalScore) {
        return (double) totalScore / 3;
    }
    
    public static String getGrade(double average) {
        if (average >= 90) {
            return "A학점";
        } else if (average >= 80) {
            return "B학점";
        } else if (average >= 70) {
            return "C학점";
        } else if (average >= 60) {
            return "D학점";
        } else {
            return "F학점";
        }
    }

    public static void printStudentInfo(String name, int kor, int eng, int math) {
        System.out.println(name + "학생의 성적 정보");
        System.out.println("국어:" + kor + "점");
        System.out.println("영어:" + eng + "점");
        System.out.println("수학:" + math + "점");

        int totalScore = calcTotal(kor, eng, math);
        double average = calcAverage(totalScore);
        String grade = getGrade(average);

        System.out.println("총점: " + totalScore + "점");
        System.out.printf("평균: %.2f점\n", average);
        System.out.println("학점: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        printStudentInfo("김철수", 85, 98, 70);
        printStudentInfo("이명희", 95, 87, 90);
    }
}
