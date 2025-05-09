package advanced.ch16.sec05.exam01;

public class Computer {
    // 🔸 정적 메서드: 클래스명으로 직접 호출 가능
    public static double staticMethod(double x, double y) {
        return x + y;
    }

    // 🔸 인스턴스 메서드: 객체를 만들어야 호출 가능
    public double instanceMethod(double x, double y) {
        return x * y;
    }
}
