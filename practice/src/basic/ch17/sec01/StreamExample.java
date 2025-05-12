package basic.ch17.sec01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;
public class StreamExample {

    /*
     * 스트림 개념
     * - 컬렉션(set, list), 배열 등의 데이터 소스를 자바에서 반복문 없이 편하게 다루기 위한 문법
     * - 스트림 구조: "스트림 생성 → 중간 연산 → 최종 연산"
     *
     * 스트림 특징
     * 1. 원본 데이터를 변경하지 않는다 (비파괴적)
     * 2. 일회용 → 한 번 사용 후 다시 생성 필요 (최종연산 이후에는 다시 스트림을 생성해야 함)
     * 3. 반복 처리를 내부적으로 수행 (반복문 직접 작성 안 함)
     * 4. 병렬처리가 가능하다. (parallelStream)
     * */
    public static void main(String[] args) {
        // HashSet 생성 (순서 없고, 중복 불가능한 집합)
        Set<String> set = new HashSet< >();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        System.out.println("----------향상된 for문 사용 -----------");
        for(String str : set) {
            System.out.println(str);
        }

        System.out.println("----------Stream 사용 -----------");
        // 스트림 생성
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name)); // 스트림 소비(출력)

        // 또는 바로 forEach 사용 (위와 동일한 결과)
        set.forEach(name -> System.out.println(name));


        System.out.println("----------Stream 사용2 -----------");
        // 스트림 메서드 체이닝 예시
        set.stream()
                .sorted(Comparator.reverseOrder()) // 문자열 역순(내림차순) 정렬 // 1단계: 역순 정렬
                .sorted() // 사전순, 오름차순 정렬 (기본값) // 2단계: 다시 기본 오름차순 정렬
                // 앞에서부터 크기만큼 자르기
                .limit(2) // 앞에서 2개만 출력
                .forEach(name -> System.out.println(name));
    }
}

/*
* ## ✅ 개념 요약

### 🔹 스트림 구조

| 단계        | 설명                           |
|-------------|--------------------------------|
| 스트림 생성 | `.stream()`                    |
| 중간 연산   | `.filter()`, `.map()`, `.sorted()` 등 |
| 최종 연산   | `.forEach()`, `.collect()`, `.count()` 등 |

---

### 🔹 주요 메서드

| 메서드           | 설명                                         |
|------------------|----------------------------------------------|
| `.stream()`       | 컬렉션 → 스트림으로 변환                    |
| `.forEach()`      | 요소 하나씩 꺼내서 작업 수행 (예: 출력)     |
| `.sorted()`       | 기본 정렬 (사전순 오름차순)                  |
| `.sorted(Comparator.reverseOrder())` | 내림차순 정렬            |
| `.limit(n)`       | 앞에서부터 n개만 선택                        |

---

### 🔹 결과 예시

> 결과는 `HashSet`이기 때문에 순서는 매번 바뀔 수 있음!

```
----------향상된 for문 사용 -----------
홍길동
감자바
신용권

----------Stream 사용 -----------
홍길동
감자바
신용권
홍길동
감자바
신용권

----------Stream 사용2 -----------
신용권
홍길동
```

※ `"Stream 사용2"`에서는 사전 역순 정렬 후 2개만 출력됨
* */