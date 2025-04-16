package basic.ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {

        // 자료형별 값의 최대 범위를 벗어나는 경우
        // 발생한 carry(넘치는 값)을 버림처리하고 sign bit를 반전

        // 📌 Overflow 예제

        // byte는 1바이트로, -128 ~ 127 범위의 정수만 저장 가능 (1바이트 = 8비트)
        // 최대값(127)을 초과하면 다시 -128부터 시작함 (값이 순환됨)
        byte var1 = 125; // byte는 -바이트이므로 값의 범위가 -127 ~ 12
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var1++; //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1: " + var1);
            // 출력값: 126, 127, -128, -127, -126 ← 여기서 overflow 발생!
        }

        System.out.println("-----------------------");

        // 📌 Underflow 예제

        // byte에서 최소값(-128)보다 더 작아지면, 다시 127부터 시작함

        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var2--; //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);
            // 출력값: -126, -127, -128, 127, 126 ← 여기서 underflow 발생!
        }
    }
}

// 💡 이런 실수 주의!
// 반복문에서 byte나 short 자료형 쓸 때는 범위를 초과하지 않도록 주의!
// 대부분의 계산은 int 이상 자료형으로 하는 것이 안전함