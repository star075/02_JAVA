package advanced.ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
* # ✅ MusicRunnable.java – 멀티 쓰레드 예제 (Runnable 구현)

---

## 📄 코드

```java
package advanced.ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

---

## 📚 개념 요약

---

### 🧩 Runnable이란?

- 쓰레드가 어떤 작업을 할지 정의하는 **인터페이스**
- 메서드는 단 하나 → `run()`
- 직접 실행은 못 하고, **Thread에 넘겨서 start()** 해야 함

---

### 🎯 실행 방법

```java
MusicRunnable musicRunnable = new MusicRunnable();
Thread thread = new Thread(musicRunnable);
thread.start(); // 새로운 쓰레드에서 run() 실행
```

---

### ✨ 흐름 요약

| 흐름 | 설명 |
|------|------|
| 1 | Runnable 인터페이스 구현 (`implements Runnable`) |
| 2 | run() 메서드에 작업 작성 |
| 3 | Thread 객체 생성할 때 Runnable 넘김 |
| 4 | thread.start() 호출해서 쓰레드 시작 |

---

## ✅ 최종 요약

> MusicRunnable 클래스는 Runnable 인터페이스를 구현하여
> run() 메서드에서 `"음악을 재생합니다."`를 0.5초 간격으로 6회 출력하는
> **멀티쓰레드용 작업 클래스**이다!
* */