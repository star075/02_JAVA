package practice.ch06.sec08.exam04;

public class Application {
    public static int plus(int x, int y) {
        return x + y;
    }
    // java는 main 메서드부터 시작
    // 시작하자마자 main 메서드를 static에 올림
    public static void main(String[] args) {
        int a = plus(1, 2);
        // static이 아닌 메서드를 사용하려면
        // Application이라는 객체를 만들어서 걔를 메모리에 일단 올려야 사용 가능
        // plus도 static으로 해주면 해결!
    }
}
