package basic.ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // ✅ 리스트 생성 및 요소 추가
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신민철");
        list.add("신용권");
        list.add("신용권");
        list.add("신민철");

        // ✅ 1. 전체 요소 출력 (중복 포함)
        list.stream() // 리스트를 스트림으로 변환
                .forEach(n -> System.out.println(n)); // 각 요소를 출력 (중복 허용)

        System.out.println();

        // ✅ 2. "신"으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("신")) // "신"으로 시작하는 문자열만 남김
                .forEach(n -> System.out.println(n)); // 필터링된 요소 출력

        System.out.println();

        // ✅ 3. 중복 제거 후, "신"으로 시작하는 요소만 필터링
        list.stream()
                .distinct()                          // 중복 제거 (equals 기준)
                .filter(n -> n.startsWith("신"))     // "신"으로 시작하는 요소만 필터링
                .forEach(n -> System.out.println(n)); // 최종 출력
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ list.stream()
 * - 리스트를 스트림으로 변환하여 요소를 하나씩 처리할 수 있게 함
 *
 * ■ forEach(n -> ...)
 * - 스트림의 최종 연산
 * - 각 요소를 꺼내서 주어진 작업(여기선 출력)을 수행
 *
 * ■ filter(조건식)
 * - 조건에 맞는 요소만 남기고 나머지는 제거
 * - 여기서는 n.startsWith("신") → 문자열이 "신"으로 시작하는지 검사
 *
 * ■ distinct()
 * - 스트림에서 중복된 요소를 제거
 * - 내부적으로 equals() 기준으로 중복 판단
 * - 순서 유지 O (처음 등장한 요소만 남김)
 *
 * 🔁 전체 동작 요약
 * 1. 스트림으로 변환 후 전체 요소 출력
 * 2. "신"으로 시작하는 요소만 필터링
 * 3. 중복 제거 + "신"으로 시작하는 요소 필터링
 *
 * ✅ 참고: startsWith("문자열")
 * - 문자열이 특정 접두사로 시작하는지 확인하는 메서드
 *   예: "신용권".startsWith("신") → true
 */