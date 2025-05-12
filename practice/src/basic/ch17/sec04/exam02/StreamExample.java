package basic.ch17.sec04.exam02;

import java.util.Arrays;                 // Arrays 클래스: 배열을 조작할 수 있게 도와주는 유틸리티 클래스
import java.util.stream.IntStream;       // IntStream: int 전용 스트림
import java.util.stream.Stream;          // Stream: 일반 객체 스트림 (예: String, Student 등)

public class StreamExample {
    public static void main(String[] args) {
        // 문자열 배열
        String[] strArray = { "홍길동", "신용권", "김미나" };
        // 정수 배열
        int[] intArray = { 1, 2, 3, 4, 5 };

        // 문자열 배열 → 스트림으로 변환해서 출력
        Stream<String> strStream = Arrays.stream(strArray);
        // Arrays.stream(strArray):
        // - String[] 배열을 Stream<String>으로 바꿔줌
        // - 이제 반복문 없이도 하나씩 꺼내서 처리 가능

        strStream.forEach(s -> System.out.print(s + ","));  // 홍길동,신용권,김미나,
        // forEach: 스트림 요소를 하나씩 꺼내서 출력

        System.out.println(); // 줄바꿈

        // 정수 배열 → IntStream으로 변환해서 출력
        IntStream intStream = Arrays.stream(intArray);
        // Arrays.stream(intArray):
        // - int[] 배열을 IntStream으로 바꿔줌
        // - IntStream은 성능이 더 좋은 숫자 전용 스트림

        intStream.forEach(n -> System.out.print(n + ","));  // 1,2,3,4,5,
    }
}

/*
 * ✅ [개념 요약]
 *
 * ■ Arrays.stream()
 * - 배열을 스트림으로 변환할 때 사용하는 메서드
 * - String[] → Stream<String>
 * - int[] → IntStream
 *
 * ■ forEach()
 * - 스트림의 요소를 하나씩 꺼내서 람다식으로 처리
 * - 여기선 각 요소를 출력함
 *
 * ■ IntStream vs Stream<T>
 * - IntStream: int 전용 스트림 (성능 최적화됨)
 * - Stream<T>: 일반 객체 스트림 (예: String, Student 등)
 *
 * ■ 출력 형식
 * - System.out.print(x + ",") 를 통해 콤마 붙여 출력
 */