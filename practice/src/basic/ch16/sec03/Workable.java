package basic.ch16.sec03;

// ✅ 함수형 인터페이스 정의 (매개변수 2개)
@FunctionalInterface
public interface Workable {
    void work(String name, String job);
}