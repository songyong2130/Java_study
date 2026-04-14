package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;

    }// 매개변수가 없으면 위와 같이 매개변수를 비워 정의하고 호출시 인수를 비워두고 호출
    // 반환 타입이 없는 경우 위와 같이 반환 타입을 void로 정의
    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
