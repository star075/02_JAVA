package basic.ch07.sec07.exam01;
/*
 * ✅ 다형성(Polymorphism)
 * - 하나의 인스턴스가 여러 타입으로 취급될 수 있는 것
 * - 상속 관계를 통해 부모 타입 변수에 자식 객체를 넣을 수 있다 (업캐스팅)
 * - 하나의 메서드나 변수를 여러 클래스에서 다양한 방식으로 구현 가능
 *
 * ✅ 클래스 계층 구조 (상속 관계도)
 *
 *        A
 *       / \
 *      B   C
 *     /     \
 *    D       E
 *
 * ✅ 업캐스팅 (자식 → 부모)
 * - 자바에서 자동으로 허용 (안전함)
 * - 예: A a = new D();, B b = new D(); 등
 *
 * ✅ 다운캐스팅 (부모 → 자식)
 * - 개발자가 강제로 형변환 해야 함: (타입) 변수
 * - 런타임 시 실제 객체 타입이 맞아야만 성공 (틀리면 ClassCastException 발생)
 * - 예: A a = new E(); B b = (B) a; → **컴파일은 되지만, 런타임 오류 발생 가능**
 * - `instanceof` 연산자를 함께 사용하면 안전하게 형변환 가능
 *
 * ✅ 잘못된 예시
 * - B b3 = new E(); → ❌ 컴파일 에러 (B와 E는 아무런 상속 관계가 없음)
 * - C c2 = new D(); → ❌ 컴파일 에러 (C와 D는 아무런 상속 관계가 없음)
 *
 * ✅ 보너스
 * - 모든 클래스는 암묵적으로 `Object`를 상속받기 때문에
 *   Object 타입 변수로 모든 클래스 인스턴스를 받을 수 있다.
 *   예: Object obj = new B();
 */

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * - 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
        * - 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있게도 하고
        * - 하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다.
        * */

        /*
            A
           / \
          B   C
         /     \
        D       E
        * */
        A a = new A();
        B b = new B(); // A - B
        C c = new C(); // A - C
        D d = new D(); // A - B - D
        E e = new E(); // A - C - E

        // 업캐스팅
        // 자식 -> 부모로 대입시 자동 타입 형변환이 발생 (안전해서 자바에서 자동으로 해줌)
        A a1 = new B();
        A a2 = new C();
        A a3 = new D();
        A a4 = new E();
        B b1 = new D();
        C c1 = new E();

        // E는 C의 자식 -> B와 관계 X
//        B b3 = new E();

        A a6 = new E(); // 업캐스팅
        B b3 = (B) a6; // 다운 캐스팅 but 권장 X

        // D는 B의 자식 -> C와 관계 X
//        C c2 = new D();

        /*
            A
           / \
          B   C
         /     \
        D       E

        * */

        // 다운 캐스팅 but 불안정해서 잘 사용하지 않음
        // 그냥 가능하다는 것만 알아두기
        // 부모 -> 자식
        B b6 = (B)a;

        // 모든 class의 최상위 class는 object!
        // 그래서 object로도 가능함
        // Object o = new B();
    }
}
