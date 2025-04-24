package practice.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println("[예외 발생] " + e.getMessage()); // 예외 발생 출력
            e.printStackTrace(); // 스택 추적 전체 출력
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");

        printLength("ThisIsJava");
        printLength(null); // 예외 발생 -> try-catch로 처리

        System.out.println("[프로그램 종료]");
    }
}

/* <위 코드의 문제점>
* data가 null일 경우 data.length() 실행 시 NullPointerException 발생
* 예외처리를 안 했기 때문에 프로그램이 멈추는 문제 발생
* printLength(null) 호출 → 예외 발생 → “프로그램 종료” 출력되지 않음
* */

/*
* ## ✅ 예외 처리 결과 정리 (`NullPointerException` 예시)

---

### 🔍 코드 요약

```java
public static void printLength(String data) {
    try {
        int result = data.length();
        System.out.println("문자 수: " + result);
    } catch (NullPointerException e) {
        System.out.println("예외 처리: " + e.getMessage());
        e.printStackTrace(); // 예외 발생 위치 추적
    }
}
```

---

### 🧪 실행 결과

```
문자 수: 10
예외 처리: Cannot invoke "String.length()" because "data" is null
[프로그램 종료]
java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
	at practice.ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:6)
	at practice.ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:18)
```

---

### ✅ 의미 요약

| 출력 | 의미 |
|------|------|
| `문자 수: 10` | 정상 입력 `"ThisIsJava"` 처리됨 |
| `예외 처리: ...` | 예외 메시지를 직접 출력 (`e.getMessage()`) |
| `printStackTrace()` 출력 | 예외가 발생한 **파일, 메서드, 줄 번호**를 모두 출력 |

---

### ❓ 예외 발생 위치 추적은 항상 맨 뒤에 나와?

> ✅ **맞아!**
- `e.printStackTrace();`를 호출하면 **그 시점 이후에 출력됨**
- 그래서 보통 `catch` 블록 **맨 마지막**에 넣어서 **에러 로그를 가장 마지막에 확인**하게 함

---

### 💡 참고 팁

- `e.getMessage()` → 에러 원인만 출력 (짧음)
- `e.printStackTrace()` → **어디서 문제가 터졌는지** 코드 위치까지 추적 가능
- 디버깅할 땐 `printStackTrace()`가 훨씬 중요함

---

✅ 예외 처리 잘 했고, 출력 결과도 정확하게 의도대로 나온 거야! 😎
*
* */