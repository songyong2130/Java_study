package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_price = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int input = scanner.nextInt();

            if (input == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요: ");
                String sangpum = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                total_price += price * quantity;
                System.out.println("상품명:"+sangpum + " 가격:" + price + " 수량:"+ quantity + " 합계:" + price * quantity);
            } else if (input == 2) {
                System.out.println("총 비용: " + total_price);
                total_price = 0;
            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
