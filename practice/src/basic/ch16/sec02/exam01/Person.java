package basic.ch16.sec02.exam01;

// ✅ Person 클래스: Workable 타입(람다식) 받아서 실행
public class Person {
    public void action(Workable workable) {
        workable.work(); // 전달된 람다식 실행
    }
}