package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] student; // 1. 배열 변수 선언
        student = new int[5]; // 2. 배열 생성

        System.out.println(student.length);
        // 변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;
        // student[5] = 40; <- 범위 벗어남

        //1. 변수 값 읽기
        System.out.println("학생1 점수: " + student[0]);
        System.out.println("학생2 점수: " + student[1]);
        System.out.println("학생3 점수: " + student[2]);
        System.out.println("학생4 점수: " + student[3]);
        System.out.println("학생5 점수: " + student[4]);


    }
}
