package basic.ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        /*
         * 전략 패턴
         * - 동작 방식을 자유롭게 바꾸고 싶을때 사용
         * 📌 3가지 구성요소
         * - Interface -> Workable (추상 메서드 work) (실행 규칙 정의)
         * - Concrete Strategy -> 실제 구현체 람다식 (실제 실행될 동작 (출근, 퇴근 등))
         * - Context -> Person (전략을 받아서 실행하는 쪽)
         * */

        // 실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("퇴근합니다."));
    }
}

/*
 * ✅ 개념 정리
 *
 * ▶ Workable 인터페이스
 * - 메서드가 1개인 함수형 인터페이스 (@FunctionalInterface)
 * - 매개변수도 없고, 반환값도 없는 void work() 메서드 정의
 *
 * ▶ Person 클래스의 action()
 * - Workable 타입의 람다식을 매개변수로 받아서
 * - 내부에서 work() 메서드를 실행함 (→ 즉, 전달받은 행동을 실행)
 *
 * ▶ 람다식 사용 방식
 * - 실행문이 2줄 이상일 경우 중괄호 { } 필수
 * - 실행문이 1줄일 경우 중괄호 생략 가능
 *
 * ▶ 전략 패턴 (Strategy Pattern)
 * - 동작(알고리즘, 실행 방법)을 코드로 외부에서 주입받아 실행하는 디자인 패턴
 * - 동작을 유연하게 바꿀 수 있어 유지보수와 확장이 쉬움
 *
 * 📌 구성요소 3가지
 * 1. 전략(Strategy) 인터페이스: Workable
 *    - 실행 규칙 정의 (ex. void work();)
 * 2. 구체 전략(Concrete Strategy): 람다식
 *    - 실제 실행될 동작 정의 (ex. 출근, 퇴근 등)
 * 3. 컨텍스트(Context): Person
 *    - 전략을 받아서 내부에서 실행하는 쪽
 *
 * ▶ 핵심 요약
 * - 람다식은 전략(행동)을 객체처럼 전달하는 수단으로 사용됨
 * - 전략 패턴과 람다식을 활용하면, 매번 다른 방식의 행동을 깔끔하고 유연하게 전달/실행할 수 있음
 */