package advanced.ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};  // 정수 배열

        // ✅ 1. 정수 배열 → double로 변환 후 출력
        Arrays.stream(intArray)                 // IntStream 생성
                .asDoubleStream()              // IntStream → DoubleStream 변환
                .forEach(d -> System.out.println(d));  // 각 요소 출력 (소수형)

        System.out.println();

        // ✅ 2. 정수 배열 그대로 출력
        IntStream intStream = Arrays.stream(intArray);  // IntStream 생성
        intStream.forEach(n -> System.out.println(n));  // 각 요소 출력 (정수형)
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ Arrays.stream(intArray)
 * - 배열을 스트림으로 변환하는 방법
 * - 배열은 컬렉션이 아니므로 .stream() 불가 → 반드시 Arrays.stream() 사용
 *
 * ■ IntStream
 * - int 전용 스트림
 * - sum(), average(), max(), min() 등 숫자 전용 메서드 제공
 *
 * ■ asDoubleStream()
 * - IntStream → DoubleStream 변환
 * - 각 int 값에 .0을 붙여 실수화 (1 → 1.0)
 *
 * ■ forEach(람다)
 * - 스트림의 각 요소를 하나씩 꺼내서 작업 수행
 * - 스트림을 소비하는 최종 연산
 *
 * ■ 스트림은 일회용
 * - 한 번 사용하면 재사용 불가 → 다시 Arrays.stream(...) 호출 필요
 *
 * ✅ 배열 타입별 스트림 정리
 * | 배열 타입     | 생성되는 스트림       |
 * |---------------|------------------------|
 * | int[]         | IntStream              |
 * | double[]      | DoubleStream           |
 * | long[]        | LongStream             |
 * | String[], T[] | Stream<String>, etc.   |
 */