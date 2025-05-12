package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // 기본 정수 배열

        // ✅ 2의 배수 개수 구하기
        long count = Arrays.stream(arr)            // 배열을 IntStream으로 변환
                .filter(n -> n % 2 == 0)           // 2의 배수만 남김
                .count();                          // 개수 세기 (long 반환)
        System.out.println("2의 배수 개수: " + count);

        // ✅ 2의 배수 합 구하기
        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();                            // 총합 계산 (int 반환)
        System.out.println("2의 배수의 합: " + sum);

        // ✅ 2의 배수 평균 구하기
        OptionalDouble avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average();                        // 평균 계산 (OptionalDouble 반환)
        System.out.println("2의 배수의 평균: " + (avg.isPresent() ? avg.getAsDouble() : 0));
        // 값이 없을 경우 0 출력

        // ✅ 2의 배수 중 최대값
        OptionalInt max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max();                            // 최대값 (OptionalInt 반환)
        System.out.println("최대값: " + (max.isPresent() ? max.getAsInt() : "없음"));

        // ✅ 2의 배수 중 최소값
        OptionalInt min = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .min();                            // 최소값 (OptionalInt 반환)
        System.out.println("최소값: " + (min.isPresent() ? min.getAsInt() : "없음"));

        // ✅ 첫 번째 3의 배수 찾기
        OptionalInt first = Arrays.stream(arr)
                .filter(n -> n % 3 == 0)
                .findFirst();                      // 첫 번째로 조건에 맞는 값 찾기
        System.out.println("첫 번째 3의 배수: " + (first.isPresent() ? first.getAsInt() : "없음"));
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ Arrays.stream(arr)
 * - 배열을 스트림(IntStream)으로 변환하는 메서드
 * - 반복문 없이 배열을 처리할 수 있음
 *
 * ■ filter(조건)
 * - 조건에 맞는 요소만 남기는 중간 연산
 * - 예: n % 2 == 0 → 2의 배수만 남김
 *
 * ■ count()
 * - 스트림에 남은 요소 개수를 long 타입으로 반환
 *
 * ■ sum()
 * - 모든 요소를 더한 결과를 int로 반환
 *
 * ■ average()
 * - 평균을 계산해서 OptionalDouble로 반환
 * - 값이 없을 수도 있어서 껍데기로 감싸져 있음
 * - 꺼낼 때는 getAsDouble() + isPresent() 체크 필요
 *
 * ■ max() / min()
 * - 최대값/최소값을 OptionalInt로 반환
 * - 값이 없을 수도 있으므로 getAsInt() 전에 isPresent() 확인 필요
 *
 * ■ findFirst()
 * - 조건에 맞는 첫 번째 요소를 OptionalInt로 반환
 *
 * ✅ Optional 관련
 * - OptionalX는 값이 없을 수도 있는 상황에 안전하게 대처하기 위한 클래스
 * - isPresent(): 값 존재 여부 확인 (true/false)
 * - getAsXxx(): 실제 값 꺼내기
 *
 * ✅ 정리 요약
 * - IntStream은 기본형 int 처리를 위한 스트림
 * - 스트림은 한 번만 소비 가능 (재사용 불가)
 * - 최종 연산(count, sum, average, max, min, findFirst 등)은 스트림을 소모함
 */