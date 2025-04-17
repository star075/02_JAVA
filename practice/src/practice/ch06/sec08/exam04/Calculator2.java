package practice.ch06.sec08.exam04;

public class Calculator2 {

    // 정적 필드
    static final double PI = 3.141592;
    // final: 앞으로 값을 바꾸지 않겠다고 선언하는 키워드
    // 정적 필드에 바뀌지 않는 값으로 올라감. 바꾸려고 시도하면 컴파일 에러 발생

    int z;

    // 정적 메서드
    public static int plus(int x, int y) {
        return x + y;
    }
}
