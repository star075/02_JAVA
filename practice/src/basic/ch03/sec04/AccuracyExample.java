package basic.ch03.sec04;

public class AccuracyExample {
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