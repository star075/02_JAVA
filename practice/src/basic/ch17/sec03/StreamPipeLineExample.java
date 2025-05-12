package basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        // List<Student> 형태로 학생 3명을 미리 리스트에 넣음
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. 스트림 단계별로 변수에 담아 처리

        // ⭐️ 1) List<Student> -> Stream<Student>로 변환
        Stream<Student> studentStream = list.stream();
        // 스트림: 리스트의 각 요소(학생 객체)를 하나씩 꺼낼 수 있게 해줌

        // 2) Student 객체에서 점수(score)만 뽑아서 IntStream으로 변환
        IntStream scoreStream = studentStream
                .mapToInt(s -> s.getScore());
        // mapToInt: 학생 → 정수 점수로 변환 (정수 스트림 IntStream이 생성됨)

        // Stream은 일회용! 이미 위에서 studentStream은 사용됐으므로 다시 사용할 수 없음
        // IntStream scoreStream2 = studentStream.mapToInt(s -> s.getScore()); ❌

        //  2. 평균 계산
        //  3) 평균을 계산 (average()) 하고 Optional에서 double 값을 꺼냄
        double avg1 = scoreStream
                .average()  // IntStream에서 평균을 계산 → OptionalDouble 반환

                // Optional(없을 경우에 대한 예외처리)
                .orElseThrow(() -> new IllegalStateException("점수가 없음"));
                // 값이 없으면 예외 발생 → 평균 구할 수 없으면 프로그램이 멈춤

        System.out.println("평균 점수 : " + avg1);


        //  ⭐️ 3. 파이프라인스타일 (메서드 체이닝)
        double avg2 = list.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .orElse(0.0); // 값이 없으면 기본값 0.0

        System.out.println("평균 점수 : " + avg2);

        // Stream 합치기
        Stream<Student> studentStream1 = list.stream(); // 기존 학생 리스트를 스트림으로 변환
        Stream<Student> studentStream2 = Stream.of(
                new Student("세종", 40),
                new Student("광종", 30)
        ); // 새로운 학생 2명을 직접 스트림으로 생성
        // Stream.of(...): 하나 이상의 값을 직접 넣어서 스트림을 만드는 방법

        // 두 스트림을 합침
        Stream<Student> concatStudent = Stream.concat(studentStream1, studentStream2);
        // 합쳐진 스트림의 요소를 출력
        concatStudent.forEach(student -> System.out.println(student));

    }
}

/*
 * ✅ [개념 정리] - 스트림 요소 처리 관련 핵심 용어
 *
 * ■ 1. Stream
 * - Java 8부터 도입된 데이터 처리 도구
 * - 리스트나 배열 같은 자료를 **하나씩 꺼내서 처리**할 수 있도록 해줌
 * - 반복문 없이도 필터링, 매핑, 집계 등을 쉽게 할 수 있음
 * - 스트림은 "중간 처리"와 "최종 처리" 단계로 나뉨
 *   - 중간 처리: map(), filter() 등 (스트림 반환)
 *   - 최종 처리: average(), sum(), collect() 등 (값 반환)
 *
 * ■ 2. mapToInt(함수)
 * - 스트림 요소들을 정수형(IntStream)으로 바꿔줌
 * - Student 객체에서 점수만 추출하고 싶을 때 사용
 *   예: mapToInt(s -> s.getScore())
 *
 * ■ 3. average()
 * - IntStream에서 평균값을 계산하는 메서드
 * - 결과를 double로 주지 않고, **OptionalDouble**로 감싸서 줌
 *   → 평균이 없을 수도 있으니까! (예: 빈 리스트)
 *
 * ■ 4. OptionalDouble
 * - "값이 있을 수도 있고, 없을 수도 있는" double 값의 껍데기
 * - 평균값처럼, **계산 결과가 없을 수도 있는 상황**에 사용됨
 * - 주요 메서드:
 *   - isPresent(): 값이 있으면 true
 *   - getAsDouble(): 값이 있으면 그 값을 꺼냄
 *   - orElse(기본값): 값이 없으면 기본값을 반환
 *
 * 예:
 * OptionalDouble avg = list.stream().mapToInt(...).average();
 * if (avg.isPresent()) {
 *     double result = avg.getAsDouble();
 * }
 *
 * ■ 5. getAsDouble()
 * - OptionalDouble에서 실제 double 값을 꺼내는 메서드
 * - 값이 없는데 호출하면 **NoSuchElementException** 발생함!
 * - 안전하게 쓰려면 isPresent()로 먼저 확인하거나, orElse() 쓰는 게 좋음
 *
 * 💡 보충 개념
 * - Optional<T> → 일반 객체용
 * - OptionalInt → int 전용
 * - OptionalDouble → double 전용
 * - OptionalLong → long 전용
 */


/*
* ■ 1. Stream
- Java 8부터 등장한 데이터 흐름 처리 도구
- 리스트/배열을 반복문 없이 처리 가능
- 비파괴적(원본 안 바꿈), 일회용(한 번 쓰면 못 씀)
- 구성: 생성 → 중간 연산 → 최종 연산

■ 2. mapToInt(함수)
- 요소를 정수형으로 변환
- 예: 학생 객체 → 점수만 추출 (IntStream으로 반환)

■ 3. average()
- IntStream에서 평균을 계산함
- 결과는 OptionalDouble로 감싸져 나옴 (값이 없을 수도 있으므로)

■ 4. OptionalDouble
- double 값이 존재할 수도/안 할 수도 있다는 걸 표현하는 클래스
- 주요 메서드:
  - getAsDouble(): 값이 있으면 꺼냄 (없으면 예외 발생)
  - orElse(기본값): 값이 없으면 기본값 반환
  - orElseThrow(): 값이 없으면 예외 발생
  - isPresent(): 값이 있는지 확인

■ 5. Stream.of(...)
- 배열이나 값들을 직접 전달해서 스트림 생성
- 예: Stream.of(1, 2, 3)

■ 6. Stream.concat(a, b)
- 두 스트림을 하나로 이어붙이는 메서드
- 예: Stream.concat(Stream.of(1,2), Stream.of(3,4)) → 1,2,3,4

■ 7. forEach(람다)
- 스트림의 요소를 하나씩 꺼내서 람다식으로 처리
- 최종 연산이며, 스트림을 "소비"함
* */