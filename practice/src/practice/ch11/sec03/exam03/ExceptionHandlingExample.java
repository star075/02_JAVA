package practice.ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 발생: " + e.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("NullPointerException 발생: " + e.getMessage());
        }
    }
}

/*
* ## ✅ 다중 예외 처리 - 한 catch에 여러 예외 묶기

---

### 📌 처리할 예외

- `ArrayIndexOutOfBoundsException`
- `NullPointerException`
- `NumberFormatException`

→ `NullPointerException`과 `NumberFormatException`은 **같은 방식으로 처리 가능**

---

### ✅ 핵심 문법

```java
catch (ExceptionType1 | ExceptionType2 e)
```

- `|`를 써야 함 (`||` ❌)
- 하나의 catch 블록으로 여러 예외를 처리할 수 있음

---

### ⚠️ 주의

| 잘못된 예시 | 이유 |
|-------------|------|
| `catch (A || B e)` | ❌ 조건 연산자 사용 → 문법 오류 |
| `catch (A | B e)`  | ✅ 올바른 다중 예외 처리 구문 |

---

### ✅ 활용 예시

```java
try {
    int value = Integer.parseInt(array[i]);
} catch (NullPointerException | NumberFormatException e) {
    System.out.println("null이거나 숫자 아님: " + e.getMessage());
}
```

---
* */