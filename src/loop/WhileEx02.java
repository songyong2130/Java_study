package loop;

public class WhileEx02 {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;
        while (true) {
            a++;
            if (a%2==0) {
                System.out.println(a);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }
}
