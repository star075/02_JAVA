package basic.ch17.sec04.exam03;

import java.util.stream.IntStream; // IntStream: int 전용 스트림을 만들기 위한 클래스

public class StreamExample {
    public static int sum; // 합계를 저장할 변수

    public static void main(String[] args) {

        // 1부터 100까지의 정수 스트림 생성 후 합산
        sum = IntStream.rangeClosed(1, 100) // 1부터 100까지 포함된 숫자 스트림 생성
                .sum();  // 생성된 숫자들을 모두 더한 합계 반환

        System.out.println("총합: " + sum);  // 출력 결과: 총합: 5050
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ IntStream
 * - int 타입 전용 스트림
 * - 성능이 최적화되어 있음 (Stream<Integer>보다 효율적)
 *
 * ■ IntStream.rangeClosed(1, 100)
 * - 1부터 100까지 **포함해서** 정수 스트림을 생성함
 *   (1, 2, 3, ..., 100)
 * - 참고: range(1, 100)은 1부터 99까지만 포함됨
 *
 * ■ sum()
 * - 스트림의 모든 요소를 더한 결과(int)를 반환하는 최종 연산 메서드
 * - IntStream에서만 사용 가능
 *
 * ■ 변수 sum
 * - main() 메서드 외부에 static 변수로 선언되어 있어 클래스 전체에서 사용 가능
 *
 * ■ System.out.println()
 * - 콘솔에 결과를 출력하는 기본 출력문
 * - 문자열 + 숫자 형식으로 출력 가능
 *
 * 🔁 전체 동작 요약:
 * 1. 1부터 100까지의 숫자 스트림을 만들고
 * 2. 그 숫자들을 전부 더한 값을 sum에 저장
 * 3. "총합: 5050"이라는 문자열로 출력
 */
