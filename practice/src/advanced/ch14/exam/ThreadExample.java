package advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable musicRunnable = new MusicRunnable(); // Runnable 구현 객체 생성

        Thread musicThread = new Thread(musicRunnable); // Runnable 기반 쓰레드 생성
        Thread movieThread = new MovieThread(); // Thread 상속 기반 쓰레드 생성

        musicThread.start(); // musicRunnable의 run() 실행
        movieThread.start(); // MovieThread의 run() 실행
    }
}

/*
* # ✅ ThreadExample.java – 멀티 쓰레드 실행 예제

---

## 📄 코드

```java
package advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);
        Thread movieThread = new MovieThread();

        musicThread.start();
        movieThread.start();
    }
}
```

---

## 📚 개념 요약

---

### 🧩 Runnable 기반 쓰레드 생성

- Runnable 구현 객체 생성
- Thread 객체를 생성할 때 Runnable을 넘김
- Thread.start() 호출 → Runnable의 run() 실행

---

### 🧩 Thread 상속 기반 쓰레드 생성

- Thread를 상속한 클래스 직접 생성
- start() 호출 → 오버라이드한 run() 실행

---

### ✨ 실행 흐름

| 흐름 | 설명 |
|------|------|
| 1 | MusicRunnable 객체 생성 |
| 2 | MusicRunnable을 Thread에 넘김 |
| 3 | MovieThread 객체 생성 |
| 4 | 둘 다 start() 호출하여 멀티쓰레드 실행 |

---

## ✅ 최종 요약

> ThreadExample 클래스는 Runnable 구현 방식과 Thread 상속 방식을 모두 사용하여,
> 각각 음악 재생과 동영상 재생을 멀티쓰레드로 실행하는 프로그램이다!
* */