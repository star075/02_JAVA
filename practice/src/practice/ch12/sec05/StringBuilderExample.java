package practice.ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
    }
}
// 실행결과: ABCEF

/*
* ## ✅ StringBuilder 실행 결과 분석

---

### 📌 문제 코드

```java
String data = new StringBuilder()
    .append("DEF")
    .insert(0, "ABC")
    .delete(3, 4)
    .toString();

System.out.println(data);
```

---

### 🔍 동작 단계별 변화

1. append("DEF") → `"DEF"`
2. insert(0, "ABC") → `"ABCDEF"`
3. delete(3, 4) → `"ABCEF"` (index 3인 'D' 삭제)

---

### ✅ 최종 결과

```
ABCEF
```

---

### 🧠 참고 개념

| 메서드 | 설명 |
|--------|------|
| `append(String)` | 문자열 끝에 추가 |
| `insert(index, String)` | 해당 위치에 삽입 |
| `delete(start, end)` | start 이상 end 미만 구간 삭제 |
| `toString()` | 최종 문자열로 반환 |

---

💡 이런 방식은 문자열 조작을 많이 하는 알고리즘에서 **성능 효율**을 위해 자주 쓰임!
* */