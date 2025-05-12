package advanced.ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        // Student 객체 리스트 생성 & Student 객체 3개를 리스트에 추가
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        // Stream으로 score 필드만 추출하여 출력
        studentList.stream() // Stream<Student> 생성
                .mapToInt(student -> student.getScore())  // Student 객체 → 점수(int)로 변환
                .forEach(score -> System.out.println(score));  // 각 점수 출력
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ stream()
 * - 리스트에서 스트림(Stream 객체)을 생성
 * - 스트림은 데이터를 하나씩 꺼내서 가공하거나 처리할 수 있게 해줌
 *
 * ■ mapToInt(student -> student.getScore())
 * - map 계열의 중간 연산 중 하나
 * - Student 객체 → int(점수)로 바꿔주는 변환 작업
 * - 결과: IntStream (int 전용 스트림, 성능 최적화)
 *
 * ■ forEach(score -> ...)
 * - 최종 연산
 * - 스트림의 요소를 하나씩 꺼내서 람다식으로 처리 (여기선 출력)
 *
 * ■ 전체 흐름 설명
 * 1. List<Student>를 스트림으로 변환
 * 2. mapToInt로 학생의 점수만 추출
 * 3. forEach로 각 점수를 출력
 *
 * ✅ 참고: map vs mapToInt
 * - map(): 일반 객체 변환용 (예: String → Integer 등)
 * - mapToInt(): int형 전용 필드를 다룰 때 사용 (IntStream 반환)
 *
 * ✅ 사용 예
 * studentList.stream()
 *     .mapToInt(s -> s.getScore())
 *     .average() / sum() / max() 등으로 확장 가능
 */