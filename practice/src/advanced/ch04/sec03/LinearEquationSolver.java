package advanced.ch04.sec03;

public class LinearEquationSolver {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
//                    System.out.println("(" + i + ", " + j + ")");
                    System.out.printf("(%d, %d)\n", i, j);
                }
            }
        }
    }
}

// System.out.println()은 문자열만 출력할 수 있으며, 형식을 지정할 수 없음
// 예: System.out.println("x의 값: " + x); ← 문자열 연결 방식

// System.out.printf()는 "형식 문자열(format string)"을 이용해 값 출력 가능
// 예: System.out.printf("x = %d, y = %d\n", x, y);
// → %d는 정수, %s는 문자열, %f는 실수 출력에 사용
// → printf는 줄바꿈이 자동으로 되지 않으므로 \n을 붙여줘야 함

// 즉, (%d, %d) 형태로 출력하려면 println 대신 printf를 사용해야 함