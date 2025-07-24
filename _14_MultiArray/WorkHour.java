package com.study._14_MultiArray;

public class WorkHour {
    public static void main(String[] args) {
        // 직원 이름 배열
        String[] employeeNames = {"김철수", "이영희", "박민수", "최지우"};
        // id, 근무시간, 시급
        int[][] workRecord = {
                {0, 40, 10000},
                {1 , 35, 12000},
                {2, 20, 9000},
                {3, 45, 11000}
        };

        // 1. 전체 근무 현황 출력
        // 이름 / 근무시간 / 시급
        for (int i = 0; i < workRecord.length; i++) {
            int id = workRecord[i][0];
            int hours = workRecord[i][1];
            int wage = workRecord[i][2];
            String name = employeeNames[id];
            System.out.println(name + "\t" + hours + "\t" + wage + "원");
        }

        // 2. 전체 인건비 계산
        int totalPay = 0;
        for (int[] record : workRecord) {
            int hour = record[1];
            int wage = record[2];
            totalPay += hour * wage;
        }
        System.out.println("총 인건비: " + totalPay + "원");

        // 3. 특정 지원을 이름으로 찾기
        // employNames에서 equals()로 같은 이름을 찾는다
        // 찾았으면 index를 저장
        // index로 workRecord에 접근 -> 세부정보 뽑아온다

        String targetName = "이영희";
        int targetId = -1; //

        for(int i = 0; i < employeeNames.length; i++){
            if(employeeNames[i].equals(targetName)){
                targetId = i;
                break;
            }
        }

        for (int[] record : workRecord) {
            if(record[0] == targetId){
                System.out.println(targetName + "찾았습니다");
                System.out.println("총 근무시간: " + record[1] + "시간");
                System.out.println("시급: " + record[2] + "원");
                break;
            }
        }



    }
}
