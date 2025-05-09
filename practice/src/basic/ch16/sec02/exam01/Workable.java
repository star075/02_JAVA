package basic.ch16.sec02.exam01;

// ✅ 함수형 인터페이스 정의
@FunctionalInterface
public interface Workable {
    void work(); // 매개변수도 없고, 리턴도 없는 메서드 1개
}