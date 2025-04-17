package basic.ch03.sec04;

public class AccuracyExample1 {
    // 문제: 실수 연산에서 생기는 오차 보여주는 코드
    //    public static void main(String[] args) {
    //        int apple = 1; // 사과 1개
    //        double pieceUnit = 0.1; // 한 조각 크기
    //        int number = 7; // 7조각 먹었음
    //
    //        // 💡 컴퓨터는 0.1을 이진수로 정확히 표현할 수 없음
    //        // → 연산을 여러 번 하면 근사값끼리의 연산으로 오차가 발생
    //
    //        double result = apple - number * pieceUnit;
    //        // → 1 - 7 * 0.1 = 1 - 0.7 = 0.3 이라고 생각하지만,
    //        // 실제 결과는 약 0.2999993 으로 나옴 (소숫점 정밀도 오차)
    //
    //        System.out.println("사과 1개에서 남은 양: " + result);
    //    }

    // 해결: 오차를 없애기 위한 방식 (정수로 계산한 뒤 나중에 나누기)
    public static void main(String[] args) {
        int apple = 10;         // 사과 10조각 (0.1 단위 10개)
        double pieceUnit = 1;   // 조각 단위는 1 (즉, 0.1 * 10 형태)
        int number = 7;         // 7조각 먹음

        double result = apple - number * pieceUnit;
        // → 10 - 7 * 1 = 3.0 (정수 기반 연산이라 정확)

        System.out.println("result = " + result/10);
        // → 다시 0.1 단위로 환산 → 3.0 / 10 = 0.3 (정확한 결과 도출)
    }
}

// ⭐ 실수는 정확하게 표현이 안 되기 때문에 반복 연산 시 오차가 생김
// 이 문제를 피하려면 정수 기반으로 계산한 뒤, 나중에 실수로 변환하는 방식이 안정적

/*
📌 [Java의 실수 계산 정확도 문제 정리]

✅ 1. 부동소수점 오차는 Java만의 문제가 아님!
   → C, Python 등 모든 언어에서 동일하게 발생함
   → 컴퓨터는 소수를 **이진수로 정확하게 표현할 수 없음**
   → 특히 0.1, 0.2 같은 값은 무한 이진소수 → 근사값으로 저장됨

✅ 2. 오차 발생 예시
   - 0.1 + 0.2 = 0.3 ❌ → 실제로는 0.30000000000000004 등으로 출력됨
   - 반복 계산 시 오차가 누적되어 눈에 띄게 나타남

✅ 3. 언어별 비교
   - Java: `double` 사용 → 오차 있음 (출력 시 눈에 잘 보임)
   - C: `float`, `double` → 마찬가지로 오차 있음
   - Python: `float`은 C의 `double`과 동일, 출력은 깔끔하게 해줘서 덜 보일 뿐

✅ 4. 해결 방법
   ① 정수 기반 계산: 소수 대신 정수로 변환해 계산하고, 마지막에 나눠서 복원
      예: 0.1 * 7 대신 → 1 * 7 후에 /10
   ② Java에서는 `BigDecimal` 사용 (정밀한 소수 계산 가능)
   ③ Python에서는 `Decimal` 모듈 사용 가능

✅ 5. BigDecimal 예시
   import java.math.BigDecimal;

   BigDecimal a = new BigDecimal("0.1");
   BigDecimal b = new BigDecimal("0.2");
   System.out.println(a.add(b)); // 정확히 0.3 출력

🧠 요약:
모든 언어에서 **부동소수점 오차는 존재**하며, 정확한 계산이 필요할 때는
**정수 계산 또는 정밀 계산용 클래스(BigDecimal 등)**를 사용해야 한다!
*/