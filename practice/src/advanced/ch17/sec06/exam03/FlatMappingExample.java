package advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        // ✅ 1. 문장 리스트 생성
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        // ✅ 문장 스트림을 단어 스트림으로 변환 후 출력
        list1.stream()  // Stream<String> 생성
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                // flatMap:
                // - 각 문장을 단어로 쪼갠 배열(String[])
                // - 그 배열을 Stream<String>으로 변환
                // - 최종적으로 Stream<String>들을 납작하게 합침 (flat)
                .forEach(word -> System.out.println(word));  // 각 단어 출력

        System.out.println(); // 줄바꿈

        // ✅ 2. 문자열 숫자 리스트 생성
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");

        // ✅ 문자열 숫자 목록 스트림을 숫자 스트림으로 변환 후 출력
        list2.stream()  // Stream<String> 생성
                .flatMapToInt(str ->
                        Arrays.stream(str.split(","))       // "10, 20, 30" → ["10", "20", "30"]
                                .map(String::trim)            // 공백 제거: " 20" → "20"
                                .mapToInt(Integer::parseInt)) // 문자열 → 정수로 변환
                .forEach(num -> System.out.println(num)); // 각 숫자 출력
    }
}


/*
 * ✅ [개념 정리]
 *
 * ■ flatMap()
 * - 여러 개의 Stream을 하나의 Stream으로 "펼쳐(flat)"주는 중간 연산
 * - 예: List<String> → 각 String을 단어로 쪼개 → Stream<String>으로 합치기
 * - 결과: Stream<String>
 *
 * ■ flatMapToInt()
 * - flatMap과 유사하지만, 결과를 IntStream으로 납작하게 합침
 * - 예: "10, 20" → ["10", "20"] → [10, 20]
 * - 결과: IntStream
 *
 * ■ split(" ")
 * - 문자열을 구분자 기준으로 나눔 → 단어 배열 생성
 *
 * ■ Arrays.stream(배열)
 * - 배열을 스트림으로 바꿔줌 (String[] → Stream<String>)
 *
 * ■ map(String::trim)
 * - 문자열 앞뒤 공백 제거
 *
 * ■ mapToInt(Integer::parseInt)
 * - 문자열을 정수(int)로 변환
 *
 * ✅ 흐름 요약
 *
 * [문장 스트림]                     → ["this is java", "i am a best developer"]
 *   → flatMap + split(" ")        → "this", "is", "java", ..., "developer"
 *
 * [숫자 문자열 스트림]              → ["10, 20, 30", "40, 50"]
 *   → flatMapToInt + split(",")  → 10, 20, 30, 40, 50
 *
 * ✅ 결과적으로
 * - 중첩 구조 (배열/스트림)을 평탄한 하나의 스트림으로 만들어줌
 * - map은 구조가 남고, flatMap은 구조를 "펼침"
 */