package advanced.ch16.sec05.exam01;

// ✅ 함수형 인터페이스: 매개변수 2개 받고 결과 반환하는 함수 틀
@FunctionalInterface
public interface Calculable {
    double calc(double x, double y);
}
