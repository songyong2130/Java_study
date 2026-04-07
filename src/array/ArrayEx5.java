package array;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int array_num = sc.nextInt();
        int[] arr = new int[array_num];

        System.out.println(array_num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        avg = (double)total / arr.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
