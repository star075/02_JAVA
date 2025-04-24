package practice.ch11.sec02.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            // 다중 예외 처리문
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 범위 초과: " + e.getMessage());
            }
        }
    }
}

/*
* ## ✅ 다중 예외 처리 예제 정리

---

### 📌 문제 코드 요약

```java
String[] array = {"100", "loo"};

for (int i = 0; i <= array.length; i++) {
    int value = Integer.parseInt(array[i]);
    System.out.println("array[" + i + "]: " + value);
}
```

---

### ❗ 발생 가능한 예외 2가지

| 예외 이름 | 예외 상황 | 예시 |
|-----------|------------|------|
| `NumberFormatException` | 문자열을 숫자로 바꿀 수 없을 때 | `"loo"` |
| `ArrayIndexOutOfBoundsException` | 배열 범위를 벗어난 인덱스 접근 | `array[2]` |

---

### ❓ 왜 발생해?

1. `"loo"`는 숫자가 아니라서 → `Integer.parseInt("loo")`에서 오류
2. `i <= array.length` 조건으로 인해 → `i = 2`에서 `array[2]` 접근 시 오류

배열의 길이가 2라면 유효 인덱스는 `0`과 `1`뿐!

---

### ✅ 수정 + 예외 처리한 코드 (다중 catch)

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "loo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 범위 초과: " + e.getMessage());
            }
        }
    }
}
```

---

### 🧪 실행 결과

```
array[0]: 100
숫자 변환 불가: For input string: "loo"
배열 범위 초과: Index 2 out of bounds for length 2
```

---

### 💡 개념 요약

| 개념 | 설명 |
|------|------|
| **다중 예외 처리** | 여러 종류의 예외가 발생할 수 있을 때, 각각의 `catch` 블록으로 처리 |
| **예외 발생 순서** | try 블록 실행 도중 예외 발생 시, **해당 예외에 맞는 catch 블록으로 이동** |
| **배열 인덱스** | 인덱스는 `0 ~ length - 1`까지가 유효 |
| **`parseInt()` 주의** | 문자열이 숫자 형태가 아닐 경우 `NumberFormatException` 발생 |

---

### ✅ 예외 처리 시 팁

- 가능한 경우의 수를 생각하고, **예외를 예상해서 catch**로 대비하자
- 배열 접근할 땐 항상 `length` 조건 잘 확인
- 입력 값을 숫자로 바꿀 땐 `try-catch` 필수!

---

✅ 이 예제는 자바에서 흔히 발생하는 **기초 예외 2종**을 한꺼번에 연습할 수 있는 좋은 예제!
* */
