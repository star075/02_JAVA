package advanced.ch16.sec05.exam01;

// ✅ 동작을 받아서 실행하는 클래스
public class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10, 4); // 전달된 함수 실행 (10, 4 입력)
        System.out.println("결과: " + result);
    }
}
