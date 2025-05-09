package advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person(); // Person 객체 생성

        // 1. 정적(static) 메소드 참조
        // 람다식
        // person.action((x, y) -> Computer.staticMethod(x, y));
        // ✅ 메소드 참조: 클래스명::메서드명 형식
        person.action(Computer::staticMethod);
        // → 클래스명::메서드명 형식
        // → staticMethod(double, double) 과 Calculable.calc(double, double) 시그니처 일치

        // 2. 인스턴스 메소드 참조
        Computer com = new Computer();
        // 람다식
        // person.action((x, y) -> com.instanceMethod(x, y));
        // ✅ 메소드 참조: 참조변수::메서드명 형식
        person.action(com::instanceMethod);
        // → 참조변수::메서드명 형식
        // → instanceMethod(double, double)과 시그니처가 같아서 참조 가능
    }
}

/*
 * ✅ 개념 정리: 메서드 참조 (::) 정적 vs 인스턴스
 *
 * ▶ 메서드 참조란?
 * - 기존에 정의된 메서드를 람다식 없이 간단히 전달하는 방법
 * - 형식: 클래스명::메서드명 또는 참조변수::메서드명
 *
 * ▶ 공통 조건
 * - 함수형 인터페이스의 추상 메서드 시그니처와
 *   참조하려는 메서드의 시그니처가 같아야 함
 *   (매개변수 개수, 타입, 리턴형 포함)
 *
 * ▶ 정적(static) 메서드 참조
 * - 형식: 클래스명::메서드명
 * - 예: Computer::staticMethod
 * - 객체 생성 없이 클래스 이름으로 직접 호출 가능
 *
 * ▶ 인스턴스(instance) 메서드 참조
 * - 형식: 참조변수::메서드명
 * - 예: com::instanceMethod
 * - 반드시 객체를 생성한 후 참조 가능
 *
 * ▶ 실행 흐름
 * 1. person.action(...) 호출
 * 2. 내부에서 calculable.calc(10, 4) 실행
 * 3. 전달된 메서드가 실행됨 (staticMethod or instanceMethod)
 * 4. 결과 출력
 *
 * ▶ 출력 결과
 * 결과: 14.0  // staticMethod → 10 + 4
 * 결과: 40.0  // instanceMethod → 10 * 4
 */