package loop;

public class Nested01 {
    public static void main(String[] args) {
        for(int i = 0;i < 6; i++) {
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
