package practice.ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }
    // 예외 던짐 (throws)
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2"); // 없는 클래스
    }
}

/*
* ## ✅ throws와 예외 처리 예제 정리

---

### 📦 문제 설명

- `Class.forName("클래스명")` → **없는 클래스일 경우 예외 발생**
- 이 예외는 **Checked Exception**이므로 `throws` 또는 `try-catch` 필요

---

### ✅ 정답 코드

```java
public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2"); // 존재하지 않음
    }
}
```

---

### ✅ 핵심 개념

| 키워드 | 의미 |
|--------|------|
| `throws` | 메서드가 예외를 던질 수 있음을 선언 |
| `Class.forName()` | 클래스 로딩 중 에러 발생 가능 (ClassNotFoundException) |
| `try-catch` | 호출한 쪽에서 예외를 안전하게 처리 |

---

✅ 이 문제는 **"예외를 던지고 처리하는 흐름"**을 이해하는 핵심 문제야!
* */

/*
* ## ✅ Checked Exception 정리

---

### 📌 Checked Exception이란?

> **컴파일 시점에 강제로 예외 처리를 요구하는 예외**

- 예외를 처리하지 않으면 **컴파일 오류 발생**
- `try-catch` 또는 `throws`로 반드시 처리 필요

---

### ✅ 대표 예시

- `ClassNotFoundException` ← `Class.forName()`
- `IOException` ← 파일 입출력
- `SQLException` ← 데이터베이스 처리

---

### ✅ 처리 방법 2가지

1. 직접 처리
```java
try {
    Class.forName("java.lang.String2");
} catch (ClassNotFoundException e) {
    System.out.println("클래스가 없습니다");
}
```

2. throws로 던지기
```java
public void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
}
```

---

### 📌 throws는 언제 쓰냐?

- 메서드 안에서 Checked Exception이 발생할 수 있는데
- 지금 처리하기 싫고 **호출한 쪽(main 등)**이 처리하게 하고 싶을 때!

---

💡 컴파일러가 "야, 이거 꼭 처리해!"라고 말하면 → Checked Exception!
* */