package if_else;

public class Switch {
    public static void main(String[] args) {
        int a = 4;

        String game = switch (a) {
            case 1 -> "LC";
            case 2 -> "LoR";
            case 3 -> "LCorp";
            default -> "bla";
        };
        System.out.println(game);
    }
}
