package if_else;

public class ScoreEx1 {
    public static void main(String[] args) {
        int num = 65;
        if (num >= 90){
            System.out.println("학력은 A입니다.");
        } else if (num >= 80) {
            System.out.println("학력은 B입니다.");
        }else if (num >= 70) {
            System.out.println("학력은 C입니다.");
        }else if (num >= 60){
            System.out.println("학력은 D입니다.");
        }else if (num < 60){
            System.out.println("학점은 E입니다.");
        }
    }
}
