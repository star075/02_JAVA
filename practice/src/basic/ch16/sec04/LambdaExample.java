package basic.ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {

        // Person 객체 생성 (람다식 또는 메서드를 전달받아 실행함)
        Person person = new Person();

        // 1. 실행문이 두 개 이상일 경우 - 람다식 전달
        person.action((x, y) -> {
                    double result = x + y; // 10 + 4 계산
                    return result; // 계산 결과 반환 (14.0)
                }
        );

        // 2. 람다식 축약 - sum() 메서드를 람다식으로 전달하는 방식
        // person.action((x,y) -> sum(x,y));

        // 3. 메서드 참조 방식 (::)
        person.action(LambdaExample::sum); // static 메서드 참조 전달
        /*
         * 메소드 참조 방식(::)
         * - 함수형 인터페이스를 람다식으로 쓰는 대신, ("기존 메서드 이름만으로") 일반 메소드를 참조시켜 선언하는 방법
         *
         * - 조건: 매개변수 수, 타입, 리턴형이 인터페이스 메서드와 동일해야 함
         * ✔️ static 메서드 참조: 클래스이름::메서드이름
         * ✔️ instance 인스턴스 메서드 참조: 참조변수이름::메서드이름
         * */

    }

    // static 메서드 정의 (방식 3)
    public static double sum(double x, double y) {
        return (x + y);
    }
}

/*
 * ✅ 개념 정리
 *
 * ▶ 함수형 인터페이스
 * - 메서드가 1개만 있는 인터페이스
 * - 람다식 또는 메서드 참조로 구현 가능
 *
 * ▶ 람다식 전달 방식
 * - 형식: (x, y) -> { 실행문; return 값; }
 * - 실행문이 한 줄이면 return과 중괄호 생략 가능
 *
 * ▶ 메서드 참조 (::) 사용 조건
 * - 인터페이스의 메서드 시그니처와 참조할 메서드의 매개변수/타입/리턴형이 같아야 함
 *
 * ▶ 메서드 참조 형식
 * - 정적 메서드: 클래스명::메서드명 (예: LambdaExample::sum)
 * - 인스턴스 메서드: 참조변수명::메서드명 (예: str::toLowerCase)
 * - 생성자 참조: 클래스명::new (예: ArrayList::new)
 *
 * ▶ 실행 흐름
 * - person.action(...) 호출 시 내부에서 10, 4를 매개변수로 전달
 * - 전달받은 람다식 또는 sum 메서드가 calc(x, y)처럼 실행됨
 * - 결과 14.0이 출력됨
 *
 * ▶ 출력 결과
 * 결과: 14.0
 * 결과: 14.0
 */