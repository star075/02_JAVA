package basic.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 매개변수가 두 개일 경우
        person.action1((name, job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        // 매개변수가 한 개일 경우
        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(word -> System.out.println("\"" + word + "\"" + "라고 외칩니다."));
    }
}

/*
 * ✅ 개념 정리
 *
 * ▶ 함수형 인터페이스 (Functional Interface)
 * - 오직 하나의 추상 메서드만 가지는 인터페이스
 * - 람다식으로 간결하게 구현할 수 있음
 *
 * ▶ Workable 인터페이스
 * - 매개변수 2개: 이름(name), 직업(job)
 * - 메서드: void work(String name, String job);
 *
 * ▶ Speakable 인터페이스
 * - 매개변수 1개: 말할 내용(content)
 * - 메서드: void speak(String content);
 *
 * ▶ Person 클래스
 * - action1(): Workable을 전달받아 실행
 * - action2(): Speakable을 전달받아 실행
 *
 * ▶ 람다식 전달 방식
 * - 매개변수 2개일 때: (x, y) -> { 실행문; }
 * - 매개변수 1개일 때: x -> { 실행문; } 또는 x -> 단일실행문;
 *
 * ▶ 핵심 요약
 * - 람다식을 통해 "동작(함수)"를 객체처럼 전달하여 실행함
 * - 상황에 따라 다양한 동작을 유연하게 바꿔 쓸 수 있는 구조
 */