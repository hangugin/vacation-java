package com.study._23_OOP2;

// service - entity간의 상호작용을 도우는 객체
public class Service {

    // 학생 -> 학교(ㅇ)
    public void register(Student st, School sc) {
        if(st == null || sc == null) {
            System.out.println("학생 혹은 학교 정보가 없습니다");
            return;
        } // null 체크 습관화!

        // 학생객체의 상태 변경
        st.setSchool(sc); // 학생 -? 학교
        // 학교객체의 상태 변경
        sc.addStudent(st); // 학교 -> 학생

        System.out.println(st.getName() + "학생이 " + sc.getName() + "에 등록되었습니다.");
    }

    // SchoolService라는 클래스가 담당해야할 메서드
    public void printAllStudents(School school) {
        if (school == null) { // 파라미터로 참조자료형이 넘어오면 null체크!
            System.out.println("학교 정보가 없습니다");
            return;
        }
        System.out.println("[" + school.getName() + "] 재학생 목록");

        if (school.getStudentCount() == 0) {
            System.out.println("재학생이 없습니다");
        } else {
            // length (x) -> 미리 10개의 자리를 만들어 놨기 때문에
            for (int i=0; i < school.getStudentCount(); i++) {
                school.getStudent(i).printInfo();
            }
        }
    }
}
