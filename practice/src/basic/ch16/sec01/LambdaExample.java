package basic.ch16.sec01;

//// ☺️나
//public class LambdaExample {
//    public static void main(String[] args) {
//        // x + y 계산
//        action((x, y) -> {
//            System.out.println("result: " + (x + y)); // 출력: 14
//        });
//
//        // x - y 계산
//        action((x, y) -> {
//            System.out.println("result: " + (x - y)); // 출력: 6
//        });
//    }
//
//    // action 메서드는 Calculable 타입의 람다식을 받아서 실행함
//    public static void action(Calculable calculable) {
//        // 데이터
//        int x = 10;
//        int y = 4;
//
//        // 데이터 처리 (전달받은 람다식(=calculate 메서드)을 실행)
//        calculable.calculate(x, y);
//    }
//}
//
///*
// * ✅ 개념 정리
// *
// * ▶ 함수형 인터페이스
// * - `@FunctionalInterface`를 붙이면 추상 메서드 1개만 정의 가능
// * - 람다식으로 구현 가능 (형식: (x, y) -> { 실행문 })
// *
// * ▶ 이 예제의 흐름
// * 1. `action()` 메서드는 x=10, y=4를 내부에서 가지고 있음
// * 2. 메인에서 람다식을 만들어서 action에 전달함
// *    - 첫 번째는 (x + y) 출력
// *    - 두 번째는 (x - y) 출력
// * 3. 전달된 람다식은 `calculable.calculate(x, y)` 부분에서 실행됨
// *
// * ▶ 핵심 요약
// * - 람다식은 인터페이스를 직접 구현하지 않고, 코드만 전달할 수 있음
// * - 코드가 훨씬 간결하고, 필요한 계산 방법만 전달하면 됨!
// */

// ☺️강사님
public class LambdaExample {
    public static void main(String[] args) {

        /*
         * 람다식
         * - 메서드를 하나의 식으로 표현해 익명함수를 생성하는 식
         * */

        /*
         * 인터페이스에 정의된 추상메서드 사용 방법
         * 1. <클래스 구현> 인터페이스를 구현한 클래스를 정의하는 방법
         *    - new CalculableImpl()
         *    - 클래스를 따로 만들어서 메서드 구현
         * 2. <익명 클래스> 익명클래스를 활용해서 메소드 정의후 사용하는 방법
         *    - new Calculable() { ... }
         *    - 이름 없는 클래스를 즉석에서 만들어서 구현
         * 3. <람다식> 람다식 활용하는 방법
         *    - (x, y) -> { ... }
         *    - 함수형 인터페이스이기 때문에 람다식으로 간단히 구현
         * */

        // 1. 클래스 구현 방식 - Calculable 인터페이스를 별도의 클래스로 구현한 것
        // 인터페이스 구현방법
        CalculableImpl calculableImpl = new CalculableImpl();
        calculableImpl.calculate(5, 3);

        // 2. 익명 클래스 방식 - 클래스 이름 없이 즉석에서 인터페이스 구현 객체를 만드는 방식
        //                 - 코드가 좀 길긴 하나, 클래스를 따로 만들지 않아도 돼서 유용
        Calculable c1 = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println("익명클래스 사용 : " + (x + y));
            }
        };
        c1.calculate(5, 3);

        // 3.2 람다식사용 - 함수형 인터페이스이기 때문에 람다식으로 간단히 작성 가능
        Calculable c2 = (x, y) -> {
            System.out.println("람다식 사용 : " + (x + y));
        };
        c2.calculate(5,3);

        // 3.1 action() 함수 호출 방식
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });
        action((x, y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });

    }

    public static void action(Calculable calculable) {
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);
    }
}