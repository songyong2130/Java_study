package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue // 컴파일 오류 발생
        intValue = (int)doubleValue; // 명시적 형변환
        System.out.println(intValue);

        int z = (int)10.5;
        System.out.println(z);

        // 명시적 형변환 과정
        // doubleValue = 1.5
        // intValue = (int)doubleValue;
        // intValue = (int) 1.5; //doubleValue에 있는 값을 읽는다.
        //intValue = 1; //(int)로 형변환 한다. intValue에 int형인 숫자 1을 대입한다.
    }
}
