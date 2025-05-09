package basic.ch16.sec03;

// ✅ 동작을 전달받아 실행하는 Person 클래스
public class Person {
    public void action1(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}