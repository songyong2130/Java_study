package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        //배열 생성 간략 버전, 배열 선언과 함께 사용시 new int[] 생략 가능
        int[] student = new int[]{90,80,70,60,50,40,30};// 베열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < student.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + student[i]);
        }
    }
}

