package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum, maxNum;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int array_num = sc.nextInt();
        int[] arr = new int[array_num];

        System.out.println(array_num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        minNum = arr[0];
        maxNum = arr[0];
        for (int arrays : arr) {
            if (arrays < minNum){
                minNum = arrays;
            }
            if (arrays > maxNum) {
                maxNum = arrays;
            }
        }
        System.out.println("가장 작은 숫자: " + minNum);
        System.out.println("가장 큰 숫자: " + maxNum);
    }
}
