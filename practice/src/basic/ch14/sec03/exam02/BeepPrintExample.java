package basic.ch14.sec03.exam02;

public class BeepPrintExample {
    public static void main(String[] args) {
        // 작업 쓰레드 생성 (Runnable 구현체를 넘김)
        Thread thread = new Thread(new RunnableClass());

        thread.start(); // 작업 스레드 실행 (Runnable 시작!)
        // 이때 진짜 새로운 쓰레드가 만들어져서 run()이 실행되는 것!

        // 메인 쓰레드에서 "띵" 출력
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500); // 0.5초 대기 (잠자기 시도)
            } catch (InterruptedException e) {
                e.printStackTrace(); // (자는 도중 누가 깨우면 여기로 와서 에러 출력)
            }
        }
    }
}

/*
Thread.sleep(500)
│
├── 정상: 0.5초 후 다음 코드 실행
│
└── 문제: 다른 쓰레드가 interrupt() 호출 → InterruptedException 발생 → catch로 점프
 */

/*
## ✅ 자바 쓰레드 개념 다시 정리

### ✨ try-catch, InterruptedException

- `Thread.sleep(500)` → 0.5초 동안 쓰레드 멈춤
- 누가 쓰레드를 강제로 깨우면 `InterruptedException` 발생
- try-catch를 이용해 예외를 처리함

```java
try {
    Thread.sleep(500);
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

---

### ✨ 쓰레드 실행 흐름

1. `Runnable` 객체로 "할 일" 작성
2. `Thread` 객체를 생성하면서 Runnable 넘김
3. `start()` 호출 → 새로운 쓰레드가 시작되고, `run()` 실행

---

### ✨ Thread vs thread

| 항목 | 의미 |
|------|------|
| `Thread` (대문자) | 자바 표준 클래스 이름 (설계도) |
| `thread` (소문자) | 내가 만든 쓰레드 객체(변수) 이름 |

---

### ✨ 메인 쓰레드란?

- `public static void main(String[] args)` 안의 코드가 **메인 쓰레드**로 자동 실행된다.
*/