package practice.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // split 사용
        String data1 = "홍길동&이수홍,박연수";
        String[] names1 = data1.split("&|,"); // 둘 다 구분자로 사용
        System.out.println("split 결과:");
        for (String name : names1) {
            System.out.println(name);
        }

        // StringTokenizer 사용
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer tokenizer = new StringTokenizer(data2, "/");
        System.out.println("\nStringTokenizer 결과:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

/*
* ## ✅ split() vs StringTokenizer 예제 정리

---

### ✨ 목표

- `"홍길동&이수홍,박연수"` → `split()` 사용해서 이름 분리
- `"홍길동/이수홍/박연수"` → `StringTokenizer` 사용해서 이름 분리

---

### ✅ 코드 예시

```java
String data1 = "홍길동&이수홍,박연수";
String[] names = data1.split("&|,");
for (String name : names) {
    System.out.println(name);
}
```

```java
String data2 = "홍길동/이수홍/박연수";
StringTokenizer tokenizer = new StringTokenizer(data2, "/");
while (tokenizer.hasMoreTokens()) {
    System.out.println(tokenizer.nextToken());
}
```

---

### ✅ 결과

```
홍길동
이수홍
박연수
```

---

### 📌 차이점 요약

| 항목 | split() | StringTokenizer |
|------|---------|-----------------|
| 리턴 타입 | `String[]` 배열 | 토큰 반복자로 처리 |
| 구분자 | 정규표현식 사용 가능 (`&|,`) | 단일 문자 구분자만 가능 |
| 유연성 | 더 유연하고 강력 | 비교적 단순하지만 간단 |

---

💡 실무에서는 `split()`을 더 자주 사용하지만, `StringTokenizer`도 간단한 경우 편리!
* */