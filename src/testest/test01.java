package testest;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요");
        String name = sc.next();

        System.out.print("나이를 입력하세요.");
        int age = sc.nextInt();

        System.out.println();
    }
}
