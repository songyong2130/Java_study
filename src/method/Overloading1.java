package method;


// 메서드 오버로딩(Method Overloading): 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
// 규칙: 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩 가능.
// 단 반환 타입은 인정하지 않는다.
// 예)add(int a, int b) <- 맞음
// int add(int a, int b) <- 컴파일 오류

// 메서드 시그니처(Method Signature): 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명
// 메서드 시그니쳐가 다르면 다른 메서드로 간주
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a+b+c;
    }
}
