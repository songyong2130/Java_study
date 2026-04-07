package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어","영어","수학"};

        System.out.print("학생수를 입력하세요: ");
        int student_num = sc.nextInt();
        int[][] arr = new int[student_num][3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(subject[j] + "점수: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length;j++){
                total += arr[i][j];
            }
            double avg = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }


    }
}
