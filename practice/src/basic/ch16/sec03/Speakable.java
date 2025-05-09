package basic.ch16.sec03;

// ✅ 함수형 인터페이스 정의 (매개변수 1개)
@FunctionalInterface
public interface Speakable {
    void speak(String content);
}